package com.callor.hello;

import java.util.Random;

public class Var_06 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100)+1;
		
		int intSum = 0;
		for(int i = 1 ; i < 100 ; i ++ ) {
			if(num % 3 == 0) {
				intSum += num;
			}
			System.out.println("3의 배수의 합" + intSum);
		}
	}

}
