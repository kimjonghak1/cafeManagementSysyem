package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CafeAdder extends JPanel{ 
	
	WindowFrame frame;
	
	public CafeAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelMenu = new JLabel("Menu : ", JLabel.TRAILING);
		JTextField fieldMenu = new JTextField(10);
		labelMenu.setLabelFor(fieldMenu);
		panel.add(labelMenu);
		panel.add(fieldMenu);
		
		JLabel labelPrice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelPhone = new JLabel("Telephone : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelLocation = new JLabel("Location : ", JLabel.TRAILING);
		JTextField fieldLocation = new JTextField(10);
		labelLocation.setLabelFor(fieldLocation);
		panel.add(labelLocation);
		panel.add(fieldLocation);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}

}
