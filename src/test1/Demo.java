package test1;

import java.util.Scanner;

import org.junit.Test;

public class Demo {
	
	// 打印倒等腰直角三角形
	@Test
	public void print() {
		System.out.println("请输入三角形的直角边长度");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for (int i = 1; i <= length; i++) {
			for (int j = length - i; j >= 0; j--) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
	
	/*
	 * 2，编写一个方法求s=a+aa+aaa+a...a，其中a是一个数，比如a=2；那么求s=2+22+222+2222...的值。该方法需要两个参数，第一个参数控制a，第二个参数控制有多少个数。（5分）
	 * */
	@Test
	public void sumNumber() {
		int number;
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字");
		number = scanner.nextInt();
		System.out.println("请输入数字个数");
		count = scanner.nextInt();
		int sum = 0;
		int mulNum = 1;
		
		for (int i = 1; i <= count; i++) {
			sum += number * (count - i + 1) * mulNum;
			mulNum *= 10;
		}
		
		System.out.println("求出的和为" + sum);
		scanner.close();
	}
	
	/*
	 * 给出一组学生的成绩int[] score={80,45,60,100,89,92,93,...}请求出这组成绩中，100分，90-99，80-89的学生人数。
	 * */
	@Test
	public void scores() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩个数：");
		num = sc.nextInt();
		int score[] = new int[num];
		int sum100 = 0;
		int sum90To99 = 0;
		int sum80To89 = 0;
		
		
		for (int i = 0; i < num; i++) {
			System.out.println("请输入第" + (i+1) + "位学生的成绩");
			score[i] = sc.nextInt();
			
			if (test(score[i]) == false) {
				i--;
			}
		}
		
		for (int i : score) {
			switch(i / 10) {
			case 10:
				sum100++;
				break;
			case 9:
				sum90To99++;
				break;
			case 8:
				sum80To89++;
			default:
				break;
			}
		}
		
		System.out.println("100分的人数有" + sum100 + "人，90-99的人数有" + sum90To99 + "人，80-89的人数有" + sum80To89 + "人");
		sc.close();
	}
	
	public boolean test(int score) {
		if (score < 0 || score > 100) {
			System.out.println("成绩无效！请重新输入");
			return false;
		} else {return true;}
	}
}
