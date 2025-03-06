import javax.swing.*;
//add event else it will throw Action class symbol not found error
import java.awt.event.*;

public class submitDemo{
	public static void main(String[] args){
		//create new frame
		JFrame jFrame=new JFrame("submit gui  demo");
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(300,300);

		JButton submitBtn=new JButton("click me");
		submitBtn.setBounds(0,0,100,25);
		//action listener
		submitBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(jFrame,"hello world");
			}
		});

		jFrame.add(submitBtn);

		jFrame.setVisible(true);
	}
}
