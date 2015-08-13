package fileNameChecking;

import java.io.File;

public class Launcher {

	public static void main(String[] args) {
		File fileName= new File("F:\\JAVA\\lesson16");
		System.out.println(fileName.getName());
		System.out.println(fileName.isDirectory());
		
		System.out.println(fileName.list()[3]);
		
		
		String file=(fileName.list()[3]).substring(0, (fileName.list()[3]).indexOf('.'));
		System.out.println(FileNameChecking.changeToLatin(file));
		System.out.println(FileNameChecking.isLatin(FileNameChecking.changeToLatin(file)));
		System.out.println(FileNameChecking.latinFileName);
		
		new File("F:\\JAVA\\lesson16\\"+fileName.list()[3]).renameTo(new File("F:\\JAVA\\lesson16\\"+FileNameChecking.latinFileName+".ai"));
	}

}
