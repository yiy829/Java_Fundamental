package java_20191126;
//i18n : Internationalization (국제화 : 한국어를 영어로)
//l10n : Localization (지역화 : 영어를 한국어로)

public class StaticInitializationDemo {
	int age; //instance variable
	static String title; //static variable
	static{
		//항상 먼저 호출되고 다음에 생성자, main이 호출됨
		// 선언 및 접근 항정자 을 결정
		System.out.println("static block");
		title = "모기지론";
	}
	
	//생성자의 접근 한정자는 객체 생성과 관련있다.
	//private으로 하면 다른 클래스에선 호출이 불가능. 객체생성 X (밑줄) 
	//=> 1. 모든 메서드가 class / 2. Singleterm 객체. (1개만 생성할수 있게끔 제한)
	private StaticInitializationDemo(int age){
		this.age = age;
		System.out.println("constructor");
	}
	

	// 다른 클래스에선 생성자가 private이므로 new가 호출 불가능
	public static void main(String[] args) {
		System.out.println("main");
		new StaticInitializationDemo(10);
		new StaticInitializationDemo(20);
		new StaticInitializationDemo(30);
		// 메인에선 constructor 가 호출됨
		
	}
}
