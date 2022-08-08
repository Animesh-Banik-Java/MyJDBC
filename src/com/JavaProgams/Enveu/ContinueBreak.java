package com.JavaProgams.Enveu;

public class ContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i= 1; i<=20;i++) { 
			if(i == 5) {
				continue;
			}
			if(i==11) {
				break;
			}
			System.out.println(i);
		}
	}

}
