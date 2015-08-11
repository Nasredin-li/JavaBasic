package fileNameChecking;

public class FileNameChecking {
	

	private static final String latinSymbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_@&$#~(){}1234567890";
	private static String fileName= "rsqw";
	private static StringBuilder latinCharName= new StringBuilder();
	
	public static void main(String[] args) {
		System.out.println(fileName);
		System.out.println(isLatin(fileName, latinCharName));
		System.out.println(latinCharName);

	}

	private static Boolean isLatin(String fileName, StringBuilder latinCharName) {
		for(char e: fileName.toCharArray()){
			for(char b: latinSymbol.toCharArray()){
				if(e==b){
					latinCharName.append(e);
					
				}
				
			}
		}
		if(fileName.length()!= latinCharName.length()){
			return false;
		}
		return true;
		
	}

}
