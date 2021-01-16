package day9Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class InitStudentList {
	public ArrayList<Student> initStudentList() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("是否添加学生信息（Y/N）");
		int isContinue = isContinue(scanner);
		if (isContinue == 2) {
			return null;
		}
		// init StudentList
		ArrayList<Student> studentList = new ArrayList<Student>();
		while(true) {
			System.out.println("请输入学生ID");
			int id = scanner.nextInt();
			System.out.println("请输入学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生姓名：");
			String name = scanner.next();
			System.out.println("请输入学生性别");
			String gender = scanner.next();
			Student student = new Student(id, age, name, gender);
			studentList.add(student);
			
			System.out.println("是否继续添加学生信息（Y/N）");
			int isContinue1 = isContinue(scanner);
			if (isContinue1 == 2) {
				break;
			}
		}
		
		return studentList;
	}
	private static int isContinue(Scanner scanner) {
		String isContinue = scanner.next();
		if (isContinue.equals("Y")) {
			return 1;
		} else if (isContinue.equals("N")) {
			return 2;
		} else {
			System.out.println("输入不合法 请重新输入");
			return isContinue(scanner);
		}
	}
}
