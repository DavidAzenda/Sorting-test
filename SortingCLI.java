import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class SortingCLI {
	
	private Bubble bubble;
	private Insertion insertion;
	private Quick quick;
	private Merge merge;
	private Array array;
	private KeyboardReader reader;
	

	public SortingCLI() {
		reader = new KeyboardReader();
	}
	
	/**
	 * Implements the user dialog
	 * @throws IOException 
	 */
	public void run() throws IOException {
		
		reader.display("*** Sorting Algorithm Test ***\n");
		reader.prompt("What size array do you want to create ex. 10,100,1000,etc");
		int size = reader.getKeyboardInteger();
		
		reader.prompt("How should the array be sorted( 1 Ascending, 2 Descending, 3 Random)");
		int sort = reader.getKeyboardInteger();
		
		reader.prompt("What Sorting Algorithm would you like to test(1 Bubble,2 Insertion,3 Quick,4 Merge)");
		int type = reader.getKeyboardInteger();
		
		array = new Array();

		int[] sortArray = new int[size];
		if(sort == 1) {
			sortArray = array.arrayAsc(size);
		}
		else if (sort == 2) {
			sortArray = array.arrayDes(size);
		}
		
		else if (sort == 3) {
			sortArray = array.arrayRan(size);
		}
		else {
			reader.display("Try Again");
		}
		
		bubble = new Bubble();
		insertion = new Insertion();
		quick = new Quick();
		merge = new Merge();
		
		if(type == 1) {
			long startb = System.currentTimeMillis();
			bubble.bubbleSort(sortArray,size);
			long endb = System.currentTimeMillis();
			
			reader.display("Bubble Sorting Time for " + size + " Item array is " + (endb - startb) + " ms\n");
			
		}
		
		else if(type == 2) {
			long starti = System.currentTimeMillis();
			insertion.sortInsertion(sortArray);
			long endi = System.currentTimeMillis();
			
			reader.display("Insertion Sorting Time for " + size + " Item array is "+ (endi - starti) + " ms\n");
			
		}
		
		
		else if(type == 3) {
			long startq = System.currentTimeMillis();
			quick.QuickSort(sortArray, size);
			long endq = System.currentTimeMillis();
			
			reader.display("Quick Sorting Time for " + size + " Item array is " + (endq - startq) + " ms\n");
			
		}
		
		else if(type == 4) {
			long startm = System.currentTimeMillis();
			merge.mergeSort(sortArray, size);
			long endm = System.currentTimeMillis();
			
			reader.display("Merge Sorting Time for " + size + " Item array is " + (endm - startm) + " ms\n");
			
		}
		
		else{
			reader.display("Try Again");
			
		}
		
		reader.prompt("\nWhat Name Would you like to give the output file?");
		String name = reader.getKeyboardInput();
		
		FileWriter writer = new FileWriter(name);

		for (int i = 0; i < sortArray.length; i++) {
		    writer.append(String.valueOf(sortArray[i]));
		    writer.append("\n");
		}
		writer.close();
	}
	
	public static void main(String[] args) throws IOException {
		SortingCLI app = new SortingCLI();
		app.run();

	}

}
