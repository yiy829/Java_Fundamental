package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		System.out.print("입력하세요>");
		InputStream in = System.in; //소스(Source)가 키보드인 경우
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter	pw = null;
		
		try {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			fw = new FileWriter("C:\\Users\\yiy82\\git\\io\\isrdemo.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			
			String readLine = null;
			while((readLine = br.readLine()) != null ){
				if(readLine.equals("exit")) break;
				pw.println(readLine);
				System.out.println(readLine); //출력할수도, 파일로 저장할 수도 있다.
				System.out.println("입력하세요>"); 
			}
			//String readLine = br.readLine(); //키보드 입력을 기다리다 엔터를 치면 읽는다.
			// 여기서 입력된 문자들을 파일로 저장시키면 됌
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(in != null) in.close();
					if(br != null) br.close();
					if(fw != null) fw.close();
					if(bw != null) bw.close();
					if(pw != null) pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
	}
}
