package day9Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
	
	// 搜索初始化 定义isSearchContinue为真 进入搜索循环 输入搜索类型 如果数字为0 设为假 跳出循环 
	public void searchInit(ArrayList<Student> studentList) {
		boolean isSearchContinue = true;
		Scanner scanner = new Scanner(System.in);
		while (isSearchContinue){
			System.out.println("请输入搜索类型 1id 2name 3age 4gender 5退出");
			int switchNum = scanner.nextInt();
			if (switchNum == 0) {
				isSearchContinue = false;
			} else {
				switch(switchNum) {
				case 1:
					System.out.println("根据id搜索,请输入id：");
					Integer stuID = scanner.nextInt();
					searchById(studentList, stuID);
					break;
				case 2:
					System.out.println("根据name搜索，请输入name：");
					String stuName = scanner.next();
					searchByName(studentList, stuName);
					break;
				case 3:
					System.out.println("根据age搜索，请输入age");
					Integer stuAge = scanner.nextInt();
					searchByAge(studentList, stuAge);
					break;
				case 4:
					System.out.println("根据gender搜索，请输入gender：");
					String stuGender = scanner.next();
					searchByGender(studentList, stuGender);
					break;
				}
			}
		}
		scanner.close();
	}
	
	
		
	public void searchByAge(ArrayList<Student> studentList, Integer stuAge) {
		boolean isSearched = false;
		for (Student i : studentList) {
			if (i.getsAge() == stuAge) {
				System.out.println(i);
				isSearched = true;
			} 
		}
		if (!isSearched) {
			System.out.println("没有找到");
		}
	}
	public void searchById(ArrayList<Student> studentList, Integer stuId) {
		boolean isSearched = false;
		for (Student i : studentList) {
			if (i.getsId() == stuId) {
				System.out.println(i);
				isSearched = true;
			} 
		}
		if (!isSearched) {
			System.out.println("没有找到");
		}
	}
	public void searchByName(ArrayList<Student> studentList, String stuName) {
		boolean isSearched = false;
		for (Student i : studentList) {
			if (i.getsName().equals(stuName)) {
				System.out.println(i);
				isSearched = true;
			} 
		}
		if (!isSearched) {
			System.out.println("没有找到");
		}
	}
	public void searchByGender(ArrayList<Student> studentList, String stuGender) {
		boolean isSearched = false;
		for (Student i : studentList) {
			if (i.getsGrender().equals(stuGender)) {
				System.out.println(i);
				isSearched = true;
			} 
		}
		if (!isSearched) {
			System.out.println("没有找到");
		}
	}
}
