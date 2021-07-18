//import java.util.Arrays;
import java.util.Random;

public class Array {
	
	private int size;
	private int[] intArray;
	
	public int fillArray() {
		
		int ub = size;
		return (new Random()).nextInt(ub); // Created a random number with an upper bound as large as the array we are trying to fill
		
	}
	
	public int[] arrayAsc(int size) {
		this.size = size;
		intArray = new int[size];
		for (int i = 0; i< intArray.length;i++) {
			
			intArray[i] = i + 1; // fill the array by looping through and assigning a random number to each index of the array
		}
		return intArray;
	}
	
	public int[] arrayDes(int size) {
		this.size = size;
		intArray = new int[size];
		for (int i = 0; i< intArray.length;i++) {
			
			intArray[i] = intArray.length - i; // fill the array by looping through and assigning a random number to each index of the array
		}
		return intArray;
	}
	
	public int[] arrayRan(int size) {
		this.size = size;
		intArray = new int[size];
		for (int i = 0; i< intArray.length;i++) {
			
			intArray[i] = fillArray(); // fill the array by looping through and assigning a random number to each index of the array
		}
		return intArray;
	}
	
	public int[] getIntArray() {
		
		return intArray;
	}


}
