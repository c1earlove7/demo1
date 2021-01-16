package day9;

public class Search {
	boolean isSearchFound = false;
	public void searchById(Student[] array,Integer stuID) {
		for (int i = 0; i < array.length; i++) {
			if(stuID == array[i].getId()) {
				System.out.println(array[i]);
				isSearchFound = true;
			}
		}
		isSearch();	
	}
	
	public void searchByName(Student[] array,String stuName) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].getName().equals(stuName)) {
				System.out.println(array[i]);
				isSearchFound = true;
			}
		}
		isSearch();	
	}
	
	public void searchByGender(Student[] array,String stuGender) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].getGender().equals(stuGender)) {
				System.out.println(array[i]);
				isSearchFound = true;
			}
		}
		isSearch();	
	}
	
	public void searchByAge(Student[] array,Integer stuAge) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].getAge() == stuAge) {
				System.out.println(array[i]);
				isSearchFound = true;
			}
		}
		isSearch();	
	}
	
	public void isSearch() {
		if (isSearchFound == false) {
			System.out.println("没有找到符合条件的学生");
		} else {
			isSearchFound = false;
		}
	}
}
