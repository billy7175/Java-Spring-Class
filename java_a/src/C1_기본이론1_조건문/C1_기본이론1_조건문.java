package C1_기본이론1_조건문;

public class C1_기본이론1_조건문 {
	// 1) if ==> 키워드
	// 2) (조건) ==> 조건이 사실이면 실행문이 동작 () ==> 소괄호
	// 3) {실행문} ==> 실행되는 영역 {} ==> 중괄호 [] ==> 대괄호
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
//		if(a == 10) {
//			System.out.println("a는 " + a + "다");
//		}
//		if(a != 10) {
//			System.out.println("aasdasd");
//		}
		
		// 문제) b의 값이 짝수이면 "짝수", 홀수이면 "홀수" 이렇게 출력해보세요

		if(a % 2 == 0) {
			System.out.println("a의 값은 짝수" );
		}
		
		if(a%2 == 1) {
			System.out.println("a의 값은 홀수");
		}
	}

}
