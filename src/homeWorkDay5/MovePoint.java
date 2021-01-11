package homeWorkDay5;

import java.util.Scanner;

public class MovePoint {
	public static void main(String[] args) {
		Point testPoint = new Point();
		testPoint.point();
		Scanner scanner = new Scanner(System.in);
		
		// 移动初始坐标
		System.out.println("请输入横坐标");
		int x = scanner.nextInt();
		System.out.println("请输入纵坐标");
		int y = scanner.nextInt();
		testPoint.point(x, y);
		
		// 输入坐标移动量,并打印
		System.out.println("请输入横坐标移动量");
		int dx = scanner.nextInt();
		System.out.println("请输入纵坐标移动量");
		int dy = scanner.nextInt();
		testPoint.movePoint(dx, dy);
		
		scanner.close();
	}
}
