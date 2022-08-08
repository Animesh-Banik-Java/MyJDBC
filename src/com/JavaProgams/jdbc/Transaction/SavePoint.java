package com.JavaProgams.jdbc.Transaction;

import java.sql.*;

class SavePoint {
	public static void main(String[] ss) {
		try {

			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
		
			//Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "system", "root");
			Statement s = c.createStatement();

			c.setAutoCommit(false);
			int x = s.executeUpdate("update emp101 set name='manish sir' where pass='prakash' ");
			s.executeUpdate("insert into emp101 values('dhoniwc70','dhoniwc70')");

			Savepoint savept = c.setSavepoint("aaa");
			int x1 = s.executeUpdate("delete from  emp101  where pass='rohit' ");
			s.executeUpdate("insert into emp101 values('pappu' ,'rahul')");
			c.rollback(savept);

          //c.releaseSavepoint(savept);    

			c.commit();
			ResultSet result1 = s.executeQuery("select * from  emp101");
			while (result1.next()) {
				System.out.println("id: " + result1.getString(1));
				System.out.println("name" + result1.getString(2));
			}

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
