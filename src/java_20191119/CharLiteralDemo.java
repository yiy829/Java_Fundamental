package java_20191119;

public class CharLiteralDemo {
	public static void main(String[] args){
		//1. 유니코드 표현 => '\u0000'
		char c1 = '\uC5EC';	
		char c2 = '\uC778';
		char c3 = '\uC601';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//2. 아스키코드 표현 
		// 48 - 37 -> 0-9
		// 65 - 90 -> A-Z
		// 97 - 122 -> a-z
		
		char c4 = 97;
		System.out.println(c4);
		
		
		//3 문자 표현 => ''
		char c5 = 'a';
		char c6 = '성'; // 특수기호도 가능
		System.out.println(c5);
		System.out.println(c6);
		
		//escape char
		// \n => line feed
		// \t => tab
		// \\ => \ (문자로 표현이 안되므로)
		// \" => "
		// \' => '
		
		System.out.println("hello\n" + "world");
		System.out.println("hello\t" + "world");
		
		String path = "C:\\dev\\\"eclipse\""; // Reference 타입
		System.out.println(path);
				
	}
}
