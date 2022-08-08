package com.JavaProgams.Enveu;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Thread thread = new Thread(new Test());
			thread.start();
			System.out.println(1);
			thread.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
		
	}

}


class Test implements Runnable {
	@Override		
	public void run() {
		System.out.println(3);
	}
	
}