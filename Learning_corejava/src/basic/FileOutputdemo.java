package basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputdemo {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D://test.txt");
			System.out.println("file created");
			String str = "this is my first io practical";
			byte b[] = str.getBytes();
			fos.write(b);
			System.out.println("writtennn");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
