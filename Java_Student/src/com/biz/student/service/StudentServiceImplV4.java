package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentServiceImplV4 {
	
	public boolean inputStudent() {
		
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		/*
		 * fileReader 클래스로 fileReader 객체(인스턴스)를 선언하고 clear 하기
		 * 문자열, 숫자 등이 아니 정체를 알 수 없는 클래스로 객체를 선언할 때는
		 * 가급적 null로 clear를 시켜주는 것이 좋다.
		 */
		FileReader filereader = null;
		/*
		 * 로컬디스크에 저장된 파일을 읽을 때 FileReader 만으로 읽을 수 있지만
		 * 파일을 읽어들이는 성능상의 잇점을 주기 위해서 중간 BufferedReader를
		 * 연결하여 파일을 읽어 들이는 것이 좋다.
		 */
		BufferedReader buffer = null;
		
		try {
			// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(studentFile);
			
			
			buffer = new BufferedReader(fileReader);
			
			
			String reader = "";
			
			while(true) {
				
			
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				// System.out.println(reader); 디버깅용
				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setNum(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setNum(students[3]);
				studentList.add(sVO);
			}
			
			// 파일을 읽기, 쓰기로 열었으면 모두 닫아서 종료해주어야한다
			buffer.close();
			FileReader.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return true;
	}

}
