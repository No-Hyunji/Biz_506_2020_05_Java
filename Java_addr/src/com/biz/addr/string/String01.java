package com.biz.addr.string;

public class String01 {
	public static void main(String[] args) {
		
		/*
		 * 문자열형 변수는 
		 * 변수가 생성될 때 실제 문자열이 담기는 변수영역과
		 * 문자열이 담긴 변수 영역의 주소를 갖고 있는 변수 영역 이렇게 두개가 생성된다.
		 * 한곳은 실제 값이 담기고, 한 곳은 주소가 담긴다. 
		 * 
		 * 문자열을 == 비교연산자로 비교를 하면, 
		 * 원칙은 주소로 비교를 하나, 어떤 떄는 문자열 값으로 비교하기도 하고
		 * 어떤 때는 주소로 비교를 한다.
		 * 
		 * 똑같은 문자열임에도 불구하고 결과는 true, false예측이 어렵다.
		 * 
		 * 따라서 문자열은 절대 == 비교연산자로 비교하면 안된다.
		 * java에서는 !!!
		 */
		String str1 = "korea";
		String str2 = "korea";
		System.out.println(str1 == str2); //true
		
		String str3 = "korea";
		String str4 = new String("korea");
		System.out.println(str3 == str4); //false
		
		/*
		 * 문자열형 변수
		 * 기본형 변수와 같은 방식으로 사용을 하지만 태생은 클래스이다.
		 * 즉 문자열형 변수는 String 클래스의 객체 (인스턴스) 이다.
		 * 따라서 String클래스에 정의된 다양한 method들을 사용할 수 있다는 것이다. 
		 * 그중 가장 많이 사용하는 method가 바로 문자열 변수의 값을 비교하는 equals() method이다.
		 * 
		 * equals()
		 * 문자열형 변수에 저장된 실제문자열이 같은가를 비교하는 method이다
		 * 문자열이 같으면 true, 그렇지 않으면 false를 return하도록 정의 되어 있다.
		 */
		
		boolean bYes = str3.equals(str4);
		bYes = str4.equals(str3);
		System.out.println(bYes);
		
		//equals()와 사용법은 같으며
		// 영문자일 경우 대소문자 관계없이 문자열을 비교한다.
		bYes = str3.equalsIgnoreCase(str4);
		
		System.out.println("korea".equals("KOREA"));
		System.out.println("korea".equalsIgnoreCase("KOREA")); // true
		System.out.println("korea".equalsIgnoreCase("korea")); // true
		System.out.println("kOrea".equalsIgnoreCase("KOREA")); // true
		
		
	}
}
