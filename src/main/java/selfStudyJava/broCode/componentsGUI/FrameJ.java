package selfStudyJava.broCode.componentsGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameJ {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame();
        frame.setTitle("Title is here.");
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageTree = new ImageIcon("tree-of-life.png");
        frame.setIconImage(imageTree.getImage());
        frame.getContentPane().setBackground(new Color(230,242,255));
         */
        ImageIcon image = new ImageIcon("src/additionalFiles/image.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE);

        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        label.setText("GOOD DAY!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setFont(new Font ("MV Boli", Font.PLAIN, 25));
        label.setIconTextGap(50);
        label.setBackground(new Color(0xffccff));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100, 60, 500, 350);

        label2.setBorder(border);
        label2.setBounds(90,40, 550, 400);

        MyFrame myFrame = new MyFrame();
        myFrame.add(label);
        myFrame.add(label2);
        myFrame.setLayout(null);
    }
}