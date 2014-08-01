/**
 * 
 */
package mikec.utils;

import java.util.Random;

/**
 * @author Mike
 *
 */
public class ArrayCreateUtils {
	
	/**
	 * Create an array of int with random vals of a given length
	 * @param length
	 * @return
	 */
	public static int[] createIntArray(final int length) {
		int[] data = new int[length];
	    Random randomGenerator = new Random();

		
		for (int i = 0; i < length; i++) {
			data[i] = randomGenerator.nextInt(100);
		}
		
		return data;
	}

}
