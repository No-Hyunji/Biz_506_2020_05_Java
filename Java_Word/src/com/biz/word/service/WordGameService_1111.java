package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordGameService_1111 implements WordGameService {
	
	

	
	List<WordVO> wordList = new ArrayList<WordVO>();
	int count = 0;
	int game = 0;

	public void loadWord() {
		String wordFile = "src/com/biz/word/exec/word.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(wordFile);

			// buffer는 파일을 읽어서 임시 버퍼 영역에 보관한다.
			buffer = new BufferedReader(fileReader);

			// buffer.readLine() method를 호출하여
			// buffer로부터 한 줄씩 데이터를 읽어온다,
			// 이 때 데이터의 라인 수가 몇 개 인지 알 수 없으므로
			// while반복문으로 무한반복 실행하여
			// 계속 한 줄 씩 읽도록 수행한다.

			String reader = "";
			while (true) {
				// 반드시 try-catch를 수행 해 주어야 한다.
				// 이미 try로 묶인 코드 내부이므로
				// 별도로 try를 설정 하지 않고 catch 추가하여 처리한다.
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// 읽어들인 데이터를 콜론 기준으로
				// 문자열 분해를 하여 words배열에 담아달라.
				String[] words = reader.split(":");

				WordVO wVO = new WordVO();
				wVO.setEng(words[SplitPosition.WORD_ENG]); // words[0]
				wVO.setKor(words[SplitPosition.WORD_KOR]); // words[1]
				wordList.add(wVO);
			}
			buffer.close(); // while문에서 빠져나오는 코드 없으면 remove하라는 빨간줄이 뜸
			fileReader.close();

		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("단어장 파일 열기 오류");
			return;
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("단어장 읽기 오류");
			return;
		}

	}

	@Override
	public void playGame() {
		Random rnd = new Random();
		int size = wordList.size();
		Scanner scan = new Scanner(System.in);
		
		//게임을 새로 시작 할 때마다 초기화 하자
		count = 0;
		game = 0;
	
		while (true) {

			int index = rnd.nextInt(size); // index는 얼마가 만들어 질까요???? (0부터 ~ wordList의 -1 가지) 중의 한 수
			System.out.println("다음에 해당하는 영어단어는?(END:종료)");
			System.out.println(wordList.get(index).getKor() + " >> ");
			String strEng = scan.nextLine();

			if (strEng.equals("END")) {
				break;
			}
			game++;
			if (strEng.equalsIgnoreCase(wordList.get(index).getEng())) { // ingorecase는 대소문자 구분없이 검사하기위해서
				System.out.println("맞았습니다 축하합니다!!");
				count++; // 맞은개수 카운트하기
			} else {
				System.out.println("아쉽네요!!!");
				System.out.println(wordList.get(index).getEng());
			}
		}

	}

	@Override
	public void gameOver() {
		System.out.println("GAME OVER!!");
		System.out.printf("%d 게임중 %d 번 정답 맞춤!!", game, count);

	}

}
