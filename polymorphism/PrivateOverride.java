// polymorphism/PrivateOverride.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// Trying to override a private method
// {main: polymorphism.PrivateOverride}
package polymorphism;

public class PrivateOverride {
  private void f() { System.out.println("private f()"); }
  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }
}

class Derived extends PrivateOverride {
  public void f() { System.out.println("public f()"); }
}
/* Output:
private f()
*/
