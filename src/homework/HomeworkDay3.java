package homework;

import java.util.Scanner;

import org.junit.Test;

public class HomeworkDay3 {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void work1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
			    System.out.print(j);
			}
		System.out.println("");
		}
	}
	
	@Test
	public void work2() {
		// 打印正三角形
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入打印正三角形的行数");
		int rows = scanner.nextInt();
		
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (rows - i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();
	}
	
	@Test
	public void work3() {
		// 打印倒三角形
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入打印倒三角形的行数");
		int rows1 = scanner.nextInt();
		
		for(int i = 1; i <= rows1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * (rows1 - i) + 1; k > 0 ;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();
	}
	
	@Test
	public void work4() {
		// 计算奇数 偶数 和
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i <= 100; i = i + 1) {
			oddSum += i;
			evenSum += (++i);		
		}
		System.out.println("奇数和为：" + oddSum);
		System.out.println("偶数和为：" + evenSum);
	}
	
	@Test
	public void work5() {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				System.out.print(i+"\t");
				count++;
				if(count % 3 == 0) {
					System.out.println("");
				}
			}
		}
	}
	
	@Test
	public void work6 () {
		int kramp = 1;
		
		for (int i = 1; i <= 9; i++) {
			kramp *= i;
		}
		System.out.println("9的阶乘是" + kramp);
	}
	
	@Test
	public void work7() {
		for (int i = 100; i <= 200; i++) {
			int p = (i + 1) / 2;
			for(int j = 2; j <= p; j++) {
				if (i % j == 0) {
					break;
				}
				if(j == p) {
					System.out.print(i + "\t");
				}
			}
		}
	}
	
	@Test
	public void work8() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i ; j >= 0; j--) {
				System.out.print("1");
			}
			for (int k = (2 * i) - 1; k > 0; k--) {
				System.out.print("2");
			}
			System.out.println("");
		}
	}
	
	@Test
	public void test1() {
		for (int i = 100; i <= 200; i++) {
			boolean isSuShu = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isSuShu = false;
				}
			}
			if (isSuShu) {
				System.out.println(i + "是素数");
			}
		}
	}
	
	
}