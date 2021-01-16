package day9Homework;

public class Student {
	private Integer sId;
	private Integer sAge;
	private String sName;
	private String sGender;
	
	public Student(Integer sId, Integer sAge, String sName, String sGrender) {
		// super();
		this.sId = sId;
		this.sAge = sAge;
		this.sName = sName;
		this.sGender = sGrender;
	}

	public Integer getsId() {
		return sId;
	}

	public Integer getsAge() {
		return sAge;
	}

	public String getsName() {
		return sName;
	}

	public String getsGrender() {
		return sGender;
	}

	@Override
	public String toString() {
		return "HomeworkArrayListStudent [sId=" + sId + ", sAge=" + sAge + ", sName=" + sName + ", sGrender=" + sGender
				+ "]";
	}
	
	
	
	
}
