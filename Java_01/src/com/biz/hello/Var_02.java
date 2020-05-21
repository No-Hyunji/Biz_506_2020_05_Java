package com.biz.hello;

public class Var_02 {
	/*
	 * main() : 키워드()형식의 명령어는 Meyhod라고 한다.
	 * main() Method 라고 호칭한다
	 * 
	 * public static void main()
	 * 클래스의 시작점 진입점 Method라고 한다.
	 */
	public static void main(String[] args) {
		// main() method Scope라고 한다.
		// main() method 내에서 선언된 변수는
		// main() method가 끝나면 모두 삭제된다.
		// 다시말해 main() method 밖에서는 변수를 읽을 수 없다.
		int num1 = 30;
		int num2 = 40;
		// 변수 선언 규칙 1
		// 같은 Scope내에서는 한 번 선언 된 변수 이름으로
		// 또다시 변수를 선언 해서는 절대 안됀다.
		
		int num1 = 50;
		
		/*
		 * 변수 선언 규칙
		 * 1. 변수 명: 첫글자는 영문소문자 (또는 _)
		 *           두번째 : 영문대소문자, 숫자, _ 사용 할 수 있다.
		 *           변수명은 의미를 담게 명명하자.   
		 *           두 단어 이상 연결하여 변수 명을 작성 할 때는
		 *           단어_단어 또는 wordWord 패턴으로 작성하자.
		 *  = 단어_단어 : snack case
		 *     wordWord :came1 case라고 한다.
		 * 
		 * 2. 변수 선언 불가 항목
		 *   가. keyword는 변수로 선언 할 수 없다.
		 *   나. 빈칸, 특수문자(_제외)는 변수 명에 포함 될 수 없다.
		 */
		
	}

}
