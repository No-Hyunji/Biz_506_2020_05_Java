package Scanner;

import java.util.Scanner;

public class ScanEx_05 {
	
	public static void main(String[] args) {
		/*
		 * scanner를 사용해서 nextInt(), nextLine() method를 섞어 사용하면
		 * 내부 문제로 인한 의도하지 않은 코드진행이 되어
		 * 숫자, 문자 모두 문자열을 입력받는 nextLine() method로 통일하여 사용한다.
		 * 
		 * scanner의 내부 문제에 의한 코드 진행의 문제를 해결하기 위해 
		 * 키보드로부터 값을 읽는 method를 nextLine() 만 사용하기로 하였다.
		 * 그런데 숫자를 2개 입력받아 덧셈을 수행 한 후 
		 * 결과를 보고 싶은 코드를 작성하고 나니
		 * 숫자의 덧셈이 아닌 숫자형 문자열의 연결을 만드는 코드가 되어버렸다.
		 * 
		 * 만약 키보드 에서 입력받은 문자열을 숫자 형 (int, float) 으로 변환 할 수 있다면,
		 * nextLine()을 이용하여 원하는 결과를 얻을 수 있을 것이다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 >> ");
		String strNum1 = scan.nextLine();
		
		// Integer.valueOf() method를 사용하여 숫자형으로 된 문자열 데이터를 정수형 데이터로 변환
		int intNum1 = Integer.valueOf(strNum1);
		
		System.out.print("숫자2 >> ");
		String strNum2 = scan.nextLine();
		int intNum2 = Integer.valueOf(strNum2);
		
		System.out.println(strNum1 + strNum2);
		System.out.printf("%d + %d = %d", intNum1, intNum2, intNum1+intNum2);
	
		/*
		 * InputStream의 문제로 인하여
		 * 숫자를 scan하는 nextInt() method를 수행 한 후 
		 * 곧바로 이어서 문자열을 scan하는 nextLine() method를 수행하면
		 * 내부 메커니즘 문제로 인하여 Buffer에 Enter 코드가 남아있다가
		 * 곧바로 nextLine() method에게 전달 되어 버린다.
		 * 이때문에 nextInt() 를 수행 한 후 nextLine()를 수행하면
		 * 의도하지 않게 코드가 진행된다.
		 * 
		 * 이 문제를 해결하기 위해 scanner를 통해 키보드 입력을
		 * 받기 위해서는 nextLine() 만 사용하자
		 * 그럼 숫자는??????????????????????????????
		 */
		System.out.print("문자열 입력 >> ");
		String strInput = scan.nextLine();
		System.out.print("입력된 문자열 : " + strInput);
		
		scan.close();
	}

}
