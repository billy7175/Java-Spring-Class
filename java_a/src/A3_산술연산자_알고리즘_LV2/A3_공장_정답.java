package A3_산술연산자_알고리즘_LV2;

public class A3_공장_정답 {
	/*
	 * [문제]
	 * 	공장에서 장남감을 1000개만들면 불량이 30개 나온다고 한다. 
	 *  장남감 하나 만드는데 비용이 30원일때 
	 *  정상적인 장남감  10000개를 만들때 필요한 총비용을 구하시오.
	 *  1. 10000개 + 300 나오게 
	 */
	public static void main(String[] args) {
		System.out.printf("장난감 10,000 개를 만들때 필요한 총비용 %d ", (10000 + (10000/1000 * 30)) * 30);
		System.out.println();
		System.out.println((10000 + (10000/1000 * 30)) * 30);
	}
}
