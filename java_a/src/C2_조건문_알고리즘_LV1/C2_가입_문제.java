package C2_조건문_알고리즘_LV1;
import java.util.Scanner;
public class C2_가입_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		int signup_id =0;
		int signup_password = 0;
		int login_id = 0;
		int longin_password = 0;
		System.out.println("WELCOME");
		System.out.println("회원가입 아이디를 입력해주세요.");
		signup_id = scan.nextInt();
		System.out.println("회원가입 비빌번호를 입력해주세요.");
		signup_password = scan.nextInt();
		System.out.println("-------------------");
		System.out.println("입력하신 id는 " + signup_id);
		System.out.println("입력하신 password는 "+ signup_password );
		
		
		System.out.println("-------- 로그인을 시작합니다 --------");
		System.out.println("아이디를 입력해주세요");
		login_id = scan.nextInt();
		System.out.println("비밀번호를 입력해주세요.");
		longin_password =scan.nextInt();
		
		if(signup_id == login_id && signup_password ==longin_password ) {
			System.out.println("로그인 성공");
		}
		
		if(signup_id != login_id || signup_password != longin_password ) {
			System.out.println("올바른 정보를 입력해주세요.");
		}
		
		scan.close();
	}

}
