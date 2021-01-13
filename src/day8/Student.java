package day8;

public class Student {
	// 实例属性 （实例变量）
	private int id;
	private int name;
	// 静态属性被所有对象共享的
	public static String address; 
	//实例属性和实例方法只有new出来一个对象，通过对象.属性 对象. 方法访问
	
	public void study() {
		System.out.println("111");
	}
	
	public void xieZuoYe() {
		//实例方法
	} 
	
	// 静态方法 是属于这个类，被所有对象所共享
	public static void show() {
		System.out.println("Student.show()");
	}
	
	public static void print() {
		System.out.println("Student.print()");
		// 1.静态方法只能访问静态的方法和静态的属性
		show();
		address = "342657";
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	
	// 2. 静态的方法中不能写this、super 关键字
	
	
}
