package com.biz.hello;

public class Var_02 {
	
	public static void main(String[] args) {
		
		int num1=8;
		int num2=0;
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		System.out.println(num1+"x"+ ++num2+"="+(num1*num2));
		
		
		
		System.out.println("==================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("==================================");
		
		//num2가 9가 되어있는 상태이므로 ++num2를 실행하면 num2값은
		//10이 되어 이후에 출력되는 구구단은 8x10이 되어 버린다.
        
		//num2에 어떠한 값이 있던지 상관 없이 0으로 clear되어
		//처음 시작하는 것과 같은 상태가 된다
		num2=0;//재설정,clear 	
		System.out.printf("%dx%d=%d",num1,++num2,(num1*num2));
	    System.out.println();
	    System.out.printf("%dx%d=%d",num1,++num2,(num1*num2));
	    System.out.println();
	    System.out.printf("%dx%d=%d",num1,++num2,(num1*num2));
	    System.out.println();
	    System.out.printf("%dx%d=%d",num1,++num2,(num1*num2));
	    System.out.println();
	    System.out.printf("%dx%d=%d",num1,++num2,(num1*num2));
	    System.out.println();
	    System.out.printf("%dx%d=%d",num1,++num2,(num1*num2));
	    System.out.println();
	    System.out.printf("%dx%d=%d",num1,++num2,(num1*num2));
	    System.out.println();
	    
	    System.out.println("==================================");
	    num2=0;
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    System.out.printf("%dx%d=%d\n",num1,++num2,(num1*num2));
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
		
		
		
		
		
		
		
		
	}

}
