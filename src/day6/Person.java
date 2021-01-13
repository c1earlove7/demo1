package day6;

public class Person {
	protected int id;
	protected String name;
	protected int age;
	
	public Person() {
		super();//不继承其他父类 默认extend object java是单继承 这个super（）可以不用写 java会自动部
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
