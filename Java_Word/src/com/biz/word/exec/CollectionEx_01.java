package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {
	
	public static void main(String[] args) {
		
		String nation = "KOREA";
		String[] nations = nation.split(""); // 땡땡"" 해놓으면 알파벳 단위로 분해함
		
		// Arrays.asList(배열) : 배열을 List 형 데이터로 변환
		// Arrays라는 클래스에 애스리스트라고하는 스태틱메서드가 있나봄 
		// 리스트로        <<<<<<========   배열을
		List<String> words = Arrays.asList(nations);
		
		// Collections 클래스의 기능을 몇가지 사용하기 위해서 
		// 배열을 List형 데이터로 변환했다.
		
		// String, Integer, Long, Float, Charactor, Boolean과 같은
		// Wrapper class를 포함하는 리스트 데이터를
		// 오름차순 정렬하는 매우 간단한 메서드이다.
		// Collections의 sort() method는 내부 알고리즘이 Quick Sort이므로 , 
		// 사용하는 데 아무런 제약이 없이 사용 해도 된다.
		Collections.sort(words); // 소트중에 가장빠른 소트 
		System.out.println(words); // String nation = "Korea" =>[K, a, e, o, r]로 나타남/ words라는 배열에 들어있는 쪼갬/ 리스트 변환/ 콜렉션 솔트에 보냄/ 오름차순으로 정렬함 /알파벳은 대문자가 소문자보다 먼저이다.
		// 디버깅 이라고 한다, 내용을 확인 하고 싶을 때 함
		
		// List에 포함된 item들을 뒤죽박죽하게 섞는 기능을 수행한다./ return 필요없음./ 호출하면서 필요한 리스트만 주입해주면 됨. 
		Collections.shuffle(words);
		System.out.println(words);
	}

}
