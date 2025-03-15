import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AyaneUI {
	public static void main(String[] args) {
		System.out.println("starting AyaneUI...");

		// set up jframe
		JFrame jFrame = new JFrame("Ayane - Realtime Video Calling App");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500, 500);

		// write java ui here
		// layout
		JPanel jPanel = new JPanel(new GridBagLayout());
		jFrame.add(jPanel);

		// heading
		JLabel h1Label = new JLabel("Create New Account");
		h1Label.setFont(new Font("Cascadia Code", Font.BOLD, 25));

		GridBagConstraints h1gbc = new GridBagConstraints();
		h1gbc.gridx = 0;
		h1gbc.gridy = 0;

		jPanel.add(h1Label, h1gbc);

		// name box
		JTextField nameBox=new JTextField(15);
		nameBox.setText("name");

		GridBagConstraints nameBoxgbc=new GridBagConstraints();
		nameBoxgbc.gridx=0;
		nameBoxgbc.gridy=1;
		jPanel.add(nameBox,nameBoxgbc);

		// email box
		JTextField emailBox=new JTextField(15);
		emailBox.setText("email");

		GridBagConstraints emailBoxgbc=new GridBagConstraints();
		emailBoxgbc.gridx=0;
		emailBoxgbc.gridy=2;
		jPanel.add(emailBox,emailBoxgbc);

		// password box
		JTextField passwordBox=new JTextField(15);
		passwordBox.setText("password");

		GridBagConstraints passwordBoxgbc=new GridBagConstraints();
		passwordBoxgbc.gridx=0;
		passwordBoxgbc.gridy=3;
		jPanel.add(passwordBox,passwordBoxgbc);

		// submit button
		JButton submitBtn = new JButton("submit");

		GridBagConstraints submitBtngbc = new GridBagConstraints();
		submitBtngbc.gridx = 0;
		submitBtngbc.gridy = 4;
		jPanel.add(submitBtn, submitBtngbc);

		// to display app window
		jFrame.setVisible(true);
		System.out.println("ayane is running!...");
	}
}
