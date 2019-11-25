package java_20191122.bb;

// 서로 다른 패키지의 클래스를 사용하기 위해서는 반드시 import 해줘야 한다.
import java_20191122.aa.Notice;
// default class 로 만들면 import 조차도 안됌


public class NoticeDemo2 extends Notice { // 상속해버림
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10; // 서로 다른 Package에선 Public만 가능
		// n.title = "title"; // 상속받은 클래스로 객체를 생성한 경우만 사용 가능
		// n.hit = 100;
		// n.regdate = "2019-11-22";
		// 서로 다른 패키내에서 사용하려면 Import를 해줘야 사용 가능 클래스를 public으로 해놔야 가능
		
		NoticeDemo2 nc = new NoticeDemo2();
		nc.number = 10;
		nc.title = "title";
	}
}
