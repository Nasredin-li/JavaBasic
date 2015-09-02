package slider;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import javax.swing.JFileChooser;

import com.sun.java_cup.internal.runtime.Scanner;

public class FileChooser {
	public static void main(String args[]) {
		JFileChooser chooser = new JFileChooser();
		FileReader reader = null;
		
		int result = chooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			try {
				reader = new FileReader(file);
			} catch (IOException io) {
				System.out.println("File not found");
			}

		}

	}
}