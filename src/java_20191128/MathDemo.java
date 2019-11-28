package java_20191128;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.1);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		d1 = Math.round(42.789*100);
		System.out.println(d1/100); //42.79
		
		d1 = Math.abs(-4.3);
		System.out.println(d1);
		
		d1 = Math.sqrt(4);
		System.out.println(d1);
		
		d1 = Math.pow(2, 3); // 2^3
		System.out.println(d1);
		
		d1 = Math.random();
		System.out.println(d1);
		
	}
}
