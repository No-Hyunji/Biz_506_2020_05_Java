package com.biz.cars;

import com.biz.classis.Car;

public class CarMake_03 {
	
	public static void main(String[] args) {
		
		System.out.println("소나타가 전진합니다");
		System.out.println("소나타가 후진합니다");
		System.out.println("소나타가 멈춥니다");
		
		
		System.out.println("그랜져가 전진합니다");
		System.out.println("그랜져가 후진합니다");
		System.out.println("그랜져가 좌회전합니다");
		
		/*
		 * 1.소나타가 전진합니다
		 * 2.그랜져가 전진합니다
		 * 3.소나타가 후진합니다
		 * 4.그랜져는 좌회전을 합니다
		 * 5.소나타가 멈춥니다.
		 * 6.그랜져가 후진을 합니다
		 * 7.소나타가 전진을 합니다
		 */
		
		
	
		//내가
		Car 소나타 = new Car();
		Car 그랜져 = new Car();
		
		소나타.전진();
		그랜져.전진();
		소나타.후진();
		그랜져.좌();
		소나타.멈춤();
		그랜져.후진();
		소나타.전진();
	
	}
	
	
	

}
