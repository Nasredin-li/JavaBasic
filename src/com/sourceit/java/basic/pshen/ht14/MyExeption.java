package com.sourceit.java.basic.pshen.ht14;

public class MyExeption {

	public static void main(String[] args) {

		MyExeption ex = new MyExeption();
		String str = new String();
		String message1 = " Enter a string, & one or two digit, to define a print range substring. Exemple <interactivity 2 6>, <interactivity 5>";
		String message2 = " Enter one or two digit, to define a print range substring";
		if (args.length < 2) {
			System.out.println(message1);
			return;
		}
		if (args.length == 2) {
			ex.exceptionTrackString(args, 1, str, message1);
			return;
		}
		if (args.length == 3) {
			ex.exceptionTrackString(args, str, message1, 0);
			return;
		}

		
	}

	private void exceptionTrackString(String[] args, String str,
			String message1, int i) {
		try {
			str = args[0];
			System.out.println(str.substring(Math.min(Integer.parseInt(args[1]),
					Integer.parseInt(args[2])),
			Math.max(Integer.parseInt(args[1]),
					Integer.parseInt(args[2]))));
		} catch (StringIndexOutOfBoundsException nfe3) {
			exceptionTrackString(args, 1, str, message1);
			exceptionTrackString(args, 2, str, message1);
			System.out.println(7);
		} catch (NumberFormatException nfe2) {
			exceptionTrackString(args, 1, str, message1);
			exceptionTrackString(args, 2, str, message1);
			print(message1);
			System.out.println(2);
		}
		
	}

	private void exceptionTrackString(String[] args, int i, String str, String message1) {
		try {
			str = args[0];
			System.out.println(str.substring(Integer.parseInt(args[i])));
			
		} catch (StringIndexOutOfBoundsException nfe3) {
			print(message1);
			System.out.println(7);
		} catch (NumberFormatException nfe2) {
			print(message1);
			System.out.println(2);
		}
	}

	/*public void exceptionTrackString(String args[], String str,
			String message1, String message2) {
		try {
			str = args[0];
			System.out.println(str.substring(
					Math.min(Integer.parseInt(args[1]),
							Integer.parseInt(args[2])),
					Math.max(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]))));
		} catch (StringIndexOutOfBoundsException nfe3) {
			try {
				System.out.println(str.substring(Math.min(
						Integer.parseInt(args[1]), Integer.parseInt(args[2]))));
			} catch (StringIndexOutOfBoundsException nf) {
				print(message2);
				System.out.println(1);
			}
		} catch (NumberFormatException nfe3) {
			try {
				System.out.println(str.substring(Integer.parseInt(args[1])));
			} catch (StringIndexOutOfBoundsException nfe2) {
				print(message2);
				System.out.println(2);
			} catch (NumberFormatException nfe2) {
				System.out.println(str.substring(Integer.parseInt(args[2])));
				System.out.println(3);

			}

		} catch (ArrayIndexOutOfBoundsException ok) {
			try {
				System.out.println(str.substring(Math.min(
						Integer.parseInt(args[1]), Integer.parseInt(args[2]))));
			} catch (StringIndexOutOfBoundsException nfe3) {
				print(message2);
				System.out.println(4);
			} catch (NumberFormatException nfe3) {
				print(message2);
				System.out.println(5);
			} catch (ArrayIndexOutOfBoundsException o) {
				print(message1);
				System.out.println(6);
			}
		}

	}*/

	public void print(String message) {
		System.out.println(message);

	}
}

	