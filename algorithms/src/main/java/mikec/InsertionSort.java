/**
 * 
 */
package mikec;

/**
 * Insertion sort 
 * @author Mike
 *
 */
public class InsertionSort {
	
	int[] sort(int[] input) {
		int[] result = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			insert(input, i, input[i], result);
		}
		
		return result;
	}

	private void insert(int[] input, int pos, int value, int[] result) {
		int i = pos - 1;
		while (i >= 0 && result[i] > value) {
			result[i + 1] = result[i];
			i = i - 1;
		}
		result[i + 1] = value;
	}

}
