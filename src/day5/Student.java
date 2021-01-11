package day5;

/**
 * 张三、李四这些所有的学生都有id，name，age，gender这些信息，
 * 所以可以抽取一个类Student来描述所有学生的信息。
 * 作为一个一个学生还有身高、体重这些信息，如果我不关心我就需要抽取到Student类里面，
 * 在Student类里面抽取的都是我们关心的信息。
 * 一般把这种类叫：实体类（描述一个事物，和数据库中的表是对应）
 * 这个实体类里面不要写main也不要写@Test
 */
public class Student {
	// 属性 (静)
	private int id;  // 私有的属性只能在当前类内使用
	private String name;
	private int age;
	private String gender;
	
	// 构造方法没有返回值，方法名与类名一致
	// 这个方法是在new Student();
	// 如果我们不写，那么系统直接默认构造午餐方法。
	public Student() {
		
	}
	// 有参的方法传递数据
	public Student (int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender =gender;
	
	}
	
	// 方法（功能）
	// 方法调用：对象.方法名()
	public void study() {
		System.out.println("id是"+id+"的"+name+"正在学习");
	}
	
	// 打印当前学生信息
	// This method must return a result of type String
	public String getInfo() {
		return "Student [id: "+id+", name: "+name+", age: "+age+", gender: " + gender + "]";
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public void setId(int id /*传过来一个值*/) {
		if (age >= 0 && age <=120) //控制输入
		this.id = id; //将传过来的id赋值给定义的id
		// 不加this 就近原则 上一条里的两个this都代表着最近那个id 就是传过来的id 而不是定义的private int id；
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
    	return id;
    }
	
	
}