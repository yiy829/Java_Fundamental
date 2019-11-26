package java_20191126;

public class Sub extends Super {
	// 같은 패키지 있었을 때, 부모에 있는 private 패키지는 상속이 안된다.
	// OOP 적으로 만들어서 속성을 봐보고 어떤 객체가 최상위에 있어야 할지 판단 
	String chicken;
	/* 숨겨져 있는 것
	public sub(){
		super(); // 부모클래스의 디폴트 생성자를 호출.
	}
	*/
	public void gotoSchool() {
		System.out.println("Sub gotoSchool()");

	}

}
