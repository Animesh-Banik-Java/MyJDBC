package com.JavaProgams.Enveu;

public class OuterClass implements Outer.inner, Outer{
	public static void main(String[] str) { 
		OuterClass oc = new OuterClass();
		oc.innerMethod();
 
	}

	@Override
	public void innerMethod() {
		System.out.println(100);
		
	}
 
}
 

interface Outer{
	public void innerMethod();
	interface inner{
		public void innerMethod();
	}
}
