package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {
	
	List<StudentVO> studentList;
	List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		scoreList = new ArrayList<ScoreVO>();
	}

	public void inputStudent() {
		String studentFile = "src/com/biz/student/exec/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			fileReader = new FileReader(studentFile);

			buffer = new BufferedReader(fileReader);

			String reader = "";

			while (true) {

				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// System.out.println(reader);
				String[] students = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(students[SplitPos.STUDENT.ST_NUM]);
				studentVO.setName(students[SplitPos.STUDENT.ST_NAME]);
				studentVO.setGrade(Integer.valueOf(students[SplitPos.STUDENT.ST_GRADE]));
				studentVO.setDept(students[SplitPos.STUDENT.ST_DEPT]);

				studentList.add(studentVO);
				// 선생님 ver => studentList.add(sVO);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void inputScore() {
		String scoreFile = "src/com/biz/student/exec/score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";

			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// System.out.println(reader); 확인용도
				String[] scores = reader.split(":");
				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setNum(scores[SplitPos.SCORE.SC_NUM]);
				scoreVO.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR]));  // 유지 보수가 쉬워지는 코드. static을 사용하는 용도. SplitPos
				scoreVO.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
				scoreVO.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));
				scoreVO.setSum(Integer.valueOf(scores[SplitPos.SCORE.SC_SUM]));
				scoreVO.setAvg(Float.valueOf(scores[SplitPos.SCORE.SC_AVG]));

				scoreList.add(scoreVO);
				// 선생님 => scoreList.add(sVO)

			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void calcSum() {

		for (ScoreVO sVO : scoreList) {
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();

			sVO.setSum(sum);

		}

	}

	@Override
	public void calcAvg() {
		for (ScoreVO sVO : scoreList) {
			int sum = sVO.getSum();
			float avg = sum / 3;
			
			sVO.setAvg(avg);
		}
	}

	@Override
	public void scoreList() {
		System.out.println("============================================================");
		System.out.println("성적표");
		System.out.println("------------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평점");
		System.out.println("------------------------------------------------------------");
		
		int scoreSize = scoreList.size();
		int studentSize = studentList.size();
		
		
		
		for(int i = 0; i < scoreSize ; i++) {
			ScoreVO sVO  = scoreList.get(i);
			
			
			for(int j = 0 ; j < studentSize ; j++) {
				StudentVO stVO = studentList.get(j);
				if(sVO.getNum().equals(stVO.getNum())) {
					System.out.println(stVO.getName()+"\t");
					break;
				}
				
				if( sVO.getNum().equals( stVO.getNum())) {
					System.out.print(sVO.getNum()+"\t");
					System.out.print(stVO.getName()+"\t");
					System.out.print(sVO.getKor()+"\t");
					System.out.print(sVO.getEng()+"\t");
					System.out.print(sVO.getMath()+"\t");
					System.out.print(sVO.getSum()+"\t");
					System.out.print(sVO.getAvg()+"\n");
					
				}
			}
		}

	}
}
