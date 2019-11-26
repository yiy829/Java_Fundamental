package java_20191126.Sub;
import java.lang.*; //항상 숨겨져 있다.
public class SubDemo extends Object{
	public SubDemo() {
		super();
	} // 단축키 alt + shift + s => c : 디폴트 생성자 생성

	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.makeMoney();
		s1.gotoSchool();
		s1.play("omok");
		
		s1.money = 10000;
		s1.chicken = "교촌치킨 2마리";
		
	}
}
