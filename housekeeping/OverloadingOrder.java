// housekeeping/OverloadingOrder.java
// �2015 MindView LLC: see Copyright.txt
// Overloading based on the order of the arguments.
import static com.mindviewinc.util.Print.*;

public class OverloadingOrder {
  static void f(String s, int i) {
    print("String: " + s + ", int: " + i);
  }
  static void f(int i, String s) {
    print("int: " + i + ", String: " + s);
  }
  public static void main(String[] args) {
    f("String first", 11);
    f(99, "Int first");
  }
}
/* Output:
String: String first, int: 11
int: 99, String: Int first
*/
