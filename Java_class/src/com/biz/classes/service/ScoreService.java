package com.biz.classes.service;

import com.biz.classes.model.Score;

/*
 * method의 중복정의
 * method overloading
 * method으 매개변수가 다르면 같은 이름의 method를 
 * 한 클래스 내에서 중복 정의하여 사용 할 수 있다.
 * 
 * java이전의 언어에서는 
 * 클래스를 모듈이라는 이름으로 불렀는데
 * 1개의 모듈, 1개의 파일 내에서는 
 * 같은 이름의 method(함수)를 정의할 수 없었다.
 * 
 * java에선느 method의 매개변수 개수가 다르면
 * 같은 이름의 method를 사용 할 수 있다.
 * 호출 하는 곳에서 매개변수 전달을 다르게 수행하면
 * 자동으로 method가 연결되어 코드가 수행된다. 
 * 
 * 또한, 
 * method의 매개변수 개수가 같은 경우라도
 * 매개변수의 type이 다르면 같은 이름이 같은 method를 정의 할 수 있다.
 */
public class ScoreService {

	public int sum() {
		return 0;
	}

	// Score 클래스를 매개변수로 받은 method
	public int sum(Score score) {

		int sum = score.getIntKor();
		sum += score.getIntEng();
		sum += score.getIntMath();
		sum += score.getIntMusic();
		sum += score.getIntArt();
		sum += score.getIntMusic();

		score.setIntSum(sum);
		score.setIntAvg(sum / 3);
		return sum;

	}

	public int sum (int kor, int eng, int math, int music, int art, int sci) {
		int sum 
		
	}

	public float sum(float kor, float eng, float math) {
		float sum = kor + eng + math;
		return sum;
	}

	public int sum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}

	public int sum(int kor, int eng) {
		return kor + eng;
	}

	public float sum(int kor, float eng) {
		return kor + eng;
	}

	public float sum(float kor, int eng) {
		return kor + eng;
	}
}
