package day7;

import org.junit.Test;

public class test {
	@Test
	public void test55() {
		Sub sub = new Sub(3, 5);
		show(sub);
	}
	
	private void show(Cal cal) /*Cal cal = sub  Cal cal = add*/{
		System.out.println(cal.getResult()/*站在Cal实现getResult()......*/);
	}
}
