package day8HomeWork;

public class AchieveTrim {
	
	public String achieveTrim(String str) {
		int head; //截取头部坐标
		int end; // 截取尾部坐标
		char[] array = str.toCharArray();
		
		for (head = 0; (head < array.length) && (array[head] == ' '); head++) {}
		if (head == (array.length)) {
			return str; //如果头坐标走完了 返回空格字符串 
		} else {
			for (end = array.length - 1; array[end] == ' '; end--) {}
			return str.substring(head, end + 1); //否则字符串有非空格字符 寻找尾座标
		}
	}	
}
