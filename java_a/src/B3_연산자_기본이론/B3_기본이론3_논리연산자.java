package B3_연산자_기본이론;

public class B3_기본이론3_논리연산자 {
	// 1. 산술연산자
	// 2. 대입연산자
	// 3. 비교연산자
	// 4. 논리연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  비교연산자를 여러개 사용하고 싶을 떄 사용.
		 *  
		 *  [1] and ==> &&
		 *  [2] or ==> ||
		 *  [3] not ==> !
		 * 
		 * 
		 * */
		System.out.println(10 == 10 && 9 == 9);
		System.out.println(10 != 10 && 9 == 9);
		System.out.println(10 == 10 && 9 != 9);
		System.out.println(10 != 10 && 9 != 9);
		System.out.println("------------------------");
		System.out.println(10 == 10 || 9 == 9);
		System.out.println(10 != 10 || 9 == 9);
		System.out.println(10 == 10 || 9 != 9);
		System.out.println(10 != 10 || 9 != 9);
		System.out.println("------------------------");
		System.out.println(!(10 == 10));
		
	}

}
