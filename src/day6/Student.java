package day6;

import org.junit.Test;

public class Student extends Person {
	private String className;

	public Student() {
		
		super(); //代表new Person（）； 在new子类之前需要先把父类new出来。
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String className) {
		super(id, name, age);
		this.className = className;			
	}

	
	
	@Override
	public String toString() {
		return "Student [className=" + className + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Test
	public void pooo() {
		Student student = new Student(1, "一", 3, "一");
		System.out.println(student.toString());
	}
}
