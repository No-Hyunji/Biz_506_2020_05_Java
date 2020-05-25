package com.biz.hello;

import java.util.Random;

public class Var_04 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num = rnd.nextInt(100)+1;
		for(int i = 2 ; i < num ; i++) {
			if(num%i == 0) {
				System.out.printf("%d로 나눈 나머지가 0이므로 %d는 소수가 아님\n",
						i ,num);
				/*
				 * 2 ~ num - 1까지 범위의 값으로
				 * num 를 나누어 한 번 만이라도 나머지가 0이 아닌 경우가 나타나면
				 * num는 소수가 아니므로
				 * 나머지 범위의 값은 검사할 필요가 없다
				 * 그러므로 더이상 for반복문을 진행 할 필요가 없다.
				 * 그래서break문을 사용하여 for반복문을 중단한다.
				 */
				
				break;
			}
		}
	}

}
