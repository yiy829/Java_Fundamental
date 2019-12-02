package java_20191202;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\io\\2019\\12");
		boolean isSuccess = f1.mkdirs(); //make directories : 여러개 만들때
		//f1.mkdir : 1개만 만들때
		//디렉토리를 만들어줌. 새로 생성되면 true, 이미 있어서 안만들면 false
		System.out.println(isSuccess);
		
		//File f2 = new File("c:\\dev\\io\\2019\\12\\jdk-11.0.3_windows-x64_bin.exe");
		//File f2 = new File("c:\\dev\\io\\2019\\12,jdk-11.0.3_windows-x64_bin.exe");
		File f2 = new File(f1,"jdk-11.0.3_windows-x64_bin.exe");
		long fileSize = f2.length()/1024; //크기 만들때
		System.out.println(fileSize);
		f2.lastModified(); //1970년 1월 1일부터 마지막 수정날짜까지의 차이를 ms로 표현
		long lastModified = f2.lastModified();
		
		Calendar c = Calendar.getInstance(); //캘린더 클래스 객체 생성
		/*public static Calendar getInstance(){
		return new GregorianCalendar();	}*/ // 위와 같은 함수
		c.setTimeInMillis(lastModified);
		//c.setTimeInMillis(System.currentTimeMillis());
		//현재시간을 calendar에 대입하겠다.
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1; //month만 0123순으로 나옴
		int day = c.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 %n", year, month, day);
		
		//메소드화 시키기 좋은 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		//list(); : c 드라이브에 있는 모든 파일과 디렉토리를 String[] 배열로 반환
		File f3 = new File("c:\\");
		String[] list = f3.list();
		
		for(String temp : list){
			File f4 = new File(f3, temp);
			if(f4.isDirectory()){
				System.out.println("디렉토리 : " + temp);
			}else if(f4.isFile()){
				System.out.println("파일 : " + temp);
			}else {
				System.out.println("? : " + temp);
			}
		}
		//이름 변경(매우 중요!!)
		File f5 = new File(f1, "jdk.exe");
		f2.renameTo(f5);
		
		File f6 = new File(f1, "A.txt");
		try {
			f6.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f6.getName());//해당파일 이름
		System.out.println(f6.getPath());//해당파일 전체경로
		System.out.println(f6.getParent());//해당파일 직전경로
		
		// A.txt => 12312312312424.txt
		String extension = //확장자명 가져오기
				f6.getName().substring(f6.getName().lastIndexOf("."));
		File f7 = new File(f1, System.currentTimeMillis() + extension);
		f6.renameTo(f7);
		f7.delete(); //파일 삭제
		
	}
}
