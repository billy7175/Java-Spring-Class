package B7_입력_알고리즘_LV1;

import java.util.Scanner;

public class B7_로그인_문제 {
	/*		 
	 * [문제] 
	 * 		철수는 로그인을 하려고 한다. 
	 * 		아이디와 비밀번호를 입력받는다. 
	 * 		아이디와 비밀번호 둘중하나만틀려도 로그인은 실패합니다.
	 * 		철수는 로그인을 성공할까요?
	 * 		joinId 와 joinPw 는 철수가 이미가입한 아이디와 비밀번호입니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int storedId = 1111;
		int storedPw = 1234;
		System.out.println("아이디를 입력 :");
		int userId = scan.nextInt();
		System.out.println("입력하신 ID : " + userId);
		
		System.out.println("비밀번호를 입력 : ");
		int userPw = scan.nextInt();
		System.out.println("입력하신 PW : " + userPw);
		scan.close();
	}

}
