package homeWorkDay5;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Number calculator = new Number();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数整数");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个整数");
		int num2 = scanner.nextInt();
		
		System.out.println(num1 + "加" + num2 + "的结果是" + calculator.add(num1, num2) );
		System.out.println(num1 + "减" + num2 + "的结果是" + calculator.sub(num1, num2));
		System.out.println(num1 + "乘" + num2 + "的结果是" + calculator.multi(num1, num2));
		System.out.println(num1 + "除" + num2 + "的结果是" + calculator.div(num1, num2));
		scanner.close();
	}
}
