// concurrency/ActiveObjectDemo.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// Can only pass constants, immutables, "disconnected
// objects," or other active objects as arguments
// to asynch methods.
import java.util.concurrent.*;
import java.util.*;

public class ActiveObjectDemo {
  private ExecutorService ex =
    Executors.newSingleThreadExecutor();
  private Random rand = new Random(47);
  // Insert a random delay to produce the effect
  // of a calculation time:
  private void pause(int factor) {
    try {
      TimeUnit.MILLISECONDS.sleep(
        100 + rand.nextInt(factor));
    } catch(InterruptedException e) {
      System.out.println("sleep() interrupted");
    }
  }
  public Future<Integer>
  calculateInt(final int x, final int y) {
    return ex.submit(() -> {
      System.out.println("starting " + x + " + " + y);
      pause(500);
      return x + y;
    });
  }
  public Future<Float>
  calculateFloat(final float x, final float y) {
    return ex.submit(() -> {
      System.out.println("starting " + x + " + " + y);
      pause(2000);
      return x + y;
    });
  }
  public void shutdown() { ex.shutdown(); }
  public static void main(String[] args) {
    ActiveObjectDemo d1 = new ActiveObjectDemo();
    // Prevents ConcurrentModificationException:
    List<Future<?>> results =
      new CopyOnWriteArrayList<>();
    for(float f = 0.0f; f < 1.0f; f += 0.2f)
      results.add(d1.calculateFloat(f, f));
    for(int i = 0; i < 5; i++)
      results.add(d1.calculateInt(i, i));
    System.out.println("All asynch calls made");
    while(results.size() > 0) {
      for(Future<?> f : results)
        if(f.isDone()) {
          try {
            System.out.println(f.get());
          } catch(InterruptedException |
                  ExecutionException e) {
            throw new RuntimeException(e);
          }
          results.remove(f);
        }
    }
    d1.shutdown();
  }
}
/* Output:
starting 0.0 + 0.0
All asynch calls made
0.0
starting 0.2 + 0.2
0.4
starting 0.4 + 0.4
0.8
starting 0.6 + 0.6
1.2
starting 0.8 + 0.8
1.6
starting 0 + 0
starting 1 + 1
0
2
starting 2 + 2
4
starting 3 + 3
6
starting 4 + 4
8
*/
