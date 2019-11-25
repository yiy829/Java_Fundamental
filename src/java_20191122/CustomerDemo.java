package java_20191122;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.email = "syh2hbilab.org";
				
		System.out.println(c1.name + " , " + c1.email);
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.email = "masayosi@yahoo.co.jp";
		
		System.out.println(c2.name + " , " + c2.email);
		
		Customer c3 = new Customer();
		c3.name = "배조스";
		c3.email = "ceo@amazon.com";
		
		System.out.println(c3.name + " , " + c3.email);
		
		// c3의 정보를 공유하기 때문에 같은 Object를 참조하므로 같은 객체
		Customer c4 = c3;
		c4.name = "잡스";
		
		System.out.println(c3.name + " , " + c3.email);
		System.out.println(c4.name + " , " + c4.email);
		System.out.println(c3==c4);
		
		// c5는 값만 가져오기 때문에 같은 Object를 참조하지 않으므로 다른 객체 
		Customer c5 = new Customer();
		c5.name = "손정의";
		c5.email = "masayosi@yahoo.co.jp";
		
		System.out.println(c2==c5);
		
		
		

		// c1..3 : Stack / name..email : Heep ...
		// BANKNAME, interestRate : Static 구간으로 나뉘어져 있음
		
		
		//static 변수는 reference variable 접근 가능하나 
		//일반적으로 class 이름을 접근한다.
		c1.interestRate = 10.2;  // 이런식으로 쓰지말고 class 이름으로 코딩
		System.out.println(c3.interestRate);  // 공유 객체라서 다같이 바뀜
		
		
		Customer.interestRate = 12.2; // Static 메서드는 따로 객체를 새로 생성하지 않아도 불러올 수 있다. 
		System.out.println(Customer.interestRate);
		
		// Customer.BANKNAME = "국민은행"; // final 변수는 수정 불가능
		
		
		
		
		
		
	}
}
