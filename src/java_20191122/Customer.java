package java_20191122;

public class Customer {

	public String name;
	// public final String name = ""; 
	// 초기화를 무조건 해야됌. 이론상으로 가능하나 객체들마다 가질 필요가 없다.
	public String email;
	public String phone;
	public int age;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	public static final String BANKNAME = "신한은행"; 
	//final 변수는 관례쌍 대문자가 원칙
	
}