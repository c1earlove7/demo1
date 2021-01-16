package day10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Demo {
	@Test
	public void test1() {
		HashSet<Student> set = new HashSet<Student>();
		Student student1 = new Student(11,"zhangsan",212,"nan");
		Student student2 = new Student(22,"李a四hhh",21,"nan");
		Student student3 = new Student(33,"a王五",23,"n 6v");
		set.add(student1);
		set.add(student2);
		set.add(student3);
		
		for (Student student : set) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test2() {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("CN", "中国");
		map.put("UK", "美利坚合众国");
		map.put("Uk", "大不列颠");
		
		String value = map.get("CN");
		System.out.println(value);
		
		Set<Entry<String,String>> set = map.entrySet();// 返回集合 集合名字叫set  set里面放entry 将map返回到set
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value1 = entry.getValue();
			System.out.println("key:" + key + ",value:" + value1);
		}
	}
}
