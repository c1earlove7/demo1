package interfaceAndAbstract;

public class MiFeng extends AbstractInsect implements Fly{

	@Override
	public void fly() {
		System.out.println("MiFeng.fly()");
	}

	@Override
	public void chanLuan() {
		System.out.println("MiFeng.chanLuan()");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

}
