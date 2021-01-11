package Lesson;

import org.junit.Test;

public class Day4 {
	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		ad.test1();
		ad.test3();
		ad.test5();
	}
}

class ArrayDemo {
	
	@Test
	public void test1() {
		//assign
		int num = 3;
		int[] array = new int[4]; 
		array[0] = 3;
		array[1] = 4;
		array[2] = 5;
		array[3] = 6;
		int length = array.length;
		System.out.println("长度是" + length);
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	public void test2() {
		int[] array = new int[4];
		double[] array2 = new double[4];
		char[] array3 = new char[4];
		String[] array4 = new String[4];
	}
	
	public void test3() {
		int[] array = new int[4];
		array[0] = 23;
		array[1] = 45;
		array[2] = 3;
		array[3] = 14;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = 0;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		
	}
	
	public void test4() {
		int[] array = new int[4];
		array[0] = 23;
		array[1] = 45;
		array[2] = 3;
		array[3] = 14;
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
	}
	
	// 冒泡方法2
	public void test5() {
		int array[] = {40, 17, 21, 1};
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if(array[j] > array[j + 1]) {
					int temp = 0;
					temp = array[i];
					array[i] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	System.out.println(array[3]);
	}
	
}
