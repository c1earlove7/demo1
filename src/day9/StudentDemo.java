
package day9;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量");
		int count = scanner.nextInt();
		Student[] array = new Student[count];
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入学生id：");
			int id = scanner.nextInt();
			System.out.println("请输入学生姓名：");
			String name = scanner.next();// next()输入字符串中间不能有空格  "zhang san"
			System.out.println("请输入学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生性别: ");
			String gender = scanner.next();
			
//				Student student = new Student();
//				student.setId(id);
//				student.setName(name);
//				student.setAge(age);
//				student.setGender(gender);
			
			Student student = new Student(id, name, age, gender);
			array[i] = student;
		}
		
		for (int i = 0; i < array.length; i++) {
			//Student stu = array[i];
			//System.out.println(stu);
			System.out.println(array[i]);
		}
		
		// 将程序写到无限循环里面，用户可以不停的搜索，当输入0的时候退出搜索
		// 根据id搜索输入：1
		// 根据name搜索输入：2
		// 根据age搜索输入：3
		// 根据gender搜索输入：4
		// 退出程序输入：0
		Search search = new Search();
		boolean flag = true;	
		while (flag) {
			System.out.println("请选择搜索方式");
			System.out.println("-----根据id搜索输入：1-----");
			System.out.println("-----根据name搜索输入：2-----");
			System.out.println("-----根据age搜索输入：3-----");
			System.out.println("-----根据gender搜索输入：4-----");
			System.out.println("-----退出程序输入：0-----");
			
			System.out.println("请输入你的搜索方式：");
			int type = scanner.nextInt();
			
			switch (type){
			case 1:
				System.out.println("根据id搜索,请输入id：");
				Integer stuID = scanner.nextInt();
				search.searchById(array, stuID);
				break;
			case 2:
				System.out.println("根据name搜索，请输入name：");
				String stuName = scanner.next();
				search.searchByName(array, stuName);
				break;
			case 3:
				System.out.println("根据age搜索，请输入age");
				Integer stuAge = scanner.nextInt();
				search.searchByAge(array, stuAge);
				break;
			case 4:
				System.out.println("根据gender搜索，请输入gender：");
				String stuGender = scanner.next();
				search.searchByGender(array, stuGender);
				break;
			case 0:
				System.out.println("搜索结束");
				flag = false;
				break;
			default:
				System.out.println("请重新输入正确的数字");
				break;
			}
			
		}	
	}
}

