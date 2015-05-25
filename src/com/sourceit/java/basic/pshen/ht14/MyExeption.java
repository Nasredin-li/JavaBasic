package com.sourceit.java.basic.pshen.ht14;

public class MyExeption {

	public static void main(String[] args) {
		MyExeption ex = new MyExeption();
		String str = new String();
		String message1 = " Enter a string, & one or two digit, to define a print range substring";
		String message2 = " Enter one or two digit, to define a print range substring";

		ex.exceptionTrackString(args, str, 0, message1, message2);

	}

	public void exceptionTrackString(String args[], String str, int i,
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
			}
		} catch (NumberFormatException nfe3) {
			try {
				System.out.println(str.substring(Integer.parseInt(args[1])));
			} catch (StringIndexOutOfBoundsException nfe2) {
				print(message2);
			} catch (NumberFormatException nfe2) {
				System.out.println(str.substring(Integer.parseInt(args[2])));
			
			}

		} catch (ArrayIndexOutOfBoundsException ok) {
			try {
				System.out.println(str.substring(Math.min(
						Integer.parseInt(args[1]), Integer.parseInt(args[2]))));
			} catch (StringIndexOutOfBoundsException nfe3) {
				print(message2);
			} catch (NumberFormatException nfe3) {
				print(message2);
			} catch (ArrayIndexOutOfBoundsException o) {
				print(message1);
			}
		}

	}

	public void print(String message) {
		System.out.println(message);

	}

	/*
	 * try { str = new String(args[0]); } catch (ArrayIndexOutOfBoundsException
	 * e) { System.out .println(
	 * " Enter a string, & one or two digit, to define a print range substring"
	 * ); return; }
	 * 
	 * try {
	 * 
	 * System.out.print(str.substring(Integer.parseInt(args[1]),
	 * Integer.parseInt(args[2])));
	 * 
	 * } catch (NumberFormatException nfe) { try {
	 * System.out.print(str.substring(Integer.parseInt(args[1])));
	 * 
	 * } catch (NumberFormatException nfe2) { try {
	 * 
	 * System.out.print(str.substring(Integer.parseInt(args[2])));
	 * 
	 * } catch (NumberFormatException nfe3) { System.out
	 * .print(" Enter one or two digit, to define a print range substring"); }
	 * catch (StringIndexOutOfBoundsException nfe3) { System.out
	 * .print(" Enter one or two digit, to define a print range substring"); }
	 * catch (ArrayIndexOutOfBoundsException ok) { System.out
	 * .print(" Enter one or two digit, to define a print range substring"); } }
	 * catch (StringIndexOutOfBoundsException nfe3) { System.out
	 * .print(" Enter one or two digit, to define a print range substring"); }
	 * catch (ArrayIndexOutOfBoundsException ok) { System.out
	 * .print(" Enter one or two digit, to define a print range substring"); }
	 * 
	 * } catch (ArrayIndexOutOfBoundsException ai) { try {
	 * System.out.print(str.substring(Integer.parseInt(args[1]))); } catch
	 * (ArrayIndexOutOfBoundsException aibo) { System.out
	 * .print(" Enter one or two digit, to define a print range substring");
	 * 
	 * } catch (StringIndexOutOfBoundsException siob) { System.out
	 * .print(" Enter one or two digit, to define a print range substring"); }
	 * 
	 * } catch (StringIndexOutOfBoundsException si) { try {
	 * System.out.print(str.substring(Integer.parseInt(args[1])));
	 * 
	 * } catch (StringIndexOutOfBoundsException sio) { try {
	 * System.out.print(str.substring(Integer.parseInt(args[2]))); } catch
	 * (StringIndexOutOfBoundsException siob) { System.out
	 * .print(" Enter one or two digit, to define a print range substring"); } }
	 * 
	 * } }
	 */
}
