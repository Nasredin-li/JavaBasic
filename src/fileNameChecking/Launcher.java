package fileNameChecking;

public class Launcher {

	public static void main(String[] args) {
		String file="hjkk�";
		System.out.println(FileNameChecking.changeToLatin(file));
		System.out.println(FileNameChecking.isLatin(FileNameChecking.changeToLatin(file)));

	}

}
