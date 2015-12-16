// logging/LogToFile.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// {ErrorOutputExpected}
import java.util.logging.*;

public class LogToFile {
  private static Logger logger =
    Logger.getLogger("LogToFile");
  public static void
  main(String[] args) throws Exception {
    logger.addHandler(
      new FileHandler("LogToFile.xml"));
    logger.info("A message logged to the file");
  }
}
/* Output:
___[ Error Output ]___
Dec 15, 2015 9:58:43 PM LogToFile main
INFO: A message logged to the file
___[ Error Output is Expected ]___
*/
