package day8;

public class Teacher {
	// 静态代码块
	static {
		System.out.println("Teacher.static");
	}
	
	//代码块
	{
		System.out.println("代码块");
	}
	
	public Teacher() {
		System.out.println("Teacher.teacher()");
	}
	
}
