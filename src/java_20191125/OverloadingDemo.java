package java_20191125;

public class OverloadingDemo {
	//Overloading의 작성규칙
	//1. 같은 클래스 내
	//2. 메서드 이름은 같아야 한다.
	//3. 매개변수 갯수가 같으면 자료형이 달라야 한다.
	//4. 매개변수 갯수가 달라야 한다.
	//5. 반환형과 접근 한정자는 같아도되고 달라도 된다.
	
	public void print(String str){
		System.out.print(str);
	}
	
	public void print(int i){
		System.out.print(i);
	}
	
	public void print(double d){
		System.out.print(d);
	}
	
	public void print(boolean b){
		System.out.print(b);
	}
	
	public static void main(String[] args){
		OverloadingDemo o = new OverloadingDemo();
		o.print(true + "\n");
		o.print("test" + "\n");
		o.print(23+34 + "\n");
		o.print(43.456 + "\n");
	
	
	
	}
}



