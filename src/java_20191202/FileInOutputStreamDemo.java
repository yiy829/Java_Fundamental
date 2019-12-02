package java_20191202;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try { //source = inputstream // destination = outputstream
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\jdk.exe");
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\jdk-2.exe");
			//int readByte = 0;
			// fis.read() : 한 바이트 읽어서 반환한다. 더 이상 읽을 바이트가 없으면 -1 반환
			//while ((readByte = fis.read()) != -1) {
				// fos.write() : 한 바이트 쓰기
				//fos.write(readByte); 
				//여기까지 코드는 외워야함.
				//용량이 15억 바이트기 때문에 엄청많이 돌아간다.
				//}
			
			byte[] readBytes = new byte[1024*10]; // 8-10kb가 가장 나음
			int readByteCount = 0;
			//fis.read(readBytes) : 1024바이트 읽어서 readBytes에 저장
			//읽은 바이트수를 반환한다.
			while((readByteCount = fis.read(readBytes)) != -1){ //-1 = null 값과 같은 의미
				//fos.write(readBytes, 0, readByteCount) : readBytes 바이트
				//배열에 있는 데이터를 출력하되, 처음(0)부터, readByteCount만큼 출력
				fos.write(readBytes,0,readByteCount);
				//readBytes의 데이터를 출력해달라 (0부털 readByteCount까지)
			}
			/*
			 * } catch (FileNotFoundException e) { // TODO Auto-generated catch
			 * block e.printStackTrace();
			 */ // IOException이 부모
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close(); //객체가 생성됬으면 close
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 객체생성 -> 읽고, 쓰고, -> 닫기  (순서)
		}
	}
}
