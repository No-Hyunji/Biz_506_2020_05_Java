package com.biz.score.service;

import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 * ScoreService*** 클래스를 정의할 때
 * 반드시 ScoreService interface를 참조(implements)하도록 규칙을 정해 놓는다
 * ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인 된
 * method를 모두 implement 해서 작성되어야 하는 규칙이 작동하게 된다.
 * 따라서 모든 method의 이름이 통일되는 효과를 얻게 된다.
 * 
 * 	interface(ScoreService)를 implements하여 작성된 클래스는
 *  interface에 정의된 메서드의 규칙을 그대로 준수하여 작서해야 할 의무가 있는 클래스다.
 *  모양은 interface의 모양을 그대로 가지고 있으며
 *  하는 일은 실제 클래스의 메서드에 구현되어 있다.
 */

public class ScoreServiceImplV1 implements ScoreService {
	// private를 protected로 바꾸었다.
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public boolean inputScore() {
		// TODO Auto-generated method stub
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.println("학번(END:입력종료)>>");
		String strNum = scan.nextLine();
		if(strNum.equals(strNum)) {
			scoreVO.setNum(strNum);
			
		}
		
		System.out.println("국어>>");
		String strKor = scan.nextLine();
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("나이 숫자만, 0으로 임시저장함");
		}
		
		System.out.println("영어>>");
		String strEng = scan.nextLine();
		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("나이 숫자만, 0으로 임시저장함");
		}
		
		System.out.println("수학>>");
		String strMath = scan.nextLine();
		int intMath = 0;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("나이 숫자만, 0으로 임시저장함");
		}  
		
		
		int intSum = scoreVO.getKor();
		intSum += scoreVO.getEng();
		intMath += scoreVO.getMath();
		
		scoreVO.setSum(intSum);
		
		float avg = (float)intSum / 3;
		scoreVO.setAvg(avg);
		scoreList.add(scoreVO);
		return false;
	}
	public void calcSum() {
		
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i ++) {
			ScoreVO sVO = scoreList.get(i);
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			/*
			 * sVO.setSum() method에 총점을 전달하므로써
			 * scoreList에 저장된 요소의 총점 변수에 값을 저장하는 효과를 낸다
			 * 별도로 저장을 해주거나 하는 절차가 필요없다.
			 */
			sVO.setSum(sum);
		}
		
	}
	public void calcAvg() {
		int size = scoreList.size();
		for(int i = 0 ; i < size ; i ++) {
			ScoreVO sVO = scoreList.get(i);
			int sum = sVO.getKor();
			sum +=sVO.getEng();
			sum += sVO.getMath();
			float avg = (float)sum / 3;
			
		}
	}
	public void scoreList() {
		System.out.println("===========================================");
		System.out.println("성적");
		System.out.println("-------------------------------------------");
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균");
		
		//scoreList개수가 몇개인지 파악하여 변수에 저장
		
		
		
	}

}
