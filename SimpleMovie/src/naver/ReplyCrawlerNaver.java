package naver;

import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import domain.ReplyDTO;
import persistence.ReplyDAO;

public class ReplyCrawlerNaver {
	int page = 1;
	int cnt = 0;
	int total = 0;
	String prePage = "";
	
	ReplyDAO rDao = new ReplyDAO();
	
	public HashMap<String, Integer> naverCrawler(String movieNm, String naverCode) throws IOException{
		while(true) {
			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code="+naverCode+"&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page=" + page;
			
			Document doc = Jsoup.connect(url).get();
			Elements replyList = doc.select("div.score_result li");
			String nowPage = doc.select("input#page").attr("value");
			// System.out.println(">>>>>>>>>>"+ prePage + ", " + nowPage);
			
			if(nowPage.equals(prePage)) {
				break;
			} else {
				prePage = nowPage;
			}
			
			String content = "";
			String writer = "";
			int score = 0;
			String regdate = "";
			
			for (Element one : replyList) {
				content = one.select("div.score_reple > p > span").get(0).text();
				writer = one.select("div.score_reple a > span").get(0).text();
				score = Integer.parseInt(one.select("div.star_score > em").get(0).text());
				regdate = one.select("div.score_reple em").get(1).text().substring(0, 10);
				System.out.println("▒▒ [NAVER] ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println("▒▒ 내용: " + content);
				System.out.println("▒▒ 평점: " + score);
				System.out.println("▒▒ 작성자: " + writer);
				System.out.println("▒▒ 작성일자: " + regdate);
				
				// MongoDB에 저장(댓글 1건)
				ReplyDTO rDto = new ReplyDTO(movieNm, content, writer, score, regdate);
				// System.out.println(rDto.toString());
				rDao.addReply(rDto);
				total += score;
				cnt += 1;
			}
			page += 1;
		}
		System.out.println("▒▒ =======================================================================================================================");
		System.out.println("▒▒ NAVER [" + cnt + "]건 댓글 수집 완료");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("cnt", cnt);
		map.put("total", total);
		
		return map;
	}
}