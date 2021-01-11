package homeWorkDay5;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void point() {
		System.out.println("当前坐标为:(" + x + "," + y + ")");
	}
	
	public void point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("当前坐标为:(" + this.x + "," + this.y + ")");
	}
	
	public void movePoint(int dx,int dy) {
		System.out.println("当前坐标为:(" + (this.x + dx) + "," + (this.y + dy) + ")");
	}
}
