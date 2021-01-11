package Lesson;

import org.junit.Test;

public class Test1 {
	@Test
	public void test4() {
		int[] array = new int[4];
		array[0] = 23;
		array[1] = 45;
		array[2] = 3;
		array[3] = 14;
//		int max = array[0];
//		int min = array[0];
		
//		for (int i = 0; i < array.length; i++) {
//			if(array[i] > max) {
//				max = array[i];
//				
//			}
//			if(array[i] < min) {
//				min = array[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
