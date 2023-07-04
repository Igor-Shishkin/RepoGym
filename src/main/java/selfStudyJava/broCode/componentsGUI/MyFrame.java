package selfStudyJava.broCode.componentsGUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame () {
        this.setTitle("Title is here.");
        this.setSize(700,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageTree = new ImageIcon("src/additionalFiles/tree-of-life.png");
        this.setIconImage(imageTree.getImage());
        this.getContentPane().setBackground(new Color(230,242,255));
    }
}