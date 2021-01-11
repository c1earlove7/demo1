package homework;

import java.util.Scanner;

import org.junit.Test;

public class HomeworkDay2 {
	public static void main(String[] args) {}
		
	    @Test
		public void changeNumber() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("请输入第一个数:");
			int num1 = scanner.nextInt();
			System.out.println("请输入第二个数:");
			int num2 = scanner.nextInt();
			System.out.println("第一个数是：" + num1 +" "+ "第二个数是：" + num2);
			
			// 中间变量temp,并交换
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("交换后第一个数是：" + num1 +" "+ "第二个数是：" + num2);
			scanner.close();
		}
		
		@Test
		public void collection() {
			// 定义输入----单价Unit Price、数量 num、用户输入金额 cash
			// 定义输出----应收金额 need collection、找零 give change
			double unitPrice,cash;
			int num;
			double needCollection,giveChange;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入商品单价：");
			unitPrice = scanner.nextDouble();
			System.out.println("请输入客户购买数量：");
			num = scanner.nextInt();
			System.out.println("请输入用户付款金额：");
			cash = scanner.nextDouble();
			
			needCollection = unitPrice*num;
			
			if (cash >= needCollection) {
				if (needCollection >= 500)
					needCollection *= 0.8;
				System.out.println("消费超过500元，按八折收费！");
				giveChange = cash - needCollection;
				System.out.println("用户共需要收款:" + needCollection + "元" + " " + "用户实际缴费：" + cash + "元" + " " + "应找零:" + giveChange + "元");
			} else {
				giveChange = needCollection - cash;
				System.out.println("用户共需要收款:" + needCollection + "元" + " " + "用户实际缴费：" + cash + "元" + "请补交:" + giveChange + "元");
			}
			scanner.close();
			
		}
}
