package A2_산술연산자_알고리즘_LV1;

public class A2_할인_문제 {
	/*
	 * [문제]
	 * 		현금이 10000원있다.
	 * 		1200원짜리 과자 6개를 구입 후  거스름돈을 구하시오.
	 * 		단, 할인행사를 해서 과자를 3개 살때마다 200원씩 할인해준다.
	 */
	 public static void main(String[] args) {
		System.out.println("거스름돈은 "+ (10000 - (1200 * 6) + (6 / 3 *200) ));
	 }
	 
}
