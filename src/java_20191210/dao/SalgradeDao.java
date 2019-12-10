package java_20191210.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.dto.DeptDto;
import java_20191210.dto.SalgradeDto;

public class SalgradeDao {
	private static SalgradeDao single;
	private SalgradeDao(){
	}
	
	public static SalgradeDao getInstance() {
		if (single == null) {
			single = new SalgradeDao();
		}
		return single;
	}
	
	public boolean insert(SalgradeDto dto){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn",
					"acorn12",
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO ");
			sql.append("salgrade(grade, losal, hisal) ");
			sql.append("VALUES(?, ?, ?) ");
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, dto.getGrade());
			pstmt.setInt(++index, dto.getLosal());
			pstmt.setInt(++index, dto.getHisal());

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
	
	public boolean update(SalgradeDto dto){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn",
					"acorn12",
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE salgrade ");
			sql.append("SET losal = ?, hisal = ? ");
			sql.append("WHERE grade = ? ");
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, dto.getLosal());
			pstmt.setInt(++index, dto.getHisal());
			pstmt.setInt(++index, dto.getGrade());

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
	public boolean delete(int Grade){
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn", 
					"acorn12", 
					"acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM salgrade ");
			sql.append("WHERE grade = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, Grade);
			
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
	public ArrayList<SalgradeDto> select() {
		ArrayList<SalgradeDto> list = new ArrayList<SalgradeDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn", 
					"acorn12", 
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("ORDER BY grade ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery(); 
			
			while(rs.next()){
				int index = 0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				list.add(new SalgradeDto(grade,losal,hisal));
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
	
	public SalgradeDto select(int Grade){
		SalgradeDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn", 
					"acorn12", 
					"acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("where grade = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, Grade);
			
			rs = pstmt.executeQuery(); 
			
			if(rs.next()){ // 결과가 있으면 1개만 리턴하고 없으면 null이다.
				index = 0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				dto = new SalgradeDto(grade,losal,hisal);
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
