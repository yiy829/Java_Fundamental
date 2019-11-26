package java_20191126;

public class CallByRefDemo {
	public static void change(int i, int[]	j) {
		i = 20;
		j[3] = 400;
	} //연습
	public static void main(String[] args) {
		int a = 10;
		int b[]	= {1,2,3,4};
		
		System.out.println(a);
		System.out.println(b[3]);
		
		// int i = a, int[] j = b와 같음 
		CallByRefDemo.change(a,b); //a => call by value, b => call by reference
		
		System.out.println(a); // call by value 메서드 호출후 변화 없음
		System.out.println(b[3]); // call by reference 메서드 호출후 변화 있음
		
		// 차이점
		int[] c; // 메모리 할당이 안됌
		//System.out.println(c); // 할당이 안되어 에러남
		c = new int [4]; // 메모리 할당 + 객체 생성
		
		int[] d = null; // 선언(메모리 할당O). null 이니 참조를 못함
		System.out.println(d);
		d = new int [4]; // 객체만 생성
		
		int age; // 메모리 할당이 안됌 int age = 0; 로 선언해야 함
		//int t = age + 20; // 메모리에 올라와있지 않기 때문에 연산 불가능
		//System.out.println(age);
		age = 10;
		// 단 멤버변수는 초기화가 안되면 default값 가짐
		// 위는 로컬변수라 초기화를 하지 않으면 불가능
		// 지역변수에 접근한정자 붙이지 마라. default만 가능
		
		/* 초기값 
		boolean =>false
		char =>\u0000
		byte =>0
		short =>0
		int =>0
		long =>0
		float =>0.0f
		double =>0.0
		클래스 =>null
		*/
	}
}
