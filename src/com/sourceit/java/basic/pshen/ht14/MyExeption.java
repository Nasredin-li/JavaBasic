package com.sourceit.java.basic.pshen.ht14;

public class MyExeption {

	public static void main(String[] args) {

		MyExeption ex = new MyExeption();
		String str = new String();
		String message1 = " Enter a string, & one or two digit, to define a print range substring.\n 	Exemple: <interactivity 2 6> with result: <tera>,\n	         <interactivity 5> with result: <activity>";
		if (args.length < 2) {
			System.out.println(message1);
			return;
		}
		try {
			
			if (args.length == 2) {
				System.out.println(ex.exceptionTrackStringOneDigit(args, 1,
						str, message1));
				return;
			}
			if (args.length > 2) {
				try {
					System.out.println(ex.exceptionTrackString(args, str,
							message1, 0));
				} catch (StringIndexOutOfBoundsException e) {
					if (ex.exceptionTrackStringOneDigit(args, 1, str, message1) != null) {
						
						System.out.println(ex.exceptionTrackStringOneDigit(
								args, 1, str, message1));
						return;
					} else{
					System.out.println(ex.exceptionTrackStringOneDigit(args, 2,
							str, message1));
					}
					throw e;
				} catch (NumberFormatException b) {
					System.out.println(ex.exceptionTrackStringOneDigit(args, 1,
							str, message1));
					System.out.println(ex.exceptionTrackStringOneDigit(args, 2,
							str, message1));
					throw b;
				}

			}

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(message1);
		} catch (NumberFormatException b) {
			System.out.println(message1);
		}

	}

	private String exceptionTrackString(String[] args, String str,
			String message1, int i) throws StringIndexOutOfBoundsException,
			NumberFormatException {
		String result = null;
		str = args[0];
		result = (str.substring(
				Math.min(Integer.parseInt(args[1]), Integer.parseInt(args[2])),
				Math.max(Integer.parseInt(args[1]), Integer.parseInt(args[2]))));
		return result;

	}

	private String exceptionTrackStringOneDigit(String[] args, int i,
			String str, String message1)
			throws StringIndexOutOfBoundsException, NumberFormatException {
		str = args[0];
		return str.substring(Integer.parseInt(args[i]));
	}

}
