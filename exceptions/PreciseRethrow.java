// exceptions/PreciseRethrow.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.

class BaseException extends Exception {}
class DerivedException extends BaseException {}

public class PreciseRethrow {
  void catcher() throws DerivedException {
    try {
      throw new DerivedException();
    } catch(BaseException e) {
      throw e;
    }
  }
}
