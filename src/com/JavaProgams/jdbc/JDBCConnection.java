package com.JavaProgams.jdbc;   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 

public class JDBCConnection {

	public static void main(String[] args) {
		System.out.println("Hi im ready");
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");   
		    Statement smt = con.createStatement(); 
		    smt.executeUpdate("create table emp(eno number, ename varchar(15),esal number)");
		    System.out.println("Table Created Successfully...!");
			 con.close();  
			  
			}catch(Exception e)
        	{
		    	System.out.println(e);
	 	}  
			  
	}

}
