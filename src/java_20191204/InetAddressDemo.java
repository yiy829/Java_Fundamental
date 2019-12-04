package java_20191204;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// 호스트 이름이나 IP주소를 문자열로 반환
		InetAddress i = InetAddress.getLocalHost(); 
		System.out.printf("호스트 이름 : %s%n", i.getHostName());
		System.out.printf("ip address : %s%n", i.getHostAddress());
		
		InetAddress i1 = InetAddress.getByName("naver.com");
		System.out.printf("호스트 이름 : %s%n", i1.getHostName());
		System.out.printf("ip address : %s%n", i1.getHostAddress());
		
		
		
	}
}
