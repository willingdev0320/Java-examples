//: containers/StackTest.java
// �2015 MindView LLC: see Copyright.txt
import com.mindviewinc.util.*;

public class StackTest {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    for(String s : "My dog has fleas".split(" "))
      stack.push(s);
    while(!stack.empty())
      System.out.print(stack.pop() + " ");
  }
} /* Output:
fleas has dog My
*///:~
