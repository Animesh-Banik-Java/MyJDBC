package com.JavaProgams.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeletion {
	public static void main(String[] atr) {
		System.out.println("Hi Deletion hare"); 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement stmt = con.createStatement();

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("Enter your daletion emplayee ID: ");
				int eID = Integer.parseInt(br.readLine()); 
				int count = stmt.executeUpdate("delete from emp where eno="+eID);
				if(count==1) {
					System.out.println(count +" Records Deleted...!");
					}else {
						System.out.println("No Records inserted...!");
						System.out.println("Do you want to delete more Record Yes/No");
						
						String ch = br.readLine();
						if(ch.equalsIgnoreCase("no")) {
							break;
						}else {
							System.out.println("Invalid Input try again...!");
						}
						
					}
				
			}
			
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
