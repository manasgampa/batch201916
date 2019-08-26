package net.antra2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx1 {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Driver d=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter empid:");
		int id=sc.nextInt();*/
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		//System.out.println(con);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("insert into employee values(2,'manas',450)");
		ResultSet rs=stmt.executeQuery("select * from employee");
		ResultSetMetaData rsm=rs.getMetaData();
		int columnCount=rsm.getColumnCount();
		
		
		while(rs.next()) {
			System.out.println(rs.getInt("empId"));
			System.out.println(rs.getString("empName"));
			System.out.println(rs.getInt("sal"));
		}
	}

}
