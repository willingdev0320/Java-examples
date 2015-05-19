//: patterns/StateDemo.java
// Simple demonstration of the State pattern.
import static net.mindview.util.Print.*;

interface StateBase {
  void f();
  void g();
  void h();
  void changeImp(StateBase newImp);
}

class State implements StateBase {
  private StateBase implementation;
  public State(StateBase imp) {
    implementation = imp;
  }
  @Override
  public void changeImp(StateBase newImp) {
    implementation = newImp;
  }
  // Pass method calls to the implementation:
  @Override
  public void f() { implementation.f(); }
  @Override
  public void g() { implementation.g(); }
  @Override
  public void h() { implementation.h(); }
}

class Implementation1 implements StateBase {
  @Override
  public void f() {
    print("Implementation1.f()");
  }
  @Override
  public void g() {
    print("Implementation1.g()");
  }
  @Override
  public void h() {
    print("Implementation1.h()");
  }
  @Override
  public void changeImp(StateBase newImp) {}
}

class Implementation2 implements StateBase {
  @Override
  public void f() {
    print("Implementation2.f()");
  }
  @Override
  public void g() {
    print("Implementation2.g()");
  }
  @Override
  public void h() {
    print("Implementation2.h()");
  }
  @Override
  public void changeImp(StateBase newImp) {}
}

public class StateDemo {
  static void test(StateBase b) {
    b.f();
    b.g();
    b.h();
  }
  public static void main(String args[]) {
    StateBase b =
      new State(new Implementation1());
    test(b);
    b.changeImp(new Implementation2());
    test(b);
  }
} ///:~
