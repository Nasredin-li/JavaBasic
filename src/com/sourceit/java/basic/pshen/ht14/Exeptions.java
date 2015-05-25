package com.sourceit.java.basic.pshen.ht14;

public class Exeptions {

	
	public static void main(String[] args) {
		String str = new String();

		try {
			str = new String(args[0]);
			System.out.println(str.substring(Math.min(Integer.parseInt(args[1]), Integer.parseInt(args[2])),
					Math.max(Integer.parseInt(args[1]), Integer.parseInt(args[2]))));
			
		} catch (NumberFormatException nfe) {
			try {
				System.out.print(str.substring(Integer.parseInt(args[1])));

			} catch (NumberFormatException nfe2) {
				try {

					System.out.print(str.substring(Integer.parseInt(args[2])));

				} catch (NumberFormatException nfe3) {
					System.out
							.print(" Enter one or two digit, to define a print range substring");
				} catch (StringIndexOutOfBoundsException nfe3) {
					System.out
							.print(" Enter one or two digit, to define a print range substring");
				} catch (ArrayIndexOutOfBoundsException ok) {
					System.out
							.print(" Enter one or two digit, to define a print range substring");
				}
			} catch (StringIndexOutOfBoundsException nfe3) {
				System.out
						.print(" Enter one or two digit, to define a print range substring");
			}

		} catch (ArrayIndexOutOfBoundsException ai) {
			try {
				System.out.print(str.substring(Integer.parseInt(args[1])));
			} catch (ArrayIndexOutOfBoundsException aibo) {
				System.out
						.print(" Enter a string & one or two digit, to define a print range substring");

			} catch (StringIndexOutOfBoundsException siob) {
				System.out
						.print(" Enter one or two digit, to define a print range substring");
			}

		} catch (StringIndexOutOfBoundsException si) {
			try {
				System.out.print(str.substring(Integer.parseInt(args[1])));
				// throw new NumberFormatException();
			} catch (StringIndexOutOfBoundsException sio) {
				try {
					System.out.print(str.substring(Integer.parseInt(args[2])));
				} catch (StringIndexOutOfBoundsException siob) {
					System.out
							.print(" Enter one or two digit, to define a print range substring");
				}
			}

		}
	}
}
