package interfaceAndAbstract;

import org.junit.Test;

public class OOPDemo {
	
	@Test
	public void Test() {
		DaYan dayan = new DaYan();
		dayan.egg();
		dayan.fly();
		// 站在fly借口角度看大雁只有fly方法
		Fly dayan1 = new DaYan();
		dayan1.fly();
		// 站在抽象类bird方向看大雁 只有下蛋egg方法
		AbstractBird dayan2 = new DaYan();
		dayan2.egg();
		
		// AbstractBird dayan3 = new AbstractBird();
		// 抽象类和接口不能实例化
		
	}
}
