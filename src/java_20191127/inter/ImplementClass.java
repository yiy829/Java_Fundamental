package java_20191127.inter;

public class ImplementClass implements InterA{//부모로부터 자식객체를 생성할 수 있다. 
	//오류뜨면 왼쪽 x클릭해서 add... 클릭, 인터페이스를 구현한다는 의미 

	@Override
	public void mB() {
		System.out.println("mB");
	}

	@Override
	public void mC() {
	// 여기선 void mC()로 하면 안됌 
		System.out.println("mC");
		
	}

	@Override
	public void mA() {
		System.out.println("mA");
	}
	

}
