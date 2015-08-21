package gui;

public class FileNameChecking {

	private static final String LATIN_SYMBOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_@&$#~(){}1234567890";
	private static final String NOT_LATIN_SYMBOL = "ÀÂÑÅÍ²ÊÌÎÐÒÕÓÇàñå³êìîðõó¹ ";
	private static final String SHORT_LATIN_SYMBOL = "ABCEHIKMOPTXY3aceikmopxyN_";

	public static String changeToLatin(String fileName2) {
		StringBuilder fileNameChanged = new StringBuilder();
		for (char e : fileName2.toCharArray()) {
			for (char b : NOT_LATIN_SYMBOL.toCharArray()) {
				if (e == b) {
					e = SHORT_LATIN_SYMBOL.charAt(NOT_LATIN_SYMBOL.indexOf(e));
				}
			}
			fileNameChanged.append(e);
		}
		return fileNameChanged.toString();
	}

	public static String removeNonLatin(String fileName) {
		StringBuilder latinFileName = new StringBuilder();
		for (char c : fileName.toCharArray()) {
			if (isLatin(c) == true) {
				latinFileName.append(c);
			}
		}
		return latinFileName.toString();
	}

	public static Boolean isLatin(char c) {
		for (char b : LATIN_SYMBOL.toCharArray()) {
			if (c == b) {
				return true;
			}
		}
		return false;
	}

}
