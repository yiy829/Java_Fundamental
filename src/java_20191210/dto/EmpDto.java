package java_20191210.dto;

public class EmpDto {
	private int no;
	private String name;
	private String job;
	private int mgr;
	private int hiredate;
	private int sal;
	private int comm;
	private int detpno;
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDto(int no, String name, String job, int mgr, int hiredate, int sal, int comm, int detpno) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.detpno = detpno;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getHiredate() {
		return hiredate;
	}
	public void setHiredate(int hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDetpno() {
		return detpno;
	}
	public void setDetpno(int detpno) {
		this.detpno = detpno;
	}
	
} 
