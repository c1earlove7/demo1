package day8;

import java.util.Arrays;

import org.junit.Test;

public class StringDemo {

	@Test
	public void test1() {
		
		// "abc" 双引号括起来的字符串： 常量字符串 也是一个字符串对象
		// jdk 1.8 之前有常量池  1.8之后在堆里有常量池
		String str1 = "abc";
		String str3 = "abc"; // java 在常量池里new一个字符串对象
		String str2 = new String("abc"); //如果常量池有这字符，就把这个地址给辛定义
		// 双引号指向变量的地址值
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
	
		
		// 比较字符串内容用equals
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
	
	
	}
	
	@Test
	public void test2() {
		String str = "java AndroidA";
		char[] array = str.toCharArray();
		System.out.println(Arrays.toString(array));
		
		char ch = str.charAt(5);
		System.out.println(ch);
		
		System.out.println(str.indexOf("A"));
		System.out.println(str.indexOf("A", 5));
		System.out.println(str.indexOf("X"));
		System.out.println(str.indexOf("And"));
		System.out.println(str.lastIndexOf('A'));
	}
	
	@Test
	public void test3() {
		char[] array = {'j', 'a', 'v', 'a', ' ', 'A', 'n', 'd'};
		String str = new String(array);
		System.out.println(str);
	}
	
	@Test
	public void test4() {
		String str = "java androidA";
		String newStr = str.replace('A', 'B');
		System.out.println(str);
		System.out.println(newStr);
	}
	
	@Test
	public void test5() {
		String str = "java Android python";
		String[] array = str.split(" ");
		System.out.println(Arrays.toString(array));
	}
	
	@Test
	public void test6() {
		String str = "java Android";
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 8));
	}
	
	@Test
	public void test7() {
		String str = "   java Android  ";
		System.out.println(str.trim());
	}
}


