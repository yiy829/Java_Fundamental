package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDemo {
	public static void main(String[] args) {
		try {
			//1. org.mariadb.jdbc.Driver 클래스를 메모리에 로딩한다.
			Class.forName("org.mariadb.jdbc.Driver"); 
			System.out.println("드라이브로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//2. 데이터베이스와 연결을 시도한다.
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", //url
					"acorn12", //user
					"acorn12");//password
			
			System.out.println("데이터베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(?,?,?)");
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다.
			//SQL에서 생성해본 다음 되면 복붙해서 가져오기
			// ?,?,? 는 항상 value에만 올 수 있으므로, 변수명에는 쓰지말기!!!!
			pstmt = con.prepareStatement(sql.toString());	
			
			//4. 바인딩 변수(?)를 설정한다.
			pstmt.setInt(1, 60); //deptno
			pstmt.setString(2, "ANALYSIS"); //dname
			pstmt.setString(3, "LA"); //loc
			
			//5. SQL문을 데이터베이스에 전송 및 종료한다.
			
			int result = pstmt.executeUpdate(); 
			//insert, update, delete. 즉, DML일때 사용한다.
			System.out.println("갱신된 행의 수 : " + result);
			
					
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
