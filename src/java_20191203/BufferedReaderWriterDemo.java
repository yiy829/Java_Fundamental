package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("C:\\dev\\io\\2019\\12\\text.txt");
			br = new BufferedReader(fr); // Stream Chainning

			fw = new FileWriter("C:\\dev\\io\\2019\\12\\text-copy2.txt");
			bw = new BufferedWriter(fw);
			
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				bw.write(readLine); // 읽었을 때 개행이 포함되지 않는다.
				bw.newLine(); // 개행 추가해야됌
			}
			
			bw.flush(); // 잘 될수도 있으나 Buffer는 flush를 넣어줘야한다.

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
				//if (fw != null)	fw.close();
				if (bw != null)	bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
