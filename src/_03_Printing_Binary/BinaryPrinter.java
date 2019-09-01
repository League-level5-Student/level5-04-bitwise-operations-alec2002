package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	BinaryPrinter bp;
	
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		
		bp.printByteBinary((byte) 55);
		System.out.println("");
		bp.printShortBinary((short) 55);
		System.out.println("");
		bp.printIntBinary((int) 30000);
		System.out.println("");
		bp.printLongBinary((long)551616518546515151l);
		System.out.println("");
		//101011
	}
	
	public void printByteBinary(byte b) {
		byte lastBit = (byte) (b & 1);
		
		byte second = (byte) (b & 2);
		second = (byte) (second >>1);
		
		byte third = (byte) (b & 4);
		third = (byte) (third >> 2);
		
		byte fourth = (byte) (b & 8);
		fourth = (byte) (fourth >>3);
		
		byte fifth = (byte) (b & 16);
		fifth = (byte) (fifth >> 4);
		
		byte sixth = (byte) (b & 32);
		sixth = (byte) (sixth >> 5);
		
		byte seven = (byte) (b & 64);
		seven = (byte) (seven >> 6);
		
		byte eight = (byte) (b & 128);
		eight = (byte) (eight >> 7);
		
		
		System.out.print(eight + "" + seven + "" + sixth + "" + fifth + "" + fourth + "" + third + "" + second + "" + lastBit);
	}
	
	public void printShortBinary(short s) {
		byte b1 = (byte)(s >> 8);
		byte b2 = (byte)(s&255);
		
		printByteBinary(b1);
		printByteBinary(b2);
		
	
		
	}
	
	public void printIntBinary(int i) {
		short b3 = (short)(i >> 16);
		short b4 = (short)(i&65535);
		
		printShortBinary(b3);
		printShortBinary(b4);
		
	}
	
	public void printLongBinary(long l) {
		int b4 = (int)(l >> 32);
		int b5 = (int)(l&2147483647);
		
		printIntBinary(b4);
		printIntBinary(b5);
	}
}
