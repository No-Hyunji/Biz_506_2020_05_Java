package com.biz.grade;

import java.util.Random;

public class Grade_05 {

	public static void main(String[] args) {
		
		
		   Random random = new Random();
		   
		   int intA = 0;
		   int intB = 0;
		   int intC = 0;
		   int intD = 0;
		   int intE = 0;
		   int intF = 0;
		   int intG = 0;
		   int intH = 0;
		   int intI = 0;
		   int intJ = 0;
		   int intK = 0;		   
		   
		   intA=random.nextInt(50)+51;
		   intB=random.nextInt(50)+51;
		   intC=random.nextInt(50)+51;
		   intE=random.nextInt(50)+51; 
		   intF=random.nextInt(50)+51;
		   intG=random.nextInt(50)+51;
		   intH=random.nextInt(50)+51;
		   intI=random.nextInt(50)+51;
		   intJ=random.nextInt(50)+51;
		   intK=random.nextInt(50)+51;
		   
		   System.out.println(intA);
		   System.out.println(intB);
		   System.out.println(intC);
		   System.out.println(intD);
		   System.out.println(intE);
		   System.out.println(intF);
		   System.out.println(intG);
		   System.out.println(intH);
		   System.out.println(intI);
		   System.out.println(intK);
		   
		   int intSum=intA;
		   intSum+=intB;
		   intSum+=intC;
		   intSum+=intD;
		   intSum+=intE;
		   intSum+=intF;
		   intSum+=intG;
		   intSum+=intH;
		   intSum+=intI;
		   intSum+=intK;
		   
		   int intAvg=intSum/10;
		   
		   System.out.println("총점:"+intSum);
		   System.out.println("평균:"+intAvg);
		   
		   
		   
		   
		  
		   
		 
		   
	}
}
