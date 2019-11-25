package java_20191122.aa;


//class 앞에 붙을수 있는 건 2가지. public , (default)안붙이는 것 / default 에선 다른 패키지에선 사용 불가능! 그러므로 모든 선언문은 public
//default class로 하게되면 public은 안된다.
// 하위 폴더로 만들었다고 해서 상속 패키지가 아닌 그냥 서로 다른 패키지
public class Notice {
	public int number;
	protected String title;
	int hit; // default
	private String regdate;     // 해당 유효범위는 처음부터 끝까지
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.hit = 100;
		n.regdate = "2019-11-22";
		
	}
}
