package selfStudyJava.componentsGUI;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    public MyLabel() {
        this.setText("GOOD DAY!");
        this.setIcon(new ImageIcon("image.png"));
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(Color.BLUE);
        this.setFont(new Font ("MV Boli", Font.PLAIN, 25));
        this.setIconTextGap(50);
        this.setBackground(new Color(0xffccff));
        this.setOpaque(true);
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBounds(100, 60, 500, 350);
    }
}
