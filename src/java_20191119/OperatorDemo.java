package java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a = 7, b = 20;
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		//핵심
		d = b / a;
		System.out.println(d);
		
		d =(double)b / (double)a; // 한쪽만 써도 자동캐스팅이 됨  d =(double)b / a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a += b; // a = a+b;(쓰지말자)
		
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum += i;
				}
		System.out.println(sum);
		
		
		a++;
		++a; // a = a+1; (쓰지말자)	
		
		a = 20;
		//증가후 대입
		c = ++a;
		System.out.println(a);
		System.out.println(c);

		a = 20;
		//대입후 증가
		c = a++;
		System.out.println(a);
		System.out.println(c);

		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = a <= b;
		System.out.println(isSuccess);
		
		isSuccess = a == b;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		// a && b -> a가 false 이면 b연산을 하지 않음 (short circuit)
		isSuccess = (a==b) && (++a == ++b);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		// a || b => a가 true 이면 b 연산을 하지 않음 (short circuit)
		isSuccess = (a!=b) || (++a == ++b);
		System.out.println(isSuccess);
		
		System.out.println(a);
		System.out.println(b);
	}
}
