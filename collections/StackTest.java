// collections/StackTest.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
import java.util.*;

public class StackTest {
  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>();
    for(String s : "My dog has fleas".split(" "))
      stack.push(s);
    while(!stack.isEmpty())
      System.out.print(stack.pop() + " ");
  }
}
/* Output:
fleas has dog My
*/
