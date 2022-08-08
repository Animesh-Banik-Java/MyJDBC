package com.JavaProgams.Enveu;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ol= new Overload();
		System.out.println(ol.cal(4));
		//System.out.println(ol.cal(4,4)); 
	}

	public int cal(int a, int d) {
		return (a + d);
	}
	
	public int cal(int a) {
		return (a * a);
	}
}
