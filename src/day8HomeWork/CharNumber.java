package day8HomeWork;

public class CharNumber {
	public int countChar(String str1) {
		String[] str2 = str1.split(" ");
		StringBuilder str = new StringBuilder();
		for (String i : str2) {
			str.append(i);
		}
		return str1.length() - str.length() + 1; 
	}
}
