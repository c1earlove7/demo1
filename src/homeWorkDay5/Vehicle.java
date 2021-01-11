package homeWorkDay5;

public class Vehicle {
	private int speed;
	private int size;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void speedUp(int speed) {
		this.speed = speed + 10;
	}
	
	public void speedDown(int speed) {
		this.speed = speed - 20;
	}
	
	public void move() {
		
	}
}
