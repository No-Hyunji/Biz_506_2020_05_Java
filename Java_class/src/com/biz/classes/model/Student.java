package com.biz.classes.model;
/*
 * 클래스에는 변수, method가 존재한다.
 */
public class Student {
	//클래스 내의 method밖에 선언된 변수
	//맴버변수, 필드변수, 속성(property)
	public String name;
	private int age;
	public String tel;
	private String addr;
    public int grade;
    
    String rem;
    //임의로 생성 한 method
    //setName() method 라고 칭한다.
    //현재는 하는 일이 정해지지 않은 이름만 있는 상태
    //public : 접근제한자 라고 한다.
    //            누구나 접근 할 수 있는 상태
    //private : 접근제한자라고 한다.
    //   public과 반대되는 개념
    //    나 외에는 아무도 접근하지 말라
    public void setName() {
    	
    }
}
