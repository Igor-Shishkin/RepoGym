package selfStudyJava.broCode.componentsGUI;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.*;

public final class BorderLayoutExample {
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(BorderLayoutExample::createAndShowGUI);
	}

	private static void createAndShowGUI() {
		final JFrame frame = new JFrame("BorderLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(100, 9));

		final JPanel mainPanel = new JPanel(new BorderLayout());
		// Add components using BorderLayout constraints
		mainPanel.add(new JLabel("Name:"), BorderLayout.WEST);
		mainPanel.add(new JTextField(20), BorderLayout.CENTER);

		final JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		southPanel.add(new JLabel("Age:"));
		southPanel.add(new JTextField(5));
		southPanel.add(new JLabel("Gender:"));
		southPanel.add(new JComboBox<>(new String[]{"Male", "Female"}));

		mainPanel.add(southPanel, BorderLayout.SOUTH);
		mainPanel.add(topPanel, BorderLayout.NORTH);

		frame.add(mainPanel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
