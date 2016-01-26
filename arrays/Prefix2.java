// arrays/Prefix2.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
import java.util.*;
import onjava.*;
import static onjava.ArrayShow.*;

public class Prefix2 {
  public static void main(String[] args) {
    String[] strings = new Rand.String(1).array(8);
    show(strings);
    Arrays.parallelPrefix(strings, (a, b) -> a + b);
    show(strings);
  }
}
/* Output:
[b, t, p, e, n, p, c, c]
[b, bt, btp, btpe, btpen, btpenp, btpenpc, btpenpcc]
*/
