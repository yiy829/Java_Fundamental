package Homework;

public class Homework1 {
	public static void main(String[] args) {
		// 문자 reverse 하기
		// 1. input "abc" => "dcba"
		// 2. input "abcde" => "edcba" 같이 나와야 함
		// 전체길이 length/2 for문 두번해서 바꾸면 됌
		// abcde 뿐만 아니라 다른 경우도 될 수 있도록 해보기
		String input = "abcd"; // "abcde" 도 성공해야
		char[] ch = input.toCharArray(); // 문자열을 cha 배열로 변경됌
		char[] ch2 = new char[ch.length];

		for (int i = ch.length - 1; i >= 0; i--) {
			ch2[ch.length - (i + 1)] = ch[i];
		}

		for (char ch3 : ch2) {
			System.out.println(ch3);
		}

		// 1-100까지 소수를 구하시오 for(i=2; i<=100; i++){ 로 돌리기
		// ex) 4같은 경우 4보다 작은 2,3으로 나눠지는지 확인하고 나눠지면 안됌
		// 한번 자신보다 작은 수로 나뉘어 지면 바로 break 할 수 있도록 만들자
		// 로또 참조 확인. 확인


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
		
		/*for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					i++;
					break;
				}
			}
			System.out.println(i);
		}*/
		
		
	}
}
