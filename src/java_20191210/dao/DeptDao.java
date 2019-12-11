package java_20191210.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.dto.DeptDto;

public class DeptDao {
	static { // 매번 new로 객체생성하기 힘들므로 애초에 로드해놓고 시작
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 1. Singleton pattern
	//single변수는 static 메서드에서 사용해야 하기 때문에 static 변수로 설정해야 한다.
	//따라서, 이메서드에서는 DeptDao 객체를 하나만 생성할 수 있게 코딩해야 한다.(Singleton)
	private static DeptDao single;
	//외부에서 접근하지 못하기 위해 private. 외부에서 객체를 생성할 수 없다.
	private DeptDao() {
	} //외부에서 DeptDao 객체를 생성하기 위해서는 getInstance() 메서드를 이용해야 한다. 
	// private이기 때문에 DeptDao.getInstance로 불러내기. 단 객체는 하나밖에 못만듬
	//아무리 여러 single 객체를 만들어도 불러와지는건 한개. new를 할 수 없기 때문에 single을 만듬
	//여러객체를 생성하면 데이터베이스에 여러 클래스가 진입하게되 좋지 않으므로(커플링?) singleton으로 해결 
	public static DeptDao getInstance() { //getInstance객체는 자기자신을 반환한다.
		if (single == null) {
			single = new DeptDao(); // single객체가 없으면 새로 만들기.
		}
		return single; // single이 만들어져있으면 해당 객체로 return.
	}

	// Integer도 좋으나, 조건이 까다롭기때문에 boolean
	public boolean insert(DeptDto dto) { // 칼럼갯수가 얼마 안되면 직접 int ddd 집어넣을수 있으나
		boolean isSuccess = false; // 100개가 되면 다 적기 힘드므로, dto를 활용한다.
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn",
					"acorn12",
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(?,?,?)");
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, dto.getNo());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());

			pstmt.executeUpdate();
			isSuccess = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isSuccess;
	}

	public boolean update(DeptDto dto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/acorn", 
					"acorn12", 
					"acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());
			pstmt.setInt(++index, dto.getNo());
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		return isSuccess;
	}

	public boolean delete(int deptNo) { // primary key 만으로만 가능
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn", 
					"acorn12", 
					"acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM dept ");
			sql.append("WHERE deptno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, deptNo);
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
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
		return isSuccess;
	}

	public ArrayList<DeptDto> select() { // 다갖고 오는거
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn", 
					"acorn12", 
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery(); 
			
			while(rs.next()){
				int index = 0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				list.add(new DeptDto(deptno,dname,loc));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}

	public DeptDto select(int deptNo) { // 하나만 갖고 오는거
		DeptDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn", 
					"acorn12", 
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("where deptno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, deptNo);
			
			rs = pstmt.executeQuery(); 
			
			if(rs.next()){ // 결과가 있으면 1개만 리턴하고 없으면 null이다.
				index = 0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				dto = new DeptDto(deptno,dname,loc);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return dto;
	}

}
