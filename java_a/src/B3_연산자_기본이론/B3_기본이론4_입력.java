package B3_연산자_기본이론;

import java.util.Scanner; // [1] 임포트 한다.

public class B3_기본이론4_입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [2] scan 변수를 만든다.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 : ");
		int a = scan.nextInt();
		System.out.println("입력하신 값은 : "+a);
		
		scan.close();
		// scan.close(); [3] close를 해서 사용종료를 알린다.;
	}

}
