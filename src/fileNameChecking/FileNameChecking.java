package fileNameChecking;

public class FileNameChecking {

	private static final String LATIN_SYMBOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_@&$#~(){}1234567890";
	private static final String NOT_LATIN_SYMBOL = "ÀÂÑÅÍ²ÊÌÎÐÒÕÓÇàñå³êìîðõó¹";
	private static final String SHORT_LATIN_SYMBOL = "ABCEHIKMOPTXY3aceikmopxyN";
	
	public static StringBuilder latinFileName = new StringBuilder();
	

	

	public static String changeToLatin(String fileName2) {
		StringBuilder fileNameChanged = new StringBuilder();
		for (char e : fileName2.toCharArray()) {
			for (char b : NOT_LATIN_SYMBOL.toCharArray()) {
				if (e == b) {
					e = SHORT_LATIN_SYMBOL.charAt(NOT_LATIN_SYMBOL.indexOf(e));
					System.out.println(e);
				}
			}
			fileNameChanged.append(e);
		}
		System.out.println(fileNameChanged);
		return fileNameChanged.toString();
	}

	public static Boolean isLatin(String fileName) {
		for (char c : fileName.toCharArray()) {
			for (char b : LATIN_SYMBOL.toCharArray()) {
				if (c == b) {
					latinFileName.append(c);

				}

			}
		}
		if (fileName.length() != latinFileName.length()) {
			return false;
		}
		return true;

	}

}
