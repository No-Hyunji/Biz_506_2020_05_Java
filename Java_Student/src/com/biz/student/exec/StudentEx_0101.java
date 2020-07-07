package com.biz.student.exec;

import com.biz.student.service.ScoreService;
import com.biz.student.service.ScoreServiceImplV1;
import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV2;

public class StudentEx_0101 {
	public static void main(String[] args) {
		
		/*StudentService sService = new StudentServiceImplV2();
		while(true) {
			if(!sService.inputStudent()) {
				break;
			}
		}
		sService.studentList();
		*/
		
		ScoreService sService = new ScoreServiceImplV1();
		sService.inputScore();
		sService.inputStudent();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
	}

}
