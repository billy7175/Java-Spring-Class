package A2_산술연산자_알고리즘_LV1;

public class A2_행사_문제 {
	/*
	   [문제]
	  		현금이 10000원있다. 
	  		1200원짜리 과자 6개를 구입하려고 한다.  
	  		단, 할인행사를 해서 과자는 2+1행사를 하고있다. 
	  		과자를 전부 구입하고난 거스름돈을 구하시오.
	 */
	public static void main(String[] args) {
		System.out.println(10000 - (1200 * 6) + (6/3 *1200)); //
		System.out.println(10000 - (1200 * 6) + (6/3 * 1200)); // 정답 
	}
}
