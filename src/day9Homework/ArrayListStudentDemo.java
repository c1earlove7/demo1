package day9Homework;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListStudentDemo {

	public static void main(String[] args) {
		InitStudentList studentList = new InitStudentList();
		System.out.println("创建学生列表成功");
		ArrayList<Student> liststudent = studentList.initStudentList();
		if (liststudent != null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("是否进入查询？ （Y/N）");
			String isToSrarch = sc.next();
			Search search = new Search();
			sc.close();
			if (isToSrarch == "Y") {
				search.searchInit(liststudent);
			} else if (isToSrarch == "N") {
				System.out.println("不进入搜索");
			}
		} else {
			System.out.println("学生列表为空，不进入搜索");
		}	
	}	
}
