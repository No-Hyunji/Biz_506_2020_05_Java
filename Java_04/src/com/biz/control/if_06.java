package com.biz.control;

import java.util.Random;

public class if_06 {

	public static void main(String[] args) {
		
		Random rnd=new Random();
		int inkor=rnd.nextInt(100);
		int intEng=rnd.nextInt(100);
		int intMath=rnd.nextInt(100);
		
		int sum= inkor+intEng+intMath;
		int avg=sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("총점 : " + avg);
		//평균이 60점 이상이면 합격 아니면 불합격
		
		if(avg >= 60) {
			System.out.println("합격");
		} else {System.out.println("불합격");
		}
	
		
		}
	}
	

