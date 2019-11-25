package Homework;

public class CalendarDemo {
	public static void main(String[] args) {
		/* 단축키 Ctrl+Shift+/
		달력 만들기
		1. 1년 1월 1일은 월요일
		2. 1년 365일, 윤년은 366일 - 2월 29일
		3. 윤년은 4년마다 방생하고 그중에서 100배수는 제외하고 400의 배수는 제외하지 않는다.
		4. 2019년 12월 25일 무슨요일일까요? 
		*/
		
		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//coding
		int total_y = ((year-1)*365)+((year-1)/4)-((year-1)/100)+((year-1)/400);
		int total_m = 0;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ){
			monthArray[1] = 29;
		} else {
			monthArray[1] = 28;
		}
		for(int i = 0; i <= month-2; i++){
			total_m += monthArray[i];
		}
		int total_d = day; 
		int total = total_y + total_m + total_d;
		int result = total % 7 ;
		
		String dayday = null;
		
		switch(result){
		case 0 : dayday = "일요일"; break; 
		
		case 1 : dayday = "월요일"; break; 
			
		case 2 : dayday = "화요일"; break;
		
		case 3 : dayday = "수요일"; break;
			
		case 4 : dayday = "목요일"; break;
			
		case 5 : dayday = "금요일"; break;
		
		case 6 : dayday = "토요일"; break;
			
		default : dayday = "없는 요일";
		}
		
		System.out.printf("%d년 %d월 %d일은 %s 입니다.", year, month, day, dayday);
	}
}
