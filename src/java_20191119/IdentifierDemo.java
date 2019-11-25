package java_20191119; // 패키지명은 첫글자는 소문자로 시작
//클래스명의 첫글자는 대문자
// 두단어가 합친경우에는 두번째단어의 첫글자는 대문자로 사용 = camel case
public class IdentifierDemo {
	public static void main(String[] args){
		int age= 10;
		String name = "hello";
	
		//1. 첫글자는 숫자를 사용할 수 없음.
		//String 1fater = "John";
	
		//2. 공백을 사용할 수 없음.
		//String mother Name = "Michell";
	
		//3. 예약어는 사용할 수 없음.
		//String void = "empty";
	
		//4. 자바에서 문자는 유니코드를 의미하기 때문에 세계 모든 문자를 사용할 수 있음.
		String 이름  = "성영한";
	
		System.out.println(name); 
		System.out.println(이름);
		// 해당 행의 줄을 바꾸고 싶을때는 Alt+위,아래키로 조절 가능

	}
	
}

