package com.biz.score.exec;

import java.util.Scanner;

import com.biz.score.config.DBContract;
import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ScoreService scService = new ScoreServiceImplV1();
		scService.loadScore();

		while (true) {
			System.out.println("3. 성적등록");
			System.out.println("2. 일람표");
			
			System.out.println("1. 업무종료");
			System.out.print("업무선택>> ");
			String stMenu = scan.nextLine();
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(stMenu);
			} catch (Exception e) {
				System.out.println("메뉴는 숫자로만 선택할수 있음!!");
				continue;
			}
			if(intMenu == DBContract.MENU.성적등록) {
				while(true) {
						break;
					};	
			} else if(intMenu == DBContract.MENU.성적일람표) {
				while( scService.inputScore() ) ;
				scService.calcSum();
				scService.calcAvg();
			
			} else if(intMenu == DBContract.MENU.성적표출력) {
				scService.calcSum();
				scService.calcAvg();
				scService.scoreList();
			}
		}
	}}


