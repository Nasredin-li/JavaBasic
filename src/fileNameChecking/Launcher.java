package fileNameChecking;

import java.io.File;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Launcher implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;
	JRadioButton radioButton;
	JRadioButton radioButton2;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;

	public static void main(String[] args) {
		Launcher lau = new Launcher();
		lau.go();
		File fileName= new File("F:\\JAVA\\lesson16");
		System.out.println(fileName.getName());
		System.out.println(fileName.isDirectory());
		
		System.out.println(fileName.list()[3]);
		
		
		String file=(fileName.list()[3]).substring(0, (fileName.list()[3]).indexOf('.'));
		System.out.println(FileNameChecking.changeToLatin(file));
		System.out.println(FileNameChecking.isLatin(FileNameChecking.changeToLatin(file)));
		System.out.println(FileNameChecking.latinFileName);
		
		new File("F:\\JAVA\\lesson16\\"+fileName.list()[3]).renameTo(new File("F:\\JAVA\\lesson16\\"+FileNameChecking.latinFileName+".txt"));
		
		
	}
	private void go() {
		JFrame frame= new JFrame("CHEK FILE NAMES FOR NON-LATIN SYMBOL");
		button1 = new JButton("Chek & change cyrillic symbol similar to latin, & Remove cyrillic");
		button2 = new JButton("Chek & change cyrillic symbol similar to latin");
		button3 = new JButton("Remove cyrillic symbol");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		panel1= new JPanel();
		panel2= new JPanel();
		panel3= new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 120);
		
		frame.getContentPane().add(BorderLayout.NORTH,panel3);
		frame.getContentPane().add(BorderLayout.SOUTH, panel2);
		frame.getContentPane().add(BorderLayout.CENTER,panel1);
		panel1.add(BorderLayout.WEST, button2);
		panel1.add(BorderLayout.EAST, button3);
		panel1.setSize(450, 100);
		panel2.add(BorderLayout.CENTER, button1);
		panel2.setSize(450, 100);
		panel3.setSize(450, 100);
		
		
		button1.setSize(300, 50);
		button2.setSize(150,50);
		button3.setSize(150, 50);
		
		button1.setActionCommand("all");
		button2.setActionCommand("similar to latin");
		button3.setActionCommand("remove cyrillic");
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if ("all".equals(event.getActionCommand())){
			//TO DO
			button1.setText("Ready!");
		}
		if ("similar to latin".equals(event.getActionCommand())){
			//TO DO
			button2.setText("changed!");
		}
		if ("remove cyrillic".equals(event.getActionCommand())){
			//TO DO
			button3.setText("removed!");
		}
	}
	
}
