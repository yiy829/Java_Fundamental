package java_20191125;

public class Member { //정보의 은닉화
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String ssn;
	private int age;
	private double height;
	private String password;
	private String email;

	//alt + shift + s => r => tab => enter => tab * 4 => enter
	
	// name에 대한 setter 메서드 (조정가능)
	// Setter는 정보를 바꾸기 때문에 매개변수 필요.
	public void setName(String n) {
		name = n;
	}


	// name에 대한 getter 메서드 (정보수확 가능)
	// Getter은 불러오기만 하기 때문에 매개변수 필요없음.
	public String getName() {
		return name;
	}

	public void setZipcode(String z) {
		zipcode = z;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setAddress1(String a) {
		address1 = a;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress2(String a2) {
		address2 = a2;
	}

	public String getAddress2() {
		return address2;
	}
	
	public void setSsn(String s) {
		ssn = s;
	}

	public String getSsn() {
		return ssn;
	}
	
	
	public void setAge(int g) {
		age = g;
	}

	public int getAge() {
		return age;
	}
	
	public void setHeight(double h) {
		height = h;
	}

	public double getHeight() {
		return height;
	}
	
	public void setPassword(String p) {
		password = p;
	}

	public String getPassword() {
		return password;
	}
	
	public void setEmail(String e) {
		email = e;
	}

	public String getEmail() {
		return email;
	}
	
}
