package java_20191126.Sub;
import java.lang.*; // 생략 되어있음
public class Super extends Object { 
	// extends Object 생략되어있음. 항상 최상위 object = Object
	int money;
	public Super(int money){
		super(); // 모든 생성자에는 다 숨겨져 있음
		this.money = money;
	}
	public Super(){ // 디폴트 생성자를 강제적으로 만들어줘야 함.
		super();
	}
	public void makeMoney(){
		System.out.println("Super makeMoney()");
	}
	
	public void play(String omok){
		System.out.println("Super play()");
	}
	
}
