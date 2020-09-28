package com.callor.hello;

import java.util.Random;

public class Var_03 {
	public static void main(String[] args) {
		int num1 = 0;
		Random rnd = new Random();
		num1 = rnd.nextInt();
		if(num1 %2 == 0) {
			System.out.println(num1 + "은 짝수");
		}else {
			System.out.println(num1 + "은 홀수 ");
		}
		
	}
}
