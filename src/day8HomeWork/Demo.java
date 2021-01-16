package day8HomeWork;

import java.util.Scanner;

import org.junit.Test;

public class Demo {
	
	// 实现trim方法
	@Test
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串:");
		String str = sc.nextLine();
		AchieveTrim trim = new AchieveTrim();
		System.out.println("得到的字符串:" + trim.achieveTrim(str));
		sc.close();
	}
	
	// 实现把“I Love Java！”的字符全部转换为小写并输出到控制台。
	@Test
	public void test2() {
		String str = new String("I Love Java!");
		System.out.println(str.toLowerCase()); // 创建一个新字符串保存
		System.out.println(str);
	}
	
	// 使用String类中的split()函数，统计出“this is my homework! I must finish it!”中单词的个数

	@Test
	public void test3_1() {
		String[] str2 = remove();
		System.out.println(str2.length);
	}

	private String[] remove() {
		String str1 = "this is my homework! I must finish it!";
		String[] str2 = str1.split(" ");
		return str2;
	}
	
	@Test
	public void test3_2() {
		CharNumber number = new CharNumber();
		System.out.println(number.countChar("this is my homework! I must finish it!"));
	}

	
}
