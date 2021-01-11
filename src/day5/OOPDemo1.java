package day5;

import org.junit.Test;

public class OOPDemo1 {
	
	@Test
	public void test() {
		Computer com = new Computer();
		com.setType("拯救者2019");
		System.out.println(com.getType());
		com.setYear(2019);
		String c = com.breathLamp();
		System.out.println(c);
		
		Computer com2 = new Computer();
		com2.setType("拯救者2018");
		System.out.println(com.getType());
		com2.setYear(2018);
		String d = com.breathLamp();
		System.out.println(d);
		com2.setSpeed(8000);
		com2.setScreen("京东方");
		
		System.out.println(com.toString());
		System.out.println(com2.toString());
	}
}
