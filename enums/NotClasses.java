//: enums/NotClasses.java
// �2015 MindView LLC: see Copyright.txt
// {Exec: javap -c LikeClasses}
import static com.mindviewinc.util.Print.*;

enum LikeClasses {
  WINKEN {
    @Override
    void behavior() { print("Behavior1"); }
  },
  BLINKEN {
    @Override
    void behavior() { print("Behavior2"); }
  },
  NOD {
    @Override
    void behavior() { print("Behavior3"); }
  };
  abstract void behavior();
}

public class NotClasses {
  // void f1(LikeClasses.WINKEN instance) {} // Nope
} /* Output: (First 12 Lines)
Compiled from "NotClasses.java"
abstract class LikeClasses extends
java.lang.Enum<LikeClasses> {
  public static final LikeClasses WINKEN;
  public static final LikeClasses BLINKEN;
  public static final LikeClasses NOD;
  public static LikeClasses[] values();
    Code:
       0: getstatic     #2                  // Field
$VALUES:[LLikeClasses;
       3: invokevirtual #3                  // Method
"[LLikeClasses;".clone:()Ljava/lang/Object;
                  ...
*///:~
