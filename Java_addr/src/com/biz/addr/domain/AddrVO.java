package com.biz.addr.domain;
/*
 * domain 객체
 * 주로 1개의 데이터를 담아서 이동, 처리 하는 용도로 사용하는 클래스(객체)들
 * 
 *  클래스를 객체로 선언하고 초기화 할 때 호출하는 생성자는 
 *  
 *  매개변수가 없는 기본 생성자
 *  필드변수 리스트를 매개변수로 받아서 필드변수 값을 지정하는 필드생성자를 만들 수 있다
 */
public class AddrVO {
	/*
	 * 필드 변수가 String를 포함한 primitive(기본형) 변수형 일때는
	 * 초기화가 자동으로 이루어진다.
	 * 		문자열은 "" 으로, 숫자는 0으로
	 * 
	 *  primitive(기본형) 변수형
	 *  	int float, double, long, boolean, char
	 *  Wrapper 클래스 (기본 확장형) 변수형
	 *  	Integer, Float, Double, Long, Boolean, Character
	 *  특별히 클래스(객체) 이면서 primitive처럼 동작하는 변수형
	 *  	String
	 */
	private String name;
	private String tel;
	private String addr;
	private int age;
	private String net;
	
	
	// 객체생성 될 때 필드변수들에세 특별히 값을 만들어주고 싶을 때
	// 임의로 기본 생성자를 만들고
	// 필드변수들에 값을 Setting할 수 있다.
	public AddrVO(){
		
	
		this.name = "이름을 입력하세요";
		this.tel = "전화번호를 입력하세요";
		this.addr = "주소를 입력하세요";
		this.age = 0;
		this.net = "관계를 입력하세요";
	}

	// 필드(변수)생성자
	/*
	 * 객체를 초기화 할때 필수적으로 필요한 이름과 전화번호 값만 저장하여
	 * 주소를 만들고 싶다
	 * 이때 호출하여 사용하는 생성자
	 * 
	 * 	 */
	public AddrVO(String name, String tel, String addr, int age, String net) {
		super();
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
		this.net = net;
	}

	public AddrVO(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNet() {
		return net;
	}
	public void setNet(String net) {
		this.net = net;
	}
	
	
	

}
