package day8;

import java.util.Arrays;

import org.junit.Test;

public class test {
	
	public static void main(String[] args) {
		
	}
	
	@Test
	public void test1() {
		// 静态属性的方法通过：类名.属性
		Student.address = "城阳区51号";
		
		Student student1 = new Student();

		//student1.address = "城阳区51号";
		// The static field Student.address should be accessed in a static way
		// 静态属性也可以通过对象.属性访问,但是会报警告，不建议通过这种方式访问静态属性，
		// 因为静态属性时属于这个类的
		// student1.address = "青岛";
		student1.study();
		
		Student student2 = new Student();
	
		//student2.address = "城阳区51号";
		student2.study();
		
		// 静态方法调用  
		Student.show();
		student2.show();
	}
	
	@Test
	public void test3() {
		// 静态的属性和静态方法是属于这个类的，即使现在没有new任何一个对象，只要这个类
		// 加载到内存就可以访问静态属性和静态方法
		Student.address = "青岛";
		Student.print();
		Student.show();
		
	}
	
}