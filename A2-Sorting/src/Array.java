//import java.util.Arrays;
import java.util.Random;

public class Array {
	
	private int size;
	private int[] intArray;
	
	public int fillArray() {
		
		int ub = size;
		return (new Random()).nextInt(ub); // Created a random number with an upper bound as large as the array we are trying to fill
		
	}
	
	public Array(int size) {
		this.size = size;
		intArray = new int[size];
		for (int i = 0; i< intArray.length;i++) {
			
			intArray[i] = fillArray(); // fill the array by looping through and assigning a random number to each index of the array
		}
		
	}
	
	public int[] getIntArray() {
		
		return intArray;
	}
	
	/**
	 * INSERTION SORT OF THE FIRST n ELEMENTS OF ARRAY arr 
	 * SEE PAGE 407 TO PAGE 410
	 * FOR A DISCUSSION
	 * 
	 * @param data
	 * @param count
	 */
	public void sortAsc(int[] data, int count) {
		int temp;
		int j, k;
		for (j = 1; j < count; j++) {
			temp = data[j];
			for (k = j - 1; (k >= 0) && (data[k] > temp); k--) {
				data[k + 1] = data[k];
			}
			data[k + 1] = temp;
		}
	}
	
	/**
	 * INSERTION SORT OF THE FIRST n ELEMENTS OF ARRAY arr 
	 * SEE PAGE 407 TO PAGE 410
	 * FOR A DISCUSSION
	 * 
	 * @param data
	 * @param count
	 */
	public void sortDes(int[] data, int count) {
		int temp;
		int j, k;
		for (j = 1; j < count; j++) {
			temp = data[j];
			for (k = j - 1; (k >= 0) && (data[k] < temp); k--) {
				data[k + 1] = data[k];
			}
			data[k + 1] = temp;
		}
	}
	
//	
//	public int getLEnds() {
//		
//		sortAsc(intArray,size);
//		int min = intArray[0];
//		
//		
//		return min;
//	}
//
//	
//	public int getREnds() {
//		sortAsc(intArray,size);
//		int max = intArray[size-1];
//		
//		return max;
//	}
//	
//	public int getLEnd() {
//		
//		sortDes(intArray,size);
//		int max = intArray[0];
//		
//		
//		return max;
//	}
//
//	
//	public int getREnd() {
//		sortDes(intArray,size);
//		int min = intArray[size-1];
//		
//		return min;
//	}

	
	public int[] getAscArray() {
		sortAsc(intArray,size);
		return intArray;
	}
	public int[] getDesArray() {
		sortDes(intArray,size);
		return intArray;
	}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Array a = new Array(10);
//		//a.list(10);
//		//for (int i = 0; i<a.getIntArray().length; i++) {
//			//System.out.println(a.getIntArray()[i]);
//		
//		//}
//		//System.out.println("list" + a.print())
//		System.out.println(" ASC Left " + a.getLEnds());
//		System.out.println(" ASC Right " + a.getREnds()); 
//		System.out.println(" Des Left " + a.getLEnd()); 
//		System.out.println(" Des Right " + a.getREnd()); 
//
//		for (int i = 0; i< a.getIntArray().length; i++) {
//			System.out.println(a.getAscArray()[i]); 
//			
//		}
//		for (int i = 0; i< a.getIntArray().length; i++) {
//			System.out.println(a.getDesArray()[i]); 
//			
//		}
//	}

}
