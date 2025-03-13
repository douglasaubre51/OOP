import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class AyaneUI{
	public static void main(String[] args){
		System.out.println("starting AyaneUI...");

		JFrame jFrame=new JFrame("Ayane - Realtime Video Calling App");

		jFrame.setLayout(null);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jFrame.setSize(800,800);
		jFrame.setVisible(true);
	}
}
