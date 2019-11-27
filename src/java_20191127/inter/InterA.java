package java_20191127.inter;
// 인터페이스간 상속은 다중 상속 가능
public interface InterA extends InterB, InterC{
	//인터페이스 변수는 public static final 생략 가능
	/*public static final*/ double PI = 3.14;
	//인터페이스 메서드의 접근 한정자를 붙이지 않으면 public
	//abstract 생략 가능
	/*public abstract*/void mA();
}
