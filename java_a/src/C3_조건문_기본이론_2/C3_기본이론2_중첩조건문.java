package C3_조건문_기본이론_2;
import java.util.Scanner;

public class C3_기본이론2_중첩조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int join_id = 1234;
		int join_pw = 1111;
		int login_id;
		int login_pw;
		
		
		// [1] 로그 아이디를 입력받는다.
		// [1-1] 로그아이디가 조인아이디와 같은지 비교 후 
		// [1-2] 같으면 비빌번호 입력
		System.out.println("------------------------------------");
		System.out.println("로그인 아이디를 입력해주세요.");
		login_id = scan.nextInt();
		if(join_id != login_id) {
			System.out.println("아이디를 확인해주세요.");
		} else {
			System.out.println("비빌번호를 입력해주세요.");
			login_pw = scan.nextInt();
			if(join_pw ==login_pw) {
				System.out.println("로그인을 성공했습니다");
			} else {
				System.out.println("올바른 비밀번호를 입력해주세요.");
			}
		}
		scan.close();
	}

}
