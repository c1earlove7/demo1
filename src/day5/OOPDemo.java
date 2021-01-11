package day5;

import java.util.Scanner;

import org.junit.Test;

// OOP: Object Oriented Programming
public class OOPDemo {

	@Test
	public void test1() {
		int num = 2;
		double d = 3.14;
		int[] array = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		// 引用数据类型是可以new对象
		// Student是自定义的类型
		// student: 变量，对于new出来的也叫对象
		Student student1 = new Student();
		
	
		
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		student1.study();
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("张三");
		student2.setAge(24);
		student2.setGender("女");
		student2.study();
		
		
//		Teacher teacher1 = new Teacher();
//		teacher1.id = 1;
//		teacher1.name = "张三";
//		teacher1.age = 30;
//		teacher1.salary = 8000;
//		teacher1.teach();
//		System.out.println(teacher1);
	}
	
	@Test
	public void test2() {
		Student stu = new Student();
		stu.setId(1);
		stu.setName("李四");
		stu.setAge(8);
		stu.setGender("男");
		stu.study();
		String str = stu.getInfo();
		System.out.println(str);
		System.out.println(stu.getInfo());
		System.out.println(stu.toString());
		// 可以省略toString(),直接打印对象
		System.out.println(stu);
	}
}