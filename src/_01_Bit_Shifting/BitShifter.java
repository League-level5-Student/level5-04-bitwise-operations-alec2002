package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 1;
		//4
		//8 4 2 1
		//  1 0 0
		
		
		//100
		
		int numBinary = 100;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		
		System.out.println(numShifted);
		//8
		//16 8 4 2 1 
		//8 4 2 1
		//1000
		
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		//<< adds a 0
		
		// 4. Try shifting num 3 places.
		
		int numShift = num << 3;
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
