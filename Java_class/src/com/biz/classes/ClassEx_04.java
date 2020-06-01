package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_04 {

	public static void main(String[] args) {
		
		//city변수는 private이기 때문에
		//	인스턴스를 통해서 직접 접근불가
		//address.city = "광주광역시"
		Address address = new Address();
		//city변수에 값을 저장하기 위한
		//setter method() 에게 값을
		//저장 해 달라고 요청
		
		address.setCity("광주광역시");
		
		//city 변수에서 값을 읽기 위한
		//getter method()를 사용하여
		//값을 가져오기
		String city = address.getCicy();
		
		address.setCity("서울특별시");
		 System.out.println(city);
	}
}
