package Homework.ConsCalendar;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import java_20191125.CalenderDemo;

public class CalendarDemo {

	public static void insertY() {
		String year = console("원하시는 년도를 입력해주세요.>");
		if (isNumber(year) == false) {
			System.out.println("연도는 숫자만 입력해 주세요.");
			System.exit(0);
		}
		int year2 = Integer.parseInt(year);
		if (year2 <= 0) {
			System.out.println("연도는 0보다 큰 숫자만 가능합니다.");
			System.exit(0);
		} else {
			String yesno = console("해당년도의 전체 달력을 출력하시겠습니까?(y/n)>");
			if (yesno.equals("y") | yesno.endsWith("yes")) {
				for (int i = 1; i <= 12; i++) {
					printCalender(year2, i);
					insert();
				}
			} else if (yesno.equals("n") | yesno.equals("no")) {
				String month = console("원하시는 달을 입력해주세요.>");
				if (isNumber(month) == false) {
					System.out.println("달은 숫자만 입력해 주세요.");
					System.exit(0);
				}
				int month2 = Integer.parseInt(month);
				insertM(year2, month2);
			}
		}
	}

	public static void insertM(int year, int month) {
		if (month <= 0 || month > 12) {
			console("입력은 숫자 1에서 12까지만 가능합니다.");
			System.exit(0);
		} else {
			String yesno = console("해당 월의 달력을 출력하시겠습니까?(y/n)>");
			if (yesno.equals("y") | yesno.equals("yes")){
					printCalender(year, month);	
					insert();
			} else if (yesno.equals("n") | yesno.equals("no")) {
				String day = console("원하시는  일을 입력해주세요.>");
				if (isNumber(day) == false) {
					System.out.println("일은 숫자만 입력해 주세요.");
					System.exit(0);
				}
				int day2 = Integer.parseInt(day);
				insertD(year, month, day2);
			}
		}
	}
	public static void insertD(int year, int month, int day) {
		if (day <= 0 || day > 31) {
			console("입력은 숫자 1에서 31까지만 가능합니다.");
			System.exit(0);
		} else {
			dayday(year, month, day);
			insert();
		}
	}

	public static int totalDay(int year, int month, int day) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int total_y = ((year - 1) * 365) + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400);
		int total_m = 0;
		if (isLeapYear(year) == true) {
			monthArray[1] = 29;
		} else {
			monthArray[1] = 28;
		}
		for (int i = 0; i <= month - 2; i++) {
			total_m += monthArray[i];
		}
		int total_d = day;
		int total = total_y + total_m + total_d;
		int result = total % 7;
		return result;
	}

	public static void dayday(int year, int month, int day) {
		String dayday = null;

		switch (totalDay(year, month, day)) {
		case 0:
			dayday = "일요일";
			break;

		case 1:
			dayday = "월요일";
			break;

		case 2:
			dayday = "화요일";
			break;

		case 3:
			dayday = "수요일";
			break;

		case 4:
			dayday = "목요일";
			break;

		case 5:
			dayday = "금요일";
			break;

		case 6:
			dayday = "토요일";
			break;

		default:
			dayday = "없는 요일";
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다. %n%n", year, month, day, dayday);
	}

	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	public static int lastDayMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 2 && (isLeapYear(year) == true)) {
			return 29;
		} else if (month == 2 && (isLeapYear(year) == false)) {
			return 28;
		} else {
			return 30;
		}
	}

	public static int firstDayMonth(int year, int month) {
		return totalDay(year, month, 1);
	}

	public static void printMonthBody(int year, int month) {
		int count = 0;
		for (int i = 1; i <= lastDayMonth(year, month); i++) {
			if (i < 2) {
				for (int j = 1; j <= firstDayMonth(year, month); j++) {
					System.out.print("\t ");
					count += 1;
				}
			}

			System.out.printf("\t %2d", i);
			count += 1;
			if (count == 7) {
				System.out.println();
				count = 0;
			}
		}
	}

	private static void printMonthTitle(int year, int month) {
		System.out.println();
		System.out.println("\t" + year + "년\t\t\t\t\t\t" + getMonthName(month));
		System.out.println("\t===================================================");
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");
		System.out.println("\t===================================================");
	}

	private static void printCalender(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
		System.out.println("");

	}

	private static String getMonthName(int month) {
		String monthName = null;
		switch (month) {
		case 1:
			monthName = "1월";
			break;
		case 2:
			monthName = "2월";
			break;
		case 3:
			monthName = "3월";
			break;
		case 4:
			monthName = "4월";
			break;
		case 5:
			monthName = "5월";
			break;
		case 6:
			monthName = "6월";
			break;
		case 7:
			monthName = "7월";
			break;
		case 8:
			monthName = "8월";
			break;
		case 9:
			monthName = "9월";
			break;
		case 10:
			monthName = "10월";
			break;
		case 11:
			monthName = "11월";
			break;
		case 12:
			monthName = "12월";
			break;
		}
		return monthName;
	}

	public static void insert() {
		print();
		String index = console("원하시는 메뉴 숫자를 입력해주세요.>");
		run(index);
	}

	public static void real() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("MM");
		String format_year = format.format(System.currentTimeMillis());
		String format_Month = format2.format(System.currentTimeMillis());
		int realY = Integer.parseInt(format_year);
		int realM = Integer.parseInt(format_Month);
		printCalender(realY, realM);
	}

	public static void print() {
		System.out.println("\t===================================================");
		System.out.println("\tMenu 1.Year       2.Day        3.Memo       4.Exit ");
		System.out.println("\t===================================================");
	}

	public static String console(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in); // 키보드값 입력받음
		return sc.next();
	}

	public static void run(String index1) {
		if (index1.equals("1")) {
			insertY();
		} else if (index1.equals("2")) {

		} else if (index1.equals("3")) {

		} else if (index1.equals("4")) {

		} else if (index1.equals("5")) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("잘못누르셨습니다.");
			print();
			String index = console("원하시는 메뉴 숫자를 입력해주세요.>");
			run(index);
		}
	}

	public static void main(String[] args) {
		CalenderDemo c1 = new CalenderDemo();
		real();
		insert();

	}

	// 숫자 여부 체크
	public static boolean isNumber(String str) {
		boolean result = false;
		try {
			Double.parseDouble(str);
			result = true;
		} catch (Exception e) {
		}

		return result;
	}

}
