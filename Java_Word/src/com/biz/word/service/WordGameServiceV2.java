package com.biz.word.service;
/*
 * 선생님
 */
import java.util.ArrayList;
import java.util.List;

import com.biz.word.domain.WordVO;

public class WordGameServiceV2 implements WordGameService {
	
	protected List<WordVO> wordList;
	protected int game;
	protected int count;
	
	public WordGameServiceV2() {
		wordList = new ArrayList<WordVO>();
		game = 0;
		count = 0;
		
	}

	@Override
	public void loadWord() {
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub

	}

}
