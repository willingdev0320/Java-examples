//: innerclasses/UnboundMethodReference.java
// Method reference without an object.
import java.util.*;
import java.util.function.*;
import static net.mindview.util.Print.*;

class X {
  String f() { return "X.f()"; }
}

public class UnboundMethodReference {
  public static void main(String[] args) {
    Function<String, Integer> len = String::length;
    print(len.apply("UnboundMethodReference"));

    List<String> words = 
      Arrays.asList("Rain", "Spain", "Plain");
    words.forEach(System.out::println);

    Function<X, String> xfr = X::f;
    print(xfr.apply(new X()));
  }
} ///:~
