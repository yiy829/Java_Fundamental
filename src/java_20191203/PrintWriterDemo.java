package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter	pw = null;
		try {
			fr = new FileReader("C:\\dev\\io\\2019\\12\\text.txt");
			br = new BufferedReader(fr); // Stream Chainning
			// BufferedReader는 Path 생성이 없기때문에 FileReader를 사용해야 한다.
			// Buffered 는 readline을 하기위해.. 훨씬 편해짐
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\text-copy2.txt");
			bw = new BufferedWriter(fw);
			//개행이 안되니 newLine을 쓰던가 printwriter를 쓰던가
			pw = new PrintWriter(bw,true); //true = autoFlush
			
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				pw.println(readLine); // 한줄로 읽었을 때 개행이 포함되지 않는다.
				// bw.newLine(); // auto flush로 필요 없음
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
				if (br != null)	br.close();
				// if (fw != null) fw.close();
				if (bw != null) bw.close();
				if (pw != null) pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
