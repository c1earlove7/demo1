package day9;

import java.util.ArrayList;

public class ArrayListDemo {

	public void test1() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		for (Integer integer : list1) {
			System.out.println(integer);
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("张三");
		list2.add("李四");
		list2.add("王五");
		// foreach
		for (String str : list2) {
			System.out.println(str);
		}
	}
}
