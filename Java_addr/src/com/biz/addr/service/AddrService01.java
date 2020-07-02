package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.addr.domain.AddrVO;

public class AddrService01 {
	/*
	 * 현재 AddrService01 클래스를 선언하면서
	 * addList 라는 필드변수를 선언 "만" 해 둔 상태
	 * 선언만 된 필드변수 중에 객체 형태의 변수는
	 * 그 변쉥 값을 저장, 추가 하려고 하면 NullpointException이 발생하면서
	 * 코드가 진행이 되지 않는다.
	 * 
	 * 아래의 1~3의 방법으로 반드시 변수르 초기화 해주어야 한다.
	 * 1. 필드변수를 선언과 동시에 초기화 하기
	 * 		메모리관리상 여러가지 문제를 일으킬 수 있기 때문에 가급적 사용하지 말자
	 * 2. 생성자를 이용하여 초기화 하기.(권장방법)
	 * 3. 사용하기 직전에 초기화 하기
	 * 
	 * 객체 형태의 변수란 클래스를 사용하여 선언된 변수들
	 * (int, float, boolean, double 등 기본 형태의 변수 이외의 형태로 선언된 변수들)
	 * 
	 */
	private List<AddrVO> addrList = new ArrayList<AddrVO>(); // 1. 필드변수를 선언과 동시에 초기화
	
	// 2. 생성자를 이요하여 필드 변수 초기화 하기 
	// 클래스의 기본 생성자를 임의로 재 작성하기
	// 누군가 AddrService01 클래스를 객체로 선언하고
	// 		초기화를 하기 위해 생성자를 호출하면
	// 		자동으로 addrList 필드변수가 초기화 되어
	// 		이후의 코드에서 NullpointException이 발생하는 것을 방지한다.
	public AddrService01() {
		this.addrList = new ArrayList<AddrVO>();
	}
	
	/*
	 * 5명의 주소를 생성하여
	 * addrList에 추가
	 */
	public void makeAddr() {
		// 3. 사용하기 직전에 필드변수 초기화 하기
		// 		필드변수를 사용하기 직전에 초기화 하는 방식는
		//      유지보수가 어려워지는 코드가 된다.
		addrList = new ArrayList<AddrVO>();
		
		// 1명의 주소를 저장할 VO객체(인스턴스)
		// AddrVO클래스를 사용하여
		//    addrVO 객체(인스턴스)를 선언
		//            생성자 method를 호추라여 객체를 초기화(사용가능하도록)한다.
		AddrVO addrVO = new AddrVO();
		addrVO.setName("홍길동");
		addrVO.setTel("010-111-1111");
		addrVO.setAddr("서울특별시");
		addrVO.setAge(33);
		addrVO.setNet("친구");
		addrList.add(addrVO);
		
		// 또 한명의 주소를 저장 할 VO 객체 만들기
		// 이미 만들어진 addrVO를 재활용(재 정의)한다.
		// 홍길동 주소를 담은 addrVO를 새롭게 재 정의하여
		// 저장공간을 비워주는 실행을 한다.
		addrVO = new AddrVO(); // 이전에 만들어진 객체(인스턴스)를 재활용하기 위해서는 반드시 다시 생성한다.
		addrVO.setName("이몽룡");
		addrVO.setTel("010-222-2222");
		addrVO.setAddr("익산시");
		addrVO.setAge(22);
		addrVO.setNet("후배");
		addrList.add(addrVO);
		
		addrVO = new AddrVO(); 
		addrVO.setName("김몽룡");
		addrVO.setTel("010-333-3333");
		addrVO.setAddr("김제");
		addrVO.setAge(33);
		addrVO.setNet("선배");
		addrList.add(addrVO);
		
		addrVO = new AddrVO(); 
		addrVO.setName("노몽룡");
		addrVO.setTel("010-444-4444");
		addrVO.setAddr("광주광역시");
		addrVO.setAge(23);
		addrVO.setNet("친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO(); 
		addrVO.setName("성춘향");
		addrVO.setTel("010-555-5555");
		addrVO.setAddr("전주시");
		addrVO.setAge(19);
		addrVO.setNet("친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향", "010-555-5555", "전주시", 16, "친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향", "010-555-5555", "전주시", 16, "친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향", "010-555-5555", "전주시", 16, "친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향", "010-555-5555", "전주시", 16, "친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향", "010-555-5555", "전주시", 16, "친구");
		addrList.add(addrVO);
		
		addrVO = new AddrVO("성춘향", "010-555-5555");
		addrList.add(addrVO);
		
	}
	public void addrList() {
		
	
		System.out.println("=======================================================");
		System.out.println("=======================주소록==========================");
		System.out.println("-------------------------------------------------------");
		System.out.printf("\t이름\t전화번호\t주소\t나이\t관계\n");
		System.out.println("-------------------------------------------------------");
		
		// i < 5 로 설정을 하게 되면
		// 5명의 주소록을 표시 할 때 는 문제가 없으나
		// 만약 주소록 데이터의 개수가 변경되면 문제를 일으킨다
		// addList의 개수를 별도의 변수에 담고
		int addrSize = addrList.size();
		// 개수만큼 반복문을 수행 하도록 변경
		for(int i = 0 ; i < 5 ; i ++) {
			
			AddrVO vo = addrList.get(i);
			System.out.printf(vo.getName() + "\t");
			System.out.printf(vo.getTel() + "\t");
			System.out.printf(vo.getAddr() + "\t");
			System.out.printf(vo.getAge() + "\t");
			System.out.printf(vo.getNet() + "\t");
			
			
		}
	}
}
