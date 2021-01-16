package day9;

public class Teacher {
	// private int id;// 0
	private Integer id;
	private String name;
	private Double salary;
	
	// 假设wenDu这个变量记录的是当前这个城市的温度
	// 基本数据类型都有默认值，如果这个默认值是一个有效数据
	// private double wenDu;// 0.0
	private Double wenDu; // null

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getWenDu() {
		return wenDu;
	}

	public void setWenDu(Double wenDu) {
		this.wenDu = wenDu;
	}
	
	
	
	
}
