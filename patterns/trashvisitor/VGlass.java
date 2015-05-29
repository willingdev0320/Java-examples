//: patterns/trashvisitor/VGlass.java
// �2015 MindView LLC: see Copyright.txt
// Glass for the visitor pattern.
package patterns.trashvisitor;
import patterns.trash.*;

public class VGlass extends Glass 
    implements Visitable {
  public VGlass(double wt) { super(wt); }
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
} ///:~
