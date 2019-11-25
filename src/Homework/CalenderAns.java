package Homework;

public class CalenderAns {
	public static void main(String[] args) {
		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;

		// 2018년도까지 총일 수 구하기
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		if (isLeafYear) {
			monthArray[1] = 29;
			}

			for (int i = 0; i < preMonth; i++) {
				totalCount += monthArray[i];

			}

			totalCount += day;

			int dayOfWeek = totalCount % 7;
			if (dayOfWeek == 1) {
				message = "월요일";
			} else if (dayOfWeek == 2) {
				message = "화요일";
			} else if (dayOfWeek == 3) {
				message = "수요일";
			} else if (dayOfWeek == 4) {
				message = "목요일";
			} else if (dayOfWeek == 5) {
				message = "금요일";
			} else if (dayOfWeek == 6) {
				message = "토요일";
			} else if (dayOfWeek == 0) {
				message = "일요일";
			}
			System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message	);
	
	}
}
