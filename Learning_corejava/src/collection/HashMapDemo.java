package collection;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "php");
		map.put(1, "android");
		
		System.out.println(map);
		
	}
}
