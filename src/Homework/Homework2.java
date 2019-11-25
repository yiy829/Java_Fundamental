package Homework;

public class Homework2 {
	public static void main(String[] args) {
		
		// 1. 문자 reverse 하기 
		System.out.println("(1) 문자 reverse 하기"); 
		
		String input = "abcde"; 
		char[] ch = input.toCharArray();
		char[] ch2 = new char[ch.length];

		for (int i = ch.length - 1; i >= 0; i--) {
			ch2[ch.length - (i + 1)] = ch[i];
		}

		for (char ch3 : ch2) {
			System.out.println(ch3);
		}
		

		
		// 2. 1-100까지 소수구하기
		System.out.println("(2) 1-100까지 소수를 구하시오. "); 
		
		/*for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}*/

		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(i);
			}
		}
	}
}
