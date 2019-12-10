package java_20191210.dto;

public class DeptDto {
	// 데이터베이스에선 칼럼마다 헷갈리기 쉬워서 테이블명을 포함한 이름을 넣었지만
	// 자바의 변수는 테이블명을 포함하지 않는다.
	private int no;
	private String name;
	private String loc;
	//ALT SHIFT S  C, O, R
	public DeptDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
