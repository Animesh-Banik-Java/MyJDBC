package com.JavaProgams.jdbc.CurdOparations;

import java.sql.*;

class Oracle1 {
	public static void main(String[] ss) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			Statement s = c.createStatement();
			s.executeUpdate("create table emp101(name varchar2(10),pass  varchar2(10))");
			//s.executeUpdate("create table emp65(id number,name  varchar2(10))" );
			System.out.println("Table Created...!");
			s.close();
		} catch (Exception e) {
		}
	}
}
