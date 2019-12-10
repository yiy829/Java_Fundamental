package java_20191210.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.dto.EmpDto;

public class EmpDao {
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static EmpDao single;

	private EmpDao() {
	}

	public static EmpDao getInstance() {
		if (single == null) {
			single = new EmpDao();
		}
		return single;
	}

	public boolean insert(EmpDto eto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn12", "acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append();
			sql.append();
			sql.append();
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, eto.getNo());
			pstmt.setString(++index, eto.getName());
			pstmt.setString(++index, eto.getJob());
			pstmt.setInt(++index, eto.getMgr());
			pstmt.setInt(++index, eto.getHiredate());
			pstmt.setInt(++index, eto.getSal());
			pstmt.setInt(++index, eto.getComm());
			pstmt.setInt(++index, eto.getDetpno());

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

	public boolean update(EmpDto eto) {
		boolean isSuccess = false;

		return isSuccess;
	}

	public boolean delete(int no) {
		boolean isSuccess = false;

		return isSuccess;
	}

	public ArrayList<EmpDto> select() {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();

		return list;
	}

	public EmpDto select(int no) {
		EmpDto dto = null;

		return dto;
	}
}
