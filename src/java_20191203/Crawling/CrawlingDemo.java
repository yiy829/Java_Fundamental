package java_20191203.Crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		//HTML 문서 전체를 관리하기 위한 객체
		Document doc = null; //jsoup으로 import
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".con-wrap.notice-wrap"); //class="con-wrap..."로 되있다면 .으로 접근해서 가져오기 
		Elements titleElements = elements.select("h3");
		String noticeTitle = titleElements.text();
		System.out.println(noticeTitle);
		
		Elements liElements = elements.select(".notice-list ul li");
		
		for(int i = 0; i < liElements.size(); i++){
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}
	}
}
