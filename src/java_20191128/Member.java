package java_20191128;

public class Member {
	private static String id;
	private static String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "아이디 =" + Member.getId() + ", 이름 =" + Member.getName()+"\t"+"\n";
	}
	
}
