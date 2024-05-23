package sda.selfStudyJava.broCode.componentsGUI;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameJ {
    public static void main(String[] args) {

        Border border2 = BorderFactory.createDashedBorder (Color.RED, 4,10);
        ImageIcon horse = new ImageIcon("icons_chess.png");

        //JLabel label = new MyLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        label3.setIcon(horse);
        label3.setText("This is a HORSE");
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.BOTTOM);
        label3.setBounds(35,50,150,80);
        label3.setFont(new Font ("MV Boli", Font.BOLD, 14));

        JPanel redPanel1 = new JPanel();
        redPanel1.setBackground(new Color (0x410101));
        redPanel1.setBounds(0,0,300,25);
        JPanel redPanel2 = new JPanel();
        redPanel2.setBackground(new Color (0x410101));
        redPanel2.setBounds(400,370,300,25);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(100,60,200,200);
        bluePanel.setLayout(null);
        bluePanel.add(label3);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(270,60,200,200);
        //greenPanel.add(label3);

        label2.setBorder(border2);
        label2.setBounds(90,50, 530, 290);

        MyFrame myFrame = new MyFrame();
        //myFrame.add(label);
        myFrame.add(label2);
        myFrame.add(redPanel1);
        myFrame.add(redPanel2);
        myFrame.add(bluePanel);
        myFrame.add(greenPanel);
        myFrame.setLayout(null);
    }
}
