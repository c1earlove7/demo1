package homeWorkDay5;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSize(60);
		vehicle.setSpeed(100);
		System.out.println("速度是" + vehicle.getSpeed() + "大小是"+ vehicle.getSize());
		// 加速 10
		vehicle.speedUp(vehicle.getSpeed());
		System.out.println("加速后的速度是" + vehicle.getSpeed());
		// 减速 20
		vehicle.speedDown(vehicle.getSpeed());
		System.out.println("减速后的速度是" + vehicle.getSpeed());
	}
}
