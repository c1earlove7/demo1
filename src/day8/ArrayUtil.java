package day8;

public class ArrayUtil {
// 和数组相关的工具类 静态方法反复调用方便并且节省内存 因为需要反复实例化
	
	public static int Max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int min(int[] array) {
		int min = array[0];
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	
	public static int avg(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum/array.length;
	}
	
	public static void sort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
	}
	
}
