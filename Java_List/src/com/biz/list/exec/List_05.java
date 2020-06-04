package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}

		for (int i = 0; i < 100; i++) {

			int num = intList.get(i);

			if (num == 55) {
				
				System.out.printf("%d\t",i); //찾은 위치
				
				
				
			
			}
			
		}
	}

}