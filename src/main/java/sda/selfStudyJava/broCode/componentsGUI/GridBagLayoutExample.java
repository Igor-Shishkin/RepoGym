package sda.selfStudyJava.broCode.componentsGUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public final class GridBagLayoutExample {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(GridBagLayoutExample::createAndShowGUI);
	}

	private static void createAndShowGUI() {
		final JFrame frame = new JFrame("GridBagLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(400, 300));
		mainPanel.setLayout(new GridBagLayout());
		final GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;

		// Add components using GridBagLayout constraints
		constraints.gridx = 0;
		constraints.gridy = 0;
		mainPanel.add(new JLabel("Name:"), constraints);

		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		mainPanel.add(new JTextField(20), constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		mainPanel.add(new JLabel("Age:"), constraints);

		constraints.gridx = 1;
		constraints.gridy = 1;
		mainPanel.add(new JTextField(5), constraints);

		constraints.gridx = 2;
		constraints.gridy = 1;
		mainPanel.add(new JLabel("        Gender:"), constraints);

		constraints.gridx = 3;
		constraints.gridy = 1;
		mainPanel.add(new JComboBox<>(new String[]{"Male", "Female"}), constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 4;
		mainPanel.add(new JSeparator(), constraints);

		constraints.gridx = 0;
		constraints.gridy = 4;
		JButton button = new JButton("Submit");
		button.setPreferredSize(new Dimension(350, 50));
		mainPanel.add(button, constraints);

		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		mainPanel.add(new JButton("Cancel"), constraints);

		constraints.gridx = 2;
		constraints.gridy = 3;
		mainPanel.add(new JButton("Reset"), constraints);

		frame.add(mainPanel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
