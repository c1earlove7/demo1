package homeWorkDay5;

import java.util.Scanner;

public class RectangleDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入长方形的宽度：");
		int width = scanner.nextInt();
		System.out.println("请输入长方形的高度：");
		int height = scanner.nextInt();
		scanner.close();
		
		Rectangle rectangle = new Rectangle();
		rectangle.testPerimeterAndArea();
		System.out.print("调用无参方法时的周长和面积是");
		System.out.print(rectangle.getPerimeter() + "\t");
		System.out.print(rectangle.getArea() + "\n");
		
		rectangle.testPerimeterAndArea(width);
		System.out.print("调用一个参数方法长宽都是输入宽度时的周长和面积是");
		System.out.print(rectangle.getPerimeter() + "\t");
		System.out.print(rectangle.getArea() + "\n");
		
		rectangle.testPerimeterAndArea(width,height);
		System.out.print("调用两个参数时的周长和面积是");
		System.out.print(rectangle.getPerimeter() + "\t");
		System.out.print(rectangle.getArea() + "\n");
		
	
	}
}
