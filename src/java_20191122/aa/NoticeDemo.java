package java_20191122.aa;



public class NoticeDemo {
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.hit = 100;
		// n.regdate = "2019-11-22"; 
		// 같은 패키지 다른 클래스 내에선 private 접근 불가능!!!
		// http 사용할때 쓰임
	}
}
