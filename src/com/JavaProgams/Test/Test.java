package com.JavaProgams.Test;

public class Test implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		Thread t = new Thread(test);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name= "NAMAN";
		System.out.println(name); 
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i)); 
		}
		
	}

}
