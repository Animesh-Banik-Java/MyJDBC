package com.JavaProgams.jdbc.Transaction;

import java.sql.*;

class Tran {
	
	public static void main(String[] ss) {
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");

			// Connection c =
			// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "system", "root");
			
			Statement s = c.createStatement(); 
			c.setAutoCommit(false);
			//s.executeUpdate("insert into emp101 values('ved','prakash')"); 
			int x = s.executeUpdate("update emp101 set name='Animesh' where pass='prakash' ");
			System.out.println(x);
			ResultSet result1 = s.executeQuery("select * from emp101 where pass='prakash' ");

			while (result1.next()) {
				System.out.println("name " + result1.getString(1));
				System.out.println("pass " + result1.getString(2));
			}
			c.commit();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

/*
 * c.rollback(); ResultSet result2=s.executeQuery("select * from emp");
 * while(result2.next()) { System.out.println("id: " + result2.getString(1));
 * System.out.println("name" + result2.getString(2));
 * 
 * } }catch(Exception e){ System.out.println(e);}
 */

//c.rollback();
/*
 * ResultSet result2=s.executeQuery("select * from emp"); while(result2.next())
 * { System.out.println("id: " + result2.getString(1));
 * System.out.println("name" + result2.getString(2));
 * 
 * }
 */
