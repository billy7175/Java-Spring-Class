package A2_산술연산자_알고리즘_LV1;

public class A2_봉사활동인원_문제 {

	/*	
	 	[봉사활동 문제]
		   - 철수네 반 학생은 31명입니다.
		   - 이중에서 남학생은 3명 , 여학생은 남학생의 3배의 학생이 봉사할동을 하였습니다.
		   - 철수네 반에서 봉사활동을 하지않은 학생과 봉사활동 한 학생의 차이는 얼마인지 구하시오.
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.printf("봉사활동을 다녀온 학생 수 %d명" , (3 + 3 * 3));
		System.out.printf("봉사활동을 다녀온 학생 수 %d명",( 3 + 3 * 3 ));
		System.out.println();
		System.out.printf("봉사활동을 하지 않은 학생 수 %d명", (31 - (3+ 3 * 3)));
		System.out.println();
		System.out.printf("차이의 수 %d명", (31 - (3 + 3 * 3)) -  (3 + 3 * 3));
		System.out.println();
		System.out.printf("봉사활동을 다녀오지않은 학생 - 봉사활동을 다녀온학생 수 = %d명",
				(31 - (3 + 3 * 3)) - (3 + 3 * 3));
		
	}

}
