package java_20191126.Shape;

public class ShapeDemo {
	public static void run(Shape s){
		s.draw(); //실제 자식개체를 넘겨준다.	
	}
	
	public static void main(String[] args) {
		//추상 클래스 객체를 생성할 수 없음
		//Shape s = new Shape();
		Shape s1 = new Rectangle();
		s1.draw();
		
		Shape s2 = new Triangle();
		s2.draw();
		
		//추상클래스의 다형성
		run(new Rectangle()); // shape s = new Rectangle(); 과 동일
		run(new Triangle()); // shape의 하위 클래스만 가능. overriding한 것만 가능.		
	
	}
}
