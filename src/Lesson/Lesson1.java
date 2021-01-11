package Lesson;

import java.util.Scanner;

import org.junit.Test;

public class Lesson1 {
	
	public static void main(String[] args) {
		
	}
	
	// 这个方法不能有参数和返回值
	@Test
	public void test1() {
		// syst:systrace 跟踪
		System.out.println("Lesson1.test1()");
		
		// 1.从小到大自动类型转化
		char ch = 'a';
		System.out.println(ch + 1);
		
		// 2.从大到小强制类型转化 可能会丢失精度
		System.out.println((char)(ch + 1));
		// byte -> short(char) -> int -> long -> float ->double 
	
	}
	
	@Test
	public void test2() {
		System.out.println("Lesson1.test2()");
	}
	
	@Test
	public void test3() {
//		int i = 3;
//		i = i + 1;
//		
	//	int score1 = 61;
	//	int score2 = 380;
	//	System.out.println(score1 > 60 && score2 > 400);
////	
//		int num1 = 3; 
//		int num2 = 5;
//		// &&短路
//		System.out.println(num1 < 0 && num1++ < num2);
//		System.out.println(num1);// 3
//		System.out.println(num2);// 5
//		// ||短路
//		System.out.println(num1 > 0 || num1++ < num2);
//		System.out.println(num1);
//		System.out.println(num2);
		
		int score = 101;
		//一般把非法的输入在最前面直接拦截return。
		if (score < 0 || score > 100) {
			System.out.println("成绩非法");
			return;
		}
		
		if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 && score < 90) {
			System.out.println("良好");
		} else if (score >= 70 && score < 80) {
			System.out.println("一般");
		} else if (score >= 60 && score < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
	
	@Test
	public void test5(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("是闰年.");
		} else {
			System.out.println("不是闰年.");
		}
	}
}
