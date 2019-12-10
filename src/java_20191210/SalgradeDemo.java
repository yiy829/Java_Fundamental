package java_20191210;

import java.util.ArrayList;

import java_20191210.dao.SalgradeDao;
import java_20191210.dto.SalgradeDto;

public class SalgradeDemo {
	public static void main(String[] args) {
		SalgradeDao d = SalgradeDao.getInstance();
		//boolean isSuccess = d.insert(new SalgradeDto(11, 5000, 5000));
		//boolean isSuccess = d.update(new SalgradeDto(11, 5000, 4000));
		//boolean isSuccess = d.delete(11);
		//System.out.println(isSuccess);
		
		/*ArrayList<SalgradeDto> list = d.select();
		for (SalgradeDto dto : list) {
			System.out.printf("%d, %s, %s %n", 
			dto.getGrade(), dto.getLosal(), dto.getHisal());
		}*/
		
		/*SalgradeDto dto = d.select(5);
		if(dto == null){
			System.out.println("데이터가 존재하지 않습니다.");
		} else {
			System.out.printf("%d, %s, %s %n", 
					dto.getGrade(), dto.getLosal(), dto.getHisal());
		}*/
	}
}
