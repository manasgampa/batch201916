package net.antra2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEx2 {

	public static void main(String[] args) throws SQLException {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter empid:");
		int id=sc.nextInt();
		System.out.println("enter empName:");
		String name=sc.next();
		System.out.println("enter sal:");
		int sal=sc.nextInt();*/
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		con.setAutoCommit(false);
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		
		try {
		pstmt.setInt(1, 1);
		pstmt.setString(2, "Ryan");
		pstmt.setInt(3, 700);
		pstmt.addBatch();
		
		pstmt.setInt(1,2);
		pstmt.setString(2, "Feng Chen");
		pstmt.setInt(3, 540);
		pstmt.addBatch();
		
		pstmt.setInt(1, 3);
		pstmt.setString(2, "Hang yang");
		pstmt.setInt(3, 340);
		pstmt.addBatch();
		
		pstmt.executeBatch();
		con.commit();
		}catch(Exception e) {
			con.rollback();
		}finally {
			con.close();
		}
		
		
		
		
		
		
	}
}
