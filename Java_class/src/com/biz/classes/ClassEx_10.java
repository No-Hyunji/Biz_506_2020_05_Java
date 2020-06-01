package com.biz.classes;

import com.biz.classes.model.BookVO;
import com.biz.classes.service.BookService;

public class ClassEx_10 {

	public static void main(String[] args) {
		
		//BookVO클래스를 이용하여
		//bookList 인스턴스 배열을 3개 선언
		BookVO[] bookList = new BookVO[3];
		
		//인스턴스 배열은 사용전에 각각 요소들을
		//한번 더 생성해주는 코드가  필요하다.
		bookList[0] = new BookVO();
		bookList[1] = new BookVO();
		bookList[2] = new BookVO();
		
		bookList[0].isbn="001";
		bookList[1].isbn="002";
		bookList[2].isbn="003";
		
		bookList[0].title="자바입문";
		bookList[1].title="자바의 정석";
		bookList[2].title="오라클 입문";
		
		bookList[0].auth="박은종";
		bookList[1].auth="남궁성";
		bookList[2].auth="정재훈";
		
		bookList[0].comp = "이지스퍼블리싱";
		bookList[1].comp = "지스퍼블리싱";
		bookList[2].comp = "스퍼블리싱";
		
		bookList[0].price = 35000;
		bookList[1].price = 350000;
		bookList[2].price = 3500000;
		
		BookService bookService = new BookService();
		
		bookService.bookInfo(bookList[0]);
		bookService.bookInfo(bookList[1]);
		bookService.bookInfo(bookList[2]);
		
		bookService.bookList(bookList);
				
	}
}