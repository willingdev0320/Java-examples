// ui/FlowLayout1.java
// �2015 MindView LLC: see Copyright.txt
// Demonstrates FlowLayout.
import javax.swing.*;
import java.awt.*;
import static com.mindviewinc.util.SwingConsole.*;

public class FlowLayout1 extends JFrame {
  public FlowLayout1() {
    setLayout(new FlowLayout());
    for(int i = 0; i < 20; i++)
      add(new JButton("Button " + i));
  }
  public static void main(String[] args) {
    run(new FlowLayout1(), 300, 300);
  }
}
