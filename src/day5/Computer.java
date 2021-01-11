package day5;

import org.junit.Test;

public class Computer {
	private int high = 80;
	private int wigth = 120;
	private String type = "拯救者2020";
	private String Screen;
	private double speed;
	private int year;

	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getScreen() {
		return Screen;
	}


	public void setScreen(String screen) {
		Screen = screen;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		if (speed>7000) {
			speed = 7000;
		}
		//???????????????????????????????????????????
		this.speed = speed;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String breathLamp() {
		if(year % 2 == 0) {
			return "red";
		} else {
			return "white";
		}
	}
	
	@Test
	public void test() {
		System.out.println(high);
	}
	
	

	@Override
	public String toString() {
		return "Computer [high=" + high + ", wigth=" + wigth + ", type=" + type + ", Screen=" + Screen + ", speed="
				+ speed + ", year=" + year + "]";
	}
}
