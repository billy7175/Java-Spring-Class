package B1_변수_기본이론;

public class B1_기본이론1_변수 {
	/*
	 * # 변수(variable)
	 * 1. 변수란, 단 하나의 값을 저장할 수 있는 메모리 공간
	 * 2. 변수의 선언 : int a;		// 메모리 공간 할당
	 * 3. 변수의 초기화 : a = 10;	// 값 저장
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 , 실수 , 한글자 , 여러글자
		// 1. 정수
		int a;
		a = 10;
		System.out.println(a);
		
		// 2. 실수
		double d;
		d = 10.1234;
		System.out.println(d);
		
		// 3. character
		char c;
		c = '가';
		System.out.println(c); // 가나 입력시 오류
		
		// 4. string
		String s;
		s = "김철수";
		System.out.println(s);
		
		// 5. boolean
		boolean b;
		b = false;
		System.out.println(b);
		
	}

}
