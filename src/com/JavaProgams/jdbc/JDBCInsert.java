package com.JavaProgams.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");   
			
			PreparedStatement ppstm = con.prepareStatement("insert into emp values(?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("Enter your emplayee ID: ");
				int eID = Integer.parseInt(br.readLine());
				
				System.out.println("Enter your Name: ");
				String eName = br.readLine();
				
				System.out.println("Enter your Salary: ");
				double eSalary = Double.parseDouble(br.readLine());
				
				ppstm.setInt(1, eID);
				ppstm.setString(2, eName);
				ppstm.setDouble(3, eSalary);
				
				int count = ppstm.executeUpdate();
				if(count>0) {
					System.out.println(count +" Records inserted...!");
					}else {
						System.out.println("No Records inserted...!");
						System.out.println("Do you want to more Records...!");
						
						String ch = br.readLine();
						if(ch.equalsIgnoreCase("no")) {
							break;
						}
						
					}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}  

	}

}
