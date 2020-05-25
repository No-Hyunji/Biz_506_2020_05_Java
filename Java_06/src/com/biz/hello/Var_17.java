package com.biz.hello;

import java.util.Random;

public class Var_17 {

	public static void main(String[] args) {
		
		/*
		 * 변수 이름 짓기
		 * 변수 이름 첫글자 영문소문자
		 * 변수 이름은 이름만으로 하는 일을 유추 할 수 있게 짓는 것이 좋다
		 * 변수 접두사 변수의 Type 명칭을 추가하여 작성
		 */
		int intKorScore;
		int intEngScore;
		int intMathScore;
		
		
		Random rnd = new Random();
		
		intKorScore= rnd.nextInt(50)+51;
		intEngScore=rnd.nextInt(50)+51;
		intMathScore=rnd.nextInt(50)+51;
		
		int intSum;
		int intAvg;
		
		intSum= intKorScore;
		intSum += intEngScore;
		intSum += intMathScore;
		
		intAvg = intSum / 3;
		
		System.out.println("총점:"+intSum);
		System.out.println("평균:"+intAvg);
	}
}
