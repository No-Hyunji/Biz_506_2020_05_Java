package com.biz.grade;

import java.util.Random;

public class Grade_04 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		float floatKor=0;
		float floatEng=0;
		float floatMath=0;
		
		floatKor=random.nextInt(50)+51;
		floatEng=random.nextInt(50)+51;
		floatMath=random.nextInt(50)+51;
		
		float floatSum=floatKor;
		floatSum+=floatEng;
		floatSum+=floatMath;
		
		float floatAvg=floatSum/3;
		
		System.out.println("총점:"+floatSum);
		System.out.println("평균:"+floatAvg);
		
		
	}

}
