package com.callor.hello;

import java.util.Random;

public class Var_04 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100)+1;
		if(num %3 == 0) {
			System.out.println(num + ": 3의 배수 입니다");
		}
		else if(num %5 == 0){
			System.out.println(num + ": 5의 배수입니다"); 
		}
	}

}
