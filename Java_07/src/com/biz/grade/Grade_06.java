package com.biz.grade;

import java.util.Random;

public class Grade_06 {

	public static void main(String[] args) {
		
		int intSum=0;
		Random random = new Random();
		
		for(int i = 0 ; i<10 ; i++) {
			
			int intKor=random.nextInt(50)+51;
			System.out.println((i+1)+"번학생 국어점수:"+intKor);
			intSum+=intKor;
		}
		
		System.out.println("총점:"+ intSum);
		System.out.println("평균:"+intSum/3);
	}
}
