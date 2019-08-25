package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	BinaryPrinter bp;
	
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		
		bp.printByteBinary((byte) 55);
		bp.printShortBinary((short) 55);
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
		System.out.println(" ");
		byte nine = (byte) (s & 256);
		nine = (byte) (nine >>8);
		
		byte ten = (byte) (s & 512);
		nine = (byte) (nine >>9);
		
		System.out.print(ten + "" + nine);
		printByteBinary((byte) s);
		
	}
	
	public void printIntBinary(int i) {
		
	}
	
	public void printLongBinary(long l) {
		
	}
}
