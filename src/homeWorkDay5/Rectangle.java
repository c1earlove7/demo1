package homeWorkDay5;

public class Rectangle {
	private int width ;
	private int height ;
	private int area;
	private int perimeter;
	private int a = 3;
	private int b = 4;
	
	public void test77(int a,int b) {
		a=this.a;
		b =this.b;
		
	}

	
	public int getArea() {
		return area;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void testPerimeterAndArea() {
		perimeter = 2 * (width + height); 
		area = width * height;
	}
	
	public void testPerimeterAndArea(int width) {
		perimeter = 2 * (width + width); 
		area = width * width;
	}
	
	public void testPerimeterAndArea(int width,int height) {
		perimeter = 2 * (width + height); 
		area = width * height;
	}
}
