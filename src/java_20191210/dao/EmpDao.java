package java_20191210.dao;

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
		if(single == null){
			single = new EmpDao();
		}
		return single;
	}
	
	public boolean insert(EmpDto eto) {
		boolean isSuccess = false;
		return isSuccess;
	}
	
	public boolean update(EmpDto eto){
		boolean isSuccess = false;
		return isSuccess;
	}
	
	public boolean delete(int no){
		boolean isSuccess = false;
		return isSuccess;
	}
	public ArrayList<EmpDto> select() {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		return list;
	}
	public EmpDto select(int no){
		EmpDto eto = null;
		return eto;
	}
}
