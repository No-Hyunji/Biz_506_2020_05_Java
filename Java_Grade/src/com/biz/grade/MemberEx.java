package com.biz.grade;

import java.util.Random;

public class MemberEx {
	
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;
		int sum = num1+num2;
		System.out.println(sum);
		
		int num = 0;
		System.out.println(num);
		
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10; i++) {
			int num3 = rnd.nextInt(50)+51;
			if(num3 %2 == 0) {
				System.out.println(num3+"은 짝수");
			}else {
				System.out.println(num3+"은 짝수가 아니다");
				
			}
			
		}
	}
	
}
