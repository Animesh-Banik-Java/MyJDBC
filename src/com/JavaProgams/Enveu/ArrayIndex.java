package com.JavaProgams.Enveu;

import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s[] = {"mac","linux","window","kaliLinux"};
      System.out.println("Array: "+s);
      Arrays.sort(s);
      System.out.println(Arrays.toString(s));
      // get index of mac element
      for(int i=0; i<=s.length-i; i++) {
    	  if(s[i].equals("mac")) {
    		  System.out.println("index number of Mac: "+i);
    	  }else {
    		  System.out.println("index number of Not Mac: ");
    	  }
      }
	}

}
