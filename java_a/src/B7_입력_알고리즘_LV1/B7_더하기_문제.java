package B7_입력_알고리즘_LV1;

import java.util.Scanner;

public class B7_더하기_문제 {
	/*		 
	  [문제] 
	  		숫자 2개를 입력받고 그합을 구하시오.
	  		(예) 3, 5 ==> 8
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		System.out.println("숫자1 입력 :");
		num1 = scan.nextInt();
		System.out.println("숫자2 입력 :");
		num2 = scan.nextInt();
		System.out.println(num1 + num2);
		scan.close();

	}

}
