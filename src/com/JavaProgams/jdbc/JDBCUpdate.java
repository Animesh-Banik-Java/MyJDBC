package com.JavaProgams.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdate {
	public static void main(String str[]) {
		// TODO Auto-generated method stub
		 int eId; double eSalary; String value;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver"); 
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
					Statement stmt = con.createStatement();

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					System.out.println("Input you want to update ID: ");
					value = br.readLine();
					eId = Integer.parseInt(value);
					
					System.out.println("Input New Salary: ");
					value = br.readLine();
					eSalary = Double.parseDouble(value);
					
					int count = stmt.executeUpdate("update emp set esal="+eSalary+"where eno="+eId);
					if(count>0) {
						System.out.println(count+" Record updated...!");
					}else {
						System.out.println("Record Not Found...!");
					}
					
					con.close();
					
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
	}

}
