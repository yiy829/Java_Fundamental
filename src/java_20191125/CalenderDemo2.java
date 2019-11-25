package java_20191125;

public class CalenderDemo2 {  //클래스화 시킴 + 공개할 필요가 없으므로 캡슐화
	private int year;
	private int month;
	private int day;
	private int totalCount;
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// 매개변수 3개짜리 생성자
	// 클래스 이름과 동일한 매개변수 생성자. void(반환값) 안들어감
	// 매개변수가 있어서 컴파일러 자동생성 불가. 오류
	
	//생성자의 오버로딩, 메서드의 오버로딩. 1~3개까지 제공
	// 매개변수 1개짜리 생성자
	public CalenderDemo2(int y){  
		//year = y;
		this(y,0,0);
		
	}
	
	// 매개변수 2개짜리 생성자
	public CalenderDemo2(int y, int m){  
		// year = y;
		// month = m;
		this(y,m,0);
	}
	
	// 매개변수 3개짜리 생성자
	public CalenderDemo2(int year, int month, int day){  
		// 이거는 지켜줬으면 좋겠다. this. => 생성자에서만 호출가능
		this.year = year;
		this.month = month;
		this.day = day;
		getTotalCount();
	}
	
	public void set(int y, int m, int d){
		year = y;
		month = m;
		day = d;
		getTotalCount();
	}
	
	public int getTotalCount(){
		int preYear = year - 1;
		int preMonth = month - 1;
		// int totalCount = 0;

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
			
			return totalCount; // public int와 같은 유형
	}
	
	public void print (){
		String message = null;
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
	/*public CalendarDemo2(){
		
	}*/ // 무조건 만들고 시작하라는 곳도 많음
	public static void main(String[] args){
		CalenderDemo2 c = new CalenderDemo2(2019,12,25);
		//c.set(2019,12,25);
		//c.getTotalCount();
		c.print();
	}
}
