package borderlyout;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLyout {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BorderLayout Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(100, 100, 600, 600);
    Container container = frame.getContentPane();

    // Add a button to each of the five areas of the BorderLayout
    container.add(new JButton("North"), BorderLayout.NORTH);
    container.add(new JButton("South"), BorderLayout.SOUTH);
    container.add(new JButton("East"), BorderLayout.EAST);
    container.add(new JButton("West"), BorderLayout.WEST);
    container.add(new JButton("Center"), BorderLayout.CENTER);

    frame.setVisible(true);
  }
}