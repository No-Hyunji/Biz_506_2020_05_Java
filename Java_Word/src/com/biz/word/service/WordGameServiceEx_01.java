package com.biz.word.service;

public class WordGameServiceEx_01 {
	
	public static void main(String[] args) {
		
		WordGameService wGameService = new WordGameServiceV2();
		
		wGameService.loadWord();
		wGameService.playGame();
		wGameService.gameOver();
	}

}
