package java_20191126;

public class Child extends Parent{
	double height = 170.23;
	//overriding : 부모의 메서드를 재정의
	//1. 메서드 이름, 매개변수, 반환형 일치
	//2. 접근 한정자는 부모보다 자식이 상위이거나 같으면 됨
	public void work(){
		// super.work(); //Parent 클래스의 work() 메서드 호출
		// => 부모의 있는 기능을 자식에 호출 할 때 사용 
		// 부모의 기능을 완전재정의 하려면 super.work() 를 지우면 됌
		System.out.println("Child's work()");
	}
	
	public void playGame(){
		System.out.println("Child playGame()");
	}
}
