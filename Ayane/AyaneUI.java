import javax.swing.*;
import java.awt.*;

public class AyaneUI {
	public static void main(String[] args) {
		System.out.println("starting AyaneUI...");

		// set up jframe
		JFrame jFrame = new JFrame("Ayane - Realtime Video Calling App");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500, 500);

		// write java ui here

		// center layout
		JPanel jPanel = new JPanel(new GridBagLayout());
		jFrame.add(jPanel);

		// heading
		JLabel h1Label = new JLabel("Login");
		h1Label.setFont(new Font("Cascadia Code", Font.BOLD, 45));

		GridBagConstraints h1gbc = new GridBagConstraints();
		h1gbc.gridx = 0;
		h1gbc.gridy = 0;

		jPanel.add(h1Label, h1gbc);

		// name
		JLabel nameLabel = new JLabel("Name");
		GridBagConstraints nameLabelgbc = new GridBagConstraints();
		nameLabelgbc.gridx = 0;
		nameLabelgbc.gridy = 1;

		jPanel.add(nameLabel, nameLabelgbc);

		// submit button
		JButton submitBtn = new JButton("submit");

		GridBagConstraints submitBtngbc = new GridBagConstraints();
		submitBtngbc.gridx = 0;
		submitBtngbc.gridy = 3;

		jPanel.add(submitBtn, submitBtngbc);

		// to show app
		jFrame.setVisible(true);
	}
}
