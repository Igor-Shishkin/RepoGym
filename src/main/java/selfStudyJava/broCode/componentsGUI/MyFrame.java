package selfStudyJava.componentsGUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button;
    public MyFrame () {

        button = new JButton();
        button.setBounds(180,280,130,40);
        button.isVisible();
        button.setText("PRESS!");
        button.addActionListener(e -> System.out.println("Boo"));
        button.setFont(new Font("HANGING_BASELINE", Font.BOLD, 13));
        button.setFocusable(false);
        button.setIcon(new ImageIcon("icons_bishop2.png"));
        button.setIconTextGap(20);
        button.setBackground(new Color(0xFFAFAFAF, true));
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setTitle("Title is here.");
        this.setSize(700,430);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon imageTree = new ImageIcon("tree-of-life.png");
        this.setIconImage(imageTree.getImage());
        this.getContentPane().setBackground(new Color(230,242,255));

        this.add(button);


    }


}
