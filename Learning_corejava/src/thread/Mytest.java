package thread;

public class Mytest {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("java");
		
	}
}
