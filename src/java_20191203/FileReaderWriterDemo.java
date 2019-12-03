package java_20191203;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\dev\\io\\2019\\12\\text.txt");
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\text-copy.txt");
			/*			
			int readChar = 0;
			while ((readChar = fr.read()) != -1) {
				System.out.print((char) readChar); // 모니터에 출력
				fw.write(readChar); // 파일 시스템에 출력
				//캐릭터를 write (1byte씩)0
			}*/
			
			char[] readChars = new char[10];
			// new char[1024] 같이 많이 하면 남은 만큼 맨아랫줄에 빈칸으로 출력된다.
			// 칸수 맞춰서 하는게 좋을듯
			int readCharCount = 0;
			
			while ((readCharCount = fr.read(readChars)) != -1){
				System.out.print(new String(readChars,0,readCharCount));
				//System.out.print(new String(readChars)); 
				// => 마지막에 지우다 만 게 남아서 나온다
				fw.write(readChars,0,readCharCount);
				//캐릭터 배열을 write
				//fw.write(new String(readChars,0,readCharCount));
				//문자열을 write
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)	fr.close();
				if (fw != null)	fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
