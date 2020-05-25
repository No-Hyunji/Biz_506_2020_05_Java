package com.biz.hello;

import java.util.Random;

public class Var_01 {
	
	public static void main(String[] args) {
		
		Random rnd= new Random();
		int num1=rnd.nextInt(100)+1;
		
		if(num1%3==0) {
			System.out.printf("%d는 3의 배수\n",num1);
		}else {
			System.out.printf("%d는 3의 배수가 아니다\n",num1);
		}
		
		if(num1%5==0) {
			System.out.printf("%d는 5의 배수\n",num1);
		} else {
			System.out.printf("%d는 5의 배수가 아니다\n",num1);
		}
		
	}

}
