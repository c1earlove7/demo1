

public class PoolPuzzleOne {
	
	public static void main(String[] args) {
	// 1. a空格noise 2.an 3.noys 4.空格oyster
    // 循环3 次 
		int x = 0;
	
		while (x<4) {
			
			System.out.print("a");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			
			if (x == 1) {
				System.out.print("noys");
			}
			if (x < 1) {
				System.out.print("oise");
			}
			if (x > 1) {
				System.out.print(" oyster");
				x += 2;
			}
			System.out.println(" ");
			x += 1;
		}
	}
	
}
