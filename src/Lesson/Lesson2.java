package Lesson;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;


public class Lesson2 {
	
	public void test1 () {
		int i = 1;
		while (i <= 5) {
			System.out.println("HelloWorld");
			i++;
		}
	}
	
	@Test
	public void test2() {
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		
		for (i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	@Test
	public void test3() {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
	@Test
	public void test4() {
		int num = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 7 == 0) {
				num++;
			}
		i++;
		}
		System.out.println(num);
	}
	
	
	public void test5() {
		for(int i = 1; i <= 100; i++) {
			int sum = 0;
			sum += i;
			System.out.println(sum);
		}
	} 
	
	public void test6() {
		for (int i = 1; i <= 100; i++) {
			int num = 0;
			if(i % 7 == 0) {
				num++;
				System.out.println(i + "对7取余为0");
			}
		System.out.println("1到100里7的倍数有" + num + "个");
		}
	}
	
	@Test
	public void test7() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	@Test
	public void test8() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
	
	@Test
	public void test9() {
		for (int i = 1; i <=10; i++) {
			System.out.println("i" + i);
			for (int j = 1; j <= 10; j++) {
				if(j == 5) {
					break;
				}
				System.out.print("j" + j + "\t");
			}
			System.out.println("\n");
		}
	}
	
	@Test
	public void test10() {
		// 返回值：下一个伪随机数，在此随机数生成器序列中0（包括）和n(不包括)之间均匀的int值.
	    // random.nextInt(100) [0,100)
		Random random = new Random();
		int number = random.nextInt(100)+1;
		System.out.println(number);
		Scanner scanner = new Scanner(System.in);
		
		// 死循环
		while (true) {
			System.out.println("猜吧");
			int guess = scanner.nextInt();
			if (number > guess) {
				System.out.println("猜小了");
			} else if (number < guess) {
				System.out.println("猜大了");
			} else {
				System.out.println("猜对了");
				break;
			}	
		}
		
		System.out.println("1");
		scanner.close();
	}
	
	@Test
	public void test11() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "x" + j + "=" + (i*j) + "\t");
			}
			System.out.println("\n");
		}
	}
	
	@Test
	public void test12() {
		for (int i = 9; i > 0; i--) {
			for (int j = i ; j > 0; j--) {
				System.out.print(i + "x" + j + "=" + (i*j) + "\t");
			}
			System.out.println("\n");
		}
	}
	
	@Test
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void test13() {
		// 冒泡排序
		int num[]= {1,2,3,4,5,6};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入任意整数，可以输入任意次，输入任意非整数字符结束");
		while(true) {
			int i = 0;
			try{
				int getNum = scanner.nextInt();
				num[i] = getNum;
			}
			catch(Exception e) {
				break;
			}
			
		}
			
		}
	
	
	@Test
	public void test14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入");
		int a = scanner.nextInt();
		System.out.println(a);
	}
	
	@Test
	public void chooseMonth() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("输入月份不正确，请重新输入：");
			chooseMonth();
		}
	
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "月有31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "月有30天");
			break;
		case 2:
			System.out.println("请输入年份");
			int year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("是闰月29天");
			} else {
				System.out.println("二月不是闰月28天");
			}
			break;
		default:
			System.out.println("default");
			break;
		
		}
	}
	
	@Test
	public void chooseType() {
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int grade = scanner.nextInt();
		if (grade > 100 || grade < 0) {
			System.out.println("输入成绩不正确");
			return;
		}
		int point = grade / 10;
		switch (point) {
		case 10:
		case 9:
			System.out.println("111111");
			break;
		case 8:
			System.out.println("22222");
			break;
		case 5:
		case 4:
		case 3:	
		case 2:	
		case 1:	
		case 0:
			System.out.println("不及格");
			break;
		default:
			System.out.println("default");
			break;
		}
		scanner.close();
	}

}
