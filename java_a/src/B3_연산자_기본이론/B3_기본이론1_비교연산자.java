package B3_연산자_기본이론;

public class B3_기본이론1_비교연산자 {
	// [1] 산술연산자 + - * / %
	// [2] 대입연산자 =
	/*
	 * [대입연산자 ] = (오른쪽의 값을 왼쪽의 변수에 저장해라)
	 * 
	 *   (1) 크니 ? 10 > 3
	 *   (2) 작니 ? 10 < 3
	 *   (3) 같니 ? 10 == 3 
	 *   (4) 다르니 ? 10 != 3 
	 *   (5) 크거나 같니 ? 10 >= 3 
	 *   (6) 작거나 같니 ? 10 <= 3
	 *   
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 > 3);
		System.out.println(10 < 3);
		System.out.println(10 == 3);
		System.out.println(10 == 3);
		System.out.println(10 != 3);
		System.out.println(10 <= 3);
		System.out.println("-------------------------");
		
		int a = 10;
		int b = 3;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}

}
