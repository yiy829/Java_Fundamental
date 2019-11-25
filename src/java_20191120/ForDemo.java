package java_20191120;

public class ForDemo {
	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%10s , %10d , %d , %.2f%n", str, a1, a2, d1);
		// %10s : 해당값 포함 10자리를 맞춰서 결과로 나옴
		// %.2f : 소숫점 2째자리까지 반올림해서 결과로 나옴
		System.out.println(str + " , " + a1 + " , " + a2 + " , " + d1); // 같은
																		// 결과지만
																		// 번거롭다
		// println 문은 문자와 숫자를 혼용해서 넣기가 쉽지 않으므로 printf를 사용

		// For문 100까지의 합
		int sum = 0;
		// long start = System.currentTimeMillis(); // 경과시간 도출
		for (int i = 1; i <= 100; i++) { // i+=2 로도 가능
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		// long end = System.currentTimeMillis();
		// System.out.println("경과 시간 : " + (end - start));
		System.out.printf("1부터 100까지의 합은 %d 입니다.%n", sum);

		// 구구단(이중 for문)
		for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
		}

		// 거꾸로 구구단
		for (int first = 9; first >= 2; first--) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
		}

		// 별찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*"); // True일때, 찍어라
			}
			System.out.println(); // 줄넘기기

		}
		
		for (int i = 0; i < 6; i++){
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" "); // True일때, 찍어라
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println(); // 이중 for문으로 만들어보기

		}

	}
}
