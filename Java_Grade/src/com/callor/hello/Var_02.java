package com.callor.hello;

import java.util.Random;

public class Var_02 {
	
	public static void main(String[] args) {
		int num = 0;
		Random rnd = new Random();
		num = rnd.nextInt();
		int result = num * 55;
		System.out.println(result);
	}

}
