package Lesson;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Day5 {
	
	@Test
	public void test1() {
		int num = 3;
		String string = "abc"; // java.util.lang 包下面不需要导包
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {4 , 17, 21, 1};
		Arrays.sort(array); // 数组排序 从小到大
		System.out.println(Arrays.toString(array));
	}
}
