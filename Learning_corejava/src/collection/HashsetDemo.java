package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetDemo {
	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		//LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("java");
		
		
//		for(String s : set)
//		{
//			System.out.println(s);
//		}
		
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());	
		}
		
		
		
		
		
		
	}
}
