package com.biz.control;

import java.util.Random;

public class if_05 {
	
  public static void main(String[] args) {
	
	  Random rnd=new Random();
	  int num1=rnd.nextInt(100)+1;
	  
	  /*
	   * if(조건){
	   * 
	   * }else if(조건2)
	   * 
	   * } else {
	   * 
	   * }
	   * 
	   * 
	   * 여러가지 조건중에서 1가지 조건에 해당하는 결과를 찾고자 할 때 
	   * 사용하는 명령문 구조이며 
	   * 만약 조건 1이 true일 경우 나머지 조건은 다시 연산을 수행 하지 않는다.
	   * 
	   */
	  if(num1%5==0) {
		  System.out.printf("%d는 5의 배수\n",num1);
		  
	  } else if(num1%4==0) {
		  System.out.printf("%d는 4의 배수\n",num1);
	  } else if(num1%3==0) {
		  System.out.printf("%d는 3의 배수\n",num1);
	  } else if(num1%2==0) {
		  System.out.printf("%d는 2의 배수\n",num1);
	  } else {
		 System.out.printf("%d는 5,4,3,2의 배수가 아니다\n",num1);
	  }
	  
	  
	  
}

}
