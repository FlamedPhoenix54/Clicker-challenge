import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    JFrame main = new JFrame();
    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    main.setSize(300, 200);

    Container content = main.getContentPane();
    content.setLayout(null);
    
    JButton button = new JButton();
    button.setBounds(0, 0, 300, 25);

    content.add(button);

    main.setVisible(true);
  }
}
