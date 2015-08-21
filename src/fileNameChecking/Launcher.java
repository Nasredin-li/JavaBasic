package fileNameChecking;

import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Launcher implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;

	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	File fileName;
	String path="f:/KINO/òóö/";
	public static void main(String[] args) {
		Launcher lau = new Launcher();
		lau.go();
		
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
		fileName= new File(path);
		if ("all".equals(event.getActionCommand())){
			
			
			renameToLatin(3);
			
			button1.setText("Ready!");
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
		}
		if ("similar to latin".equals(event.getActionCommand())){
			renameToLatin(1);
			button2.setText("changed!");
			button2.setEnabled(false);
			
		}
		if ("remove cyrillic".equals(event.getActionCommand())){
			renameToLatin(2);
			button3.setText("removed!");
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
		}
	}
	private void renameToLatin(int i) {
		for(String e: fileName.list()){
			String latinFileName = null;
			String file = e.substring(0, e.indexOf('.'));
			if(i==1){
				latinFileName = FileNameChecking.changeToLatin(file);
			}
			if(i==2){
				latinFileName = FileNameChecking.removeNonLatin(file);
			}
			if(i==3){
				latinFileName = FileNameChecking.removeNonLatin(FileNameChecking.changeToLatin(file));
			}
			new File(path+e).renameTo(new File(path +latinFileName+e.substring(e.indexOf('.'))));
		}
	}
	
}
