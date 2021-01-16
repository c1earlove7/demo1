package day9;

import org.junit.Test;

// 包装数据类型
public class Demo {

	@Test
	public void test1() {
		System.out.println(Integer.MAX_VALUE);;
		int num = 12;
		// 1、把基本数据类型转换成字符串
		// 基本数据类型和字符串拼接，拼接后的结果是一个字符串
		String str = 12 + "";// "12"
		String str1 = Integer.toString(12);
		String str2 = Double.toString(3.14);// "3.14"
		
		// 2、把字符串转换成包装数据类型  "12"  "3.14"
		String s1 = "12a";
		String s2 = "3.14";
		System.out.println(s1 + s2);// 123.14
		// java.lang.NumberFormatException: For input string: "12a"
		int num1 = Integer.parseInt(s1); 
		double num2 = Double.parseDouble(s2);
		System.out.println(num1 + num2);// 15.14
		
		Integer integer = new Integer("12");
		System.out.println(integer);// 12
		int i = integer.intValue();
	}
	
	@Test
	public void test5() {
		// 自动拆箱和装箱
		// Integer integer = new Integer(4);
		Integer integer = 4;// 自动装箱，等价于上面new Integer(4);
		int i = integer;//  自动拆箱 integer.intValue()
		int num = 4;
		num = num + 2;
		integer = integer + 2;// 自动拆箱 integer.intValue()
		// integer.intValue() + 2 = 6
		// 得到int类型的值6又赋值给Integer类型，做了自动装箱
		System.out.println(integer);
		
	}
}
