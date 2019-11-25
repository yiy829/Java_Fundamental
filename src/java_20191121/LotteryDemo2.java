package java_20191121;

public class LotteryDemo2 {
	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의의 double 값을 반환
		int[] lotto = new int[6]; // 값을 모르므로 new int 사용
		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random(); // 값을 정확히 알 수 없을 때, new int[]를 쓴다. 디폴트가 double이므로 double로 생성
			//1부터 45까지의 임의값을 temp에 저장한다.
			int temp = (int) (random * 45) + 1;
			// temp값을 현재위치 무조건 집어 넣는다. 만약 중복되는 경우는 i를 증가시키지 않고 새로운 temp값을 넣기 때문에 문제가 생기지 않음.
			lotto[i] = temp;
			// 13-21라인 까지는  i인데스 이전까지 배열의 값을 체크한다.
			for (int j = 0; j < i; j++) {
				//temp변수와 j인덱스에 있는 배열값이 같은 경우
				if (lotto[j] == temp) {
					//i를 증가시키지 않고 현재 위치에 있도록 설정하기 위해서 i--
					//break를 추가하여 더이상 연산을 안하도록 처리함
					i--;
					break;
				}
			}
		}
		
		
		//****** 중요!! 외우기!! bubble sort : 오름차순으로 정렬
		for (int i = 0; i < lotto.length; i++) {  
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
		for (int i : lotto) {
			System.out.print(i + "\t");
		}
	}
}	
