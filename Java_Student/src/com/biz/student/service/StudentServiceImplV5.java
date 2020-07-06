package com.biz.student.service;
/*
 * student.txt 파일을 읽어서 studentList에 저장하고
 * student_list.txt 파일에 학생명부 출력
 * 
 * inputStudent method를 변경하여
 * 전공이 컴퓨터 공학인 학생들만 리스트를 추출하시오
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentServiceImplV5 {
	
	public boolean inputStudent() {
		
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		// FileReader클래스로 fileReader 객체(인스턴스)를 선언하고 clear 하기
		// 문자열, 수샂 등이 아닌 정체를 알 수 없는 클래스로 객체를 선언 할 때는
		// 가급적 null로 clear 시켜주는 것이 좋다.
		FileReader fileReader = null;
		
		// 로컬디스크에 저장된 파일을 읽을 때 FileReader만으로 읽을 수 있지만,
		// 파일을 읽어드리는 성능상의 이점을 주기 위해서 중간에 BufferedReader를
		// 연결하여 파일을 읽어들이는 것이 좋다.
		BufferedReader buffer = null;
		
		try {
			// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(studentFile);
			
			// fileReader객체에 저장된 정보를 buffer관리자에게 전달하여 파일을 읽도록 지시
			// buffer 관리자는 파일을 몽땅 읽어서 자신이 관리하는 buffer장치에 임시 보관
			buffer = new BufferedReader(fileReader);
			
			// buffer 장치로부터 text내용을 1줄 씩 읽어 들이기
			
			// 문자열 변수의 경우 for, while반복문내에서 계속해서
			// 선언하는 것은 메모리 관리상 매우 좋지 않다.
			// 따라서 문자열 변수는 반복문이 실행되기 전에
			// 먼저 선언, clear를 하고 진행하는 것이 좋다.
			String reader = "";
			/*
			 * 파일의 라인 수가 200대로 정해지고, 그 라인 수를 알 수 있다면,
			 * 다음과 같은 코드로 충분히 처리가 가능 할 것이다.
			 
			for(int i = 0 ; i < 200 ; i ++) {
				reader = buffer.readLine();
				System.out.println(reader);
			}
			하지만, 파일은 상황에 따라 라인 수가 변경 될 수도 있고, 
			라인 수를 예측하지 못하는 상황이 올 수도 있다.
			즉. 반복문을 수행해야할 횟수를 정하지 못할 수도 있다.
			이럴때는 for 반복문 보다는 while문을 사용하는 것이 좋다.
			*/
			while(true) {
				
				// buffer.readLine() method는 호출 될 때마다
				// buffer로 부터 파일을 한줄씩 읽어서 reader 변수에 담는다
				// buffer로 부터 파일을 읽어오다가 파일을 모두 읽었는데도 불구하고
				// 또 readLine() method를 호출하면 null값이 return 되고
				// reader 변수에는 null값이 담기게 된다.
				// 그러면 reader 변수에 null 값이 담겨 있는지 확인하여
				// 반복문을 종료한다.
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				System.out.println(reader);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return true;
	}

}
