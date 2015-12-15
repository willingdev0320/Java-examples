// generics/CaptureConversion.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.

public class CaptureConversion {
  static <T> void f1(Holder<T> holder) {
    T t = holder.get();
    System.out.println(t.getClass().getSimpleName());
  }
  static void f2(Holder<?> holder) {
    f1(holder); // Call with captured type
  }
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    Holder raw = new Holder<>(1);
    // f1(raw); // Produces warnings
    f2(raw); // No warnings
    Holder rawBasic = new Holder();
    rawBasic.set(new Object()); // Warning
    f2(rawBasic); // No warnings
    // Upcast to Holder<?>, still figures it out:
    Holder<?> wildcarded = new Holder<>(1.0);
    f2(wildcarded);
  }
}
/* Output:
Integer
Object
Double
*/
