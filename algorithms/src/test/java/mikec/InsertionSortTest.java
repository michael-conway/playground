package mikec;

import static org.junit.Assert.*;
import junit.framework.Assert;

import mikec.utils.ArrayCreateUtils;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testSort() {
		int[] data = ArrayCreateUtils.createIntArray(500);
		
		int sumData = 0;
		for (int i = 0; i < data.length; i ++){
			sumData += data[i];
		}
		
		InsertionSort insertionSort = new InsertionSort();
		int[] actual = insertionSort.sort(data);
		Assert.assertNotNull(actual);
		
		int sumActual = 0;
		for (int i = 0; i < actual.length; i ++){
			sumActual += actual[i];
		}
		
		Assert.assertEquals(sumData, sumActual);
		
	}

}
