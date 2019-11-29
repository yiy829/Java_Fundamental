package java_20191125;

public class StaticDemo {
	static String name;
	int age;
	
	public void m1(){
		name = "sung"; //인스턴스 메서드에서는 static 변수 사용 가능 
		age = 10; // 인스턴스 메서드에서는 인스턴스 변수 사용 가능 
		m2(); //인스턴스 메서드에서는 인스턴스 메서드 호출 가능 
		m4(); //인스턴스 메서드에서는 static 메서드 호출 가능 
		this.name = "sung";
		this.age = 10;
	}
	public void m2(){
		System.out.println("intance method m2()");
	}
	public static void m3(){
		//this.age = 10; //스태틱 변수 쓸수 없음
		name = "sung"; //static 메서드에서는 static 변수 사용 가능
		// age = 10; // static 메서드에서는 인스턴스 변수 사용 불가
		// m2(); //static 메서드에서는 인스턴스 메서드 호출 불가
		m4(); // static 메서드에서는 static 메서드 호출 가능
		StaticDemo sd = new StaticDemo();
		sd.age = 10;
		sd.m2(); //static메서드에서 인스턴스 변수 및 메서드를 호출하고 싶으면 객체를 새로 생성해야 한다.
	}
	public static void m4(){
		System.out.println("static method m4()");
	}
}
