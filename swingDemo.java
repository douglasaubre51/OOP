import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class swingDemo{
    public static void main(String[] args){
        //create new frame
        JFrame jFrame=new JFrame("swing gui demo");

        //set layout null right after creating a frame!
        jFrame.setLayout(null);

        //set an operation on close event
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set frame size
        jFrame.setSize(500,500);

        //name label
        JLabel nameLabel=new JLabel("Name:");
        //set size
        nameLabel.setBounds(0,0,200,25);
        //add to frame
        jFrame.add(nameLabel);

        //create textfield
        JTextField jTextField=new JTextField(20);
        //set size
        jTextField.setBounds(100,0,200,25);
	//listener
	jTextField.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e){
				System.out.println("key pressed: "+e.getKeyChar());
			}

			public void keyReleased(KeyEvent e){
				System.out.println("key released: "+e.getKeyChar());
			}

			public void keyTyped(KeyEvent e){
				System.out.println("key typed: "+e.getKeyChar());
			}
	});

        //add to frame
        jFrame.add(jTextField);

        //create label
        JLabel selectGenderLabel=new JLabel("select your gender:");
        selectGenderLabel.setBounds(0,20,200,25);
        jFrame.add(selectGenderLabel);

        //create radio buttons
        JRadioButton maleRadioButton=new JRadioButton("Male");
        JRadioButton femaleRadioButton=new JRadioButton("Female");
        JRadioButton transgenderRadioButton=new JRadioButton("Trans");
        //set size 
        maleRadioButton.setBounds(160,20,80,25);
        femaleRadioButton.setBounds(240,20,80,25);
        transgenderRadioButton.setBounds(340,20,80,25);

        //group radio buttons
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderGroup.add(transgenderRadioButton);

        //add radiobuttons to frame
        jFrame.add(maleRadioButton);
        jFrame.add(femaleRadioButton);
        jFrame.add(transgenderRadioButton);

        //create select lang label
        JLabel selectLanguageLabel=new JLabel("select your languages:");
        //set size
        selectLanguageLabel.setBounds(0,40,200,25);
        //add to frame
        jFrame.add(selectLanguageLabel);

        //create new checkbox
        JCheckBox englishCheckBox=new JCheckBox("english");
        JCheckBox hindiCheckBox=new JCheckBox("hindi");
        JCheckBox malayalamCheckBox=new JCheckBox("malayalam");
        //set checkbox size
        englishCheckBox.setBounds(170,40,100,25);
        hindiCheckBox.setBounds(270,40,100,25);
        malayalamCheckBox.setBounds(370,40,150,25);
        //add checkbox to frame
        jFrame.add(englishCheckBox);
        jFrame.add(hindiCheckBox);

	//action event listener
	malayalamCheckBox.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e){
			if(malayalamCheckBox.isSelected()){
				System.out.println("checkox checked!");
			}
			else{
				System.out.println("checkox unchecked!");
			}
		}
	});

        jFrame.add(malayalamCheckBox);

        //create select label 
        JLabel selectDepartment=new JLabel("select department:");
        selectDepartment.setBounds(0,100,160,25);
        jFrame.add(selectDepartment);

        //create dropdownlist
        String[] departments={"CT","ME","EEE","EE"};
        JComboBox<String> departmentComboBox=new JComboBox<String>(departments);
        departmentComboBox.setBounds(200,100,100,25);
	//action listener
	departmentComboBox.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("action listener selected : "+departmentComboBox.getSelectedItem());
		}
	});

        jFrame.add(departmentComboBox);

	//submit button
	JButton submitBtn=new JButton("submit");
	submitBtn.setBounds(0,150,100,25);

	submitBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(jFrame,"form submitted successfully!");
		}
	});

	submitBtn.addMouseListener(new MouseAdapter(){
		public void mousePressed(MouseEvent e){
			System.out.println("mouse clicked the button");
		}

		public void mouseEntered(MouseEvent e){
			System.out.println("mouse entered the button");
		}

		public void mouseExited(MouseEvent e){
			System.out.println("mouse exited the button");
		}
	});



	jFrame.add(submitBtn);

        //set visible always come last
        jFrame.setVisible(true);
    }
}
