package java_20191211;

import java.util.ArrayList;

import java_20191211.dao.EmpDao;
import java_20191211.dto.EmpDto;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		// dao.insert(new EmpDto(9002, "SUNG2", "SALESMAN", 7839, null, 4998, 0,
		// 10));
		// dao.update(new EmpDto(9002, "SUNG4", "SALESMAN", 7839, null, 5001,
		// 20, 20));
		// dao.delete(9002);

		/*ArrayList<EmpDto> list = dao.select(0,5);
		for (EmpDto dto : list) {
			int no = dto.getNo();
			String name = dto.getName();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hiredate = dto.getHiredate();
			double sal = dto.getSal();
			double comm = dto.getComm();
			int deptNo = dto.getDeptNo();

			System.out.printf("%d, %s, %s, %d, %s, %f, %f, %d %n",
					no, name, job, mgr, hiredate, sal, comm, deptNo);
		}*/

		EmpDto dto = dao.select(9000);

		if (dto != null) {
			int no = dto.getNo();
			String name = dto.getName();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hiredate = dto.getHiredate();
			double sal = dto.getSal();
			double comm = dto.getComm();
			int deptNo = dto.getDeptNo();

			System.out.printf("%d, %s, %s, %d, %s, %f, %f, %d %n", no, name, job, mgr, hiredate, sal, comm, deptNo);
		} else {
			System.out.println("해당 사항이 존재 하지 않습니다.");
		}

	}
}
