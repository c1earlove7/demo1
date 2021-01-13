package interfaceAndAbstract;

public interface Fly {
	public static final double PI = 3.14;
	
	public abstract void fly();
	
	void jump();
	
	// 接口变量都自动加 public static final是常量   方法都默认加public abstract 抽象  
}
