package java_20191211;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Drvier");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		boolean isSuccess = false;

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/acorn", "acorn12", "acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(50, 'aaa', 'aaa')");
			con.setAutoCommit(false);// 트랜젝션 시작

			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();

			sql.setLength(0);// 기존에 있던 append문을 삭제시킴. 지울때 자주 사용
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(60, 'bbb', 'bbb')"); // 일부러 에러나게 함
																						

			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (isSuccess) {
					con.commit(); //모두 수행
				} else {
					con.rollback(); //모두 수행하지 않음
				}
				
				con.setAutoCommit(true); //Connection Pool을 사용하는 경우에는 반드시 작성해야하는 코드
				//해당객체를 false로 놓으면 자원을 사용하겠단 뜻이고, 다 사용한뒤 true로 놓으면 원상복구하겠단 의미
				if (pstmt1 != null)	pstmt1.close();
				if (pstmt2 != null)	pstmt2.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
