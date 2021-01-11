package homework;

import java.util.Scanner;

import org.junit.Test;

public class HomeWorkDay4 {
	@Test
	public void work1() {
		int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] counts = new int[10];
		for (int i = 0; i < scores.length; i++) {
			int num = scores[i];
			counts[num]++;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println("scores数组中" + i + "的个数为" + counts[i]);
		}
	}
	
	@Test
	public void work1_2() {
		int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		for (int i = 0; i < 10; i++) {
			int count = 0;  //计数器归零
			for (int j = 0; j < scores.length; j++) {
				if (scores[j] == i) {
					count++;
				}
			}
			System.out.println(i + "有" + count + "个");
		}
	}
	
	
	
	@Test
	public void work2() {
		int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int oddNum = 0;
		int evenNum = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] % 2 == 0) {
				evenNum++;
			} else {
				oddNum++;
			}
		}
		System.out.println("奇数个数为" + oddNum + "偶数个数为" + evenNum);
	}
	
	@Test
	public void work2_2() {
		int[] scores={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int oddNum = 0;
		int evenNum = 0;
		for (int i = 0; i < scores.length; i++) {
			switch (scores[i]) {
			case 0:
			case 2:
			case 4:
			case 6:
			case 8:
				evenNum++;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				oddNum++;
			    break;
			default:
				System.out.println("default");
				break;
			}
		}
		System.out.println("奇数个数为" + oddNum + "偶数个数为" + evenNum);
	}
	
	@Test
	public void work3() {
		int[] scores = new int[3];
		double sumScore = 0.0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生的成绩");
			scores[i] = sc.nextInt();
			System.out.println("第" + (i + 1) + "个学生的成绩是" + scores[i]);
			sumScore += scores[i];
		}
		System.out.println("平均成绩是：" + (sumScore / 3));
		sc.close();
	}
	
	@Test
	// !!!!!!!!
	public void work16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		String str = sc.nextLine();
		char[] array = str.toCharArray();
		int al = array.length;
		int middle = al / 2;
		System.out.println("需要比对的值有" + middle + "个");
		boolean isHuiWen = true;
		sc.close();
		for (int i = 0; i < middle; i++) {
			if(array[i] != array[al - i - 1]) {
				isHuiWen = false;
				return;// ！！！！！！！！！！！！！！！！！！！！！
			}
		}
		if (isHuiWen) {
			System.out.println("是回文数");
		} else {
			System.out.println("不是回文数");
		}
		
	}
	
	@Test
	public void work17() {
		// 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一行字符 包含英文字母 空格 数字 和 其他的字符");
		String str = scanner.nextLine();
		System.out.println("输入的字符串是" + str);
		char[] array = str.toCharArray();
		
		// 计数变量
		int characterNum = 0; 
		int numberNum = 0;
		int spaceNum = 0; 
		int otherNum = 0; 
		for (int i = 0; i < array.length; i++) {
			if ((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z')) {
				characterNum++;
			} else if (array[i] >= '0' && array[i] <= '9') {
				numberNum++;
			} else if (array[i] == ' ') {
				spaceNum++;
			} else {
				otherNum++;
			}	
		}
		System.out.println("其中字母的个数是：" + characterNum);
		System.out.println("数字的个数是：" + numberNum);
		System.out.println("空格的个数是：" + spaceNum);
		System.out.println("其他的个数是：" + otherNum);
		scanner.close();
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test3() {
		double profit = 0; // 利润 单位元
		double reward = 0; // 奖金 单位元
		System.out.println("请输入利润（单位：元）：");
		Scanner sc = new Scanner(System.in);
		profit = sc.nextDouble();
		if (profit <= 0) {
			System.out.println("还敢跟老板提奖金？");
			return;
		}
		switch ((int)profit/ 100000){
		case 0:
			reward = profit * 0.1;
			break;
		case 1:
			reward = 10000 + (profit-100000) * 0.075;
			break;
		case 2:
		case 3:
			reward = 17500 + (profit-200000) * 0.05;
			break;
		case 4:
		case 5:
			reward = 27500 + (profit-400000) * 0.03;
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			reward = 33500 + (profit - 600000) * 0.015;
			break;
		default:
			reward = 39500 + (profit - 1000000) * 0.01;
			break;
		}
		System.out.println("奖金是" + reward + "元!!!");
		sc.close();
	}
	
	@Test
	public void test11() {
		char c1 = 'A';
		int a = c1;
		int a1 = 'A';
		System.out.println(a);
		System.out.println(a1);
		System.out.println(c1);
		int b1 = 65;
		char c2 = (char)b1;
		System.out.println(c2);
	}
	
	@Test
	public void test12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = sc.nextLine();
		char[] array = str.toCharArray();
		boolean isHuiWen = true;
		
		for (int i = 0,j = array.length - 1; i < array.length / 2; i++,j--) {
			if (array[i] != array[j]) {
				isHuiWen = false;
				break;
			}
		}
		
		if (isHuiWen) {
			System.out.println("shi");
		} else {
			System.out.println("bu shi");
		}
		sc.close();
	}
	
}


