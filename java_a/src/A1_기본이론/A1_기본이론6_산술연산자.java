package A1_기본이론;

public class A1_기본이론6_산술연산자 {
	/*
     연산자 (operator)
     [1. 산술연산자]
     
     1) 더하기 +
     2) 빼기 -
     3) 곱하기 *
     4) 나누기 / 
     5) 나머지 %
	 */
	public static void main(String[] args) {
		System.out.println(10 + 3);
		System.out.println(10 - 3 );
		System.out.println(10 * 3); // 소수점의 몫
		System.out.println(10 / 3.0);
		System.out.println(10 % 3);
		
		/*
		 * [문제]
		 * 철수는 현금을 10000원을 가지고 여정마트에 갔다.
		 * 사과 한개의 가격은 200원이고, 귤한개의 가격은
		 * 110원이다.
		 * 사과3개와 귤10개를 구입할려고 한다.
		 * 거스름 돈은 얼마인가
		 **/
		System.out.println(10000 - (200 * 3) - (110 *10));
		
	}
}
