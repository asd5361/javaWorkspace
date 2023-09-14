package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("쓰레드========");
		 
		//현재 쓰레드 이름 확인
//		 Thread x = Thread.currentThread();
//		 System.out.println(Thread.currentThread().getName());
		
		
		Thread x = new Thread(new KhClass());
		x.start();
	}

}
