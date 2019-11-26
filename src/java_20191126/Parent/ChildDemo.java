package java_20191126.Parent;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.age = 55;
		p1.work();
		p1.playBadook();
		
		Child c1 = new Child();
		c1.age = 25;
		c1.height = 155.24;
		c1.playBadook();
		c1.playGame();
		c1.work();
		
		// 일반클래스에선 쓸일이 없지만 추상클래스에선 큰 의미.
		Parent p2 = new Child(); // 형변환중 하나. 
		// 자동 캐스팅 -> 원래 (Parent)new Child(); 이다.
		p2.age = 25;
		//p2.height = 155.24;
		p2.playBadook();
		//p2.playGame();
		p2.work(); // Overriding은 자식의 work가 호출 됨
		
		Child c2 = (Child)new Parent(); //에러남. 캐스팅 똑바로 해라라고 나옴
		
	
	}
}
