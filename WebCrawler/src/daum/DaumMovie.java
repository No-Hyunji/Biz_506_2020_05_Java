package daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie {
	public static void main(String[] args) throws IOException{
	
		String content = "";
		int score = 0;
		String writer = "";
		String regDt = "";
		int cnt = 0;
		int page = 1;
		
		while(true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page="+page;
			Document doc = Jsoup.connect(url).get();
			Elements replyList = doc.select("div.review_info");
			
			if(replyList.size() == 0) {
				break;
			}
			
			for(Element one : replyList) {
				content = one.select("p.desc_review").text();
				
				score = Integer.parseInt(one.select("em.emph_grade").text());
				writer = one.select("em.link_profile").text();
				regDt = one.select("span.info_append").text().substring(0, 10);
				
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("내용 : "+content);
				System.out.println("평점 : "+score);
				System.out.println("작성자 : "+writer);
				System.out.println("작성일자 : "+regDt);
				
				cnt += 1;
			}
			page += 1;
		}
		
		System.out.println("총"+cnt+"개의 댓글을 수집했습니다.");
			
		
		
	}

}
