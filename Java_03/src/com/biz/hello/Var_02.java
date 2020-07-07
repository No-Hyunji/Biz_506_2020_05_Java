package com.biz.hello;

import java.util.Random;

public class Var_02 {
	
	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100)+1;
		int num2 = rnd.nextInt(100)+1;
		
		
		if((num1+num2) %2 == 0) {
			System.out.println("덧셈 결과는 짝수");}
		if((num1-num2) %2 == 0) {
			System.out.println("뺄셈 결과는 짝수");}
		if((num1*num2) %2 == 0) {
			System.out.println("곱하기 결과는 짝수");}
		if((num2/num1) %2 == 0) {
			System.out.println("나누기 결과는 짝수");}

			
		
		
		
	
	}
	}
	


