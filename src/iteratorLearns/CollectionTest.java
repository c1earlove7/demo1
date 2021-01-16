package iteratorLearns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

// public interface Collection<E> extends Iterable<E> 接口能够继承
/*接口能够继承
 *java中提供了很多个集合，它们在存储元素时，采用的存储方式不同。
 *我们要取出这些集合中的元素，可通过一种通用的获取方式来完成。
Collection集合元素的通用获取方式：在取元素之前先要判断集合中有没有元素，
如果有，就把这个元素取出来，继续在判断，如果还有就再取出出来。
一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。 */
public class CollectionTest {
	// Collection接口是集合中的顶层接口
	// 方法一 集合元素默认为Object型，任何原色都可以储存
	Collection collection1 = new ArrayList();
	// 方法二 集合储存制定类型元素
	Collection<String> collection2 = new ArrayList<String>();
	
	@Test
	public void test1() {
		collection1.add("张三");
		collection1.add("李四");
		collection1.add("王五");
		collection1.add("张三");
		
		System.out.println(collection1);
		// 移除指定元素 从头开始找
		collection1.remove("张三");
		System.out.println(collection1);
		Object[] array = collection1.toArray();
		for (Object a : array) {
			System.out.println(a + " ");
		}
		// contains 检测数组是否包含元素
		System.out.println(collection1.contains("王五"));
	}
	
	// Iterable迭代器的应用
	@Test
	public void test2() {
		Collection<String> collection = new ArrayList<String>();
		collection.add("张三");
		collection.add("李四");
		collection.add("王五");
		collection.add("张三");
		
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			//判断有没有下一个
			String data = iterator.next();
			// 用来返回迭代的下一个元素，并把指针向后移动一位；
			System.out.println(data);
		}
	}
}	
