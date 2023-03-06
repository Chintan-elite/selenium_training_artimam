package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputstreamDemo {
	 public static void main(String[] args) {
		
		 
		 try {
			FileInputStream fis = new FileInputStream("D://test.txt");
			int i =  fis.read();
			while(i!=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
				
			}
		 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
