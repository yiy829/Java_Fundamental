package java_20191128;

public class StringDemo {
	public static void main(String[] args) {
		String str = "111111-1111118";
		for (int i = 0; i < str.length(); i++) {
			// 문자열을 하나씩 끄집어냄
			System.out.println(str.charAt(i));		
		}
		str = str.concat("abcd"); // str += "abcd"랑 같음
		System.out.println(str);
		
		//확장자 확인할때 편리
		String fileName = "abc.zip";
		if(fileName.endsWith("zip")){
			System.out.println("zip 파일입니다");
		}else if(fileName.endsWith("ppt")){
			System.out.println("ppt 파일입니다");
		}
		
		String uri = "artist/index.jsp";
		if(uri.startsWith("artist")){
			System.out.println("작가 페이지 입니다.");
		}else if(uri.startsWith("exhibition")){
			System.out.println("전시 페이지 입니다.");
		}
		
		//대소문자를 비교하지 않고 문자를 비교한다.
		System.out.println("abc".equalsIgnoreCase("aBC"));
		
		//문자를 바이트로 바꾸는 경우
		String s1 = "a";
		String s2 = "김";
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);
		
		//매개변수 문자열의 위치값을 확인
		//str = "111111-1111118"
		System.out.println(str.indexOf("-"));
		fileName = "abc.bde.fafb.asdf.ppt";
		System.out.println(fileName.lastIndexOf("."));
		System.out.println(fileName.indexOf(".ppt")); // 똑같다
		
		//인자가 1개 들어오면 해당자리부터 끝까지
		//인자가 2개 들어오면 ..부터 ...전까지 추출하는데 사용
		String first = str.substring(0,str.indexOf("-"));
		String second = str.substring(str.indexOf("-")+1);
		System.out.println(first);
		System.out.println(second);
		//메소드로 만들어놓으면 좋다. 배열로 처리해서..
		
		//숫자나 날짜, 빈공백의 순서나 추출 및 변경을 위해 사용
		//regex : regular expression : 정규표현식
		//aa1bb, aa123bb, aa1234bb 에서 aabb만 추출하고 싶을때 사용
		String content = "abc\nabc\nabc\nabc";
		System.out.println(content);
		content = content.replaceAll("\n", "<br>");
		System.out.println(content);
		
		//toLowerCase, toUpperCase -> 소문자 대문자 전환
		
		//trim => 앞뒤 공백제거. 중간공백은 제거 못함
		s1 = "abc";
		s2 = "abc ";
		System.out.println(s1.trim().equals(s2.trim()));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //때려죽어도 왜 false인지 안나옴
		System.out.println(s1.length());
		System.out.println(s2.length()); //여기서 알아냄
		
		// String.ValueOF() => primitive data type => String
		//(xxx) value를 String 으로 바꿔줌
		s1 = String.valueOf(100); //100 + "";
		System.out.println(s1);
		
		//split : 문자열을 구분자로 쪼개서 token배열로 재구성
		// 위 번호에서 "-" : 구분자 // 나눠진 번호들 : 토큰(token)
		String phone = "010-3024-1703";
		String[] temp = phone.split("-");
		for (String string : temp) {
			System.out.println(string);
		}
		
		//format => system.out.printf와 같은 기능이지만 출력이 아닌 return을 해줌.
		String str1 = String.format("%3$d %2$d %1$d", 10000,20000,30000);
		String str2 = String.format("%3$,d %2$,d %1$,d", 10000,20000,30000);
		String str3 = String.format("%3$,10d %2$,10d %1$,10d", 10000,20000,30000);
		String str4 = String.format("%3$,10.2f %2$,10.2f %1$,10.2f", 10000.234,20000.123,30000.456);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.printf("%d%n", 100);
		System.out.format("%d%n", 100);
		
		
	}
}
