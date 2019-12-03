package java_20191203.Crawling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverScanningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/"); //소스보기한 것을 들여온다.
		InputStream in = url.openStream(); // url을 inputstream으로 입력(1바이트 =>2바이트)
											

		// 1. InputStream을 InputStreamReader로 스트링체이닝한다.
		InputStreamReader ir = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		ir = new InputStreamReader(in);
		// 2. InputStreamReader를 BufferedReader로 스트림체이닝한다.
		br = new BufferedReader(ir);
		// 3. BufferedReader로 읽은 정보(HTML)를 C:\\dev\\io\\2019\\12\\naver.html 파일로 저장한다
		fw = new FileWriter("C:\\Users\\yiy82\\git\\io\\naver.html");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw, true);
		
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			pw.println(readLine);
		}
		
		if(ir != null) ir.close();
		if(br != null) br.close();
		if(fw != null) fw.close();
		if(bw != null) bw.close();
		if(pw != null) pw.close();
	}
}
