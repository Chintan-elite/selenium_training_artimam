package collection;

import java.util.ArrayList;

public class arrayListDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("testing");
		al.add("php");
		al.add(null);
		al.add("php");
		
		//al.add(1,"android");
		//al.set(1, "android");
		//al.remove(1);
		//System.out.println(al.get(1));
		
		
		
		for(String s : al)
		{
			System.out.println(s);
		}
		
		
		
		
	}
}
