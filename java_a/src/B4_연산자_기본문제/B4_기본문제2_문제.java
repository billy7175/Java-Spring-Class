package B4_연산자_기본문제;

public class B4_기본문제2_문제 {
	public static void main(String[] args) {
		//문제) 아래 연산의 결과가 모두 true가 출력되도록 변수의 값을 변경 		       
		int a = 3;
		int b = 1;
		int c = 1;
		System.out.println(a + b - 3  == c);
		
		a = 1;
		b = -1;
		c = 1;		
		System.out.println(a * -b  == c);
		
		a = 4;
		b = 1;
		c = 1;		
		System.out.println(a + -b * 3 == c);
				
		a = 3;
		b = 2;
		c = 1;		
		System.out.println(a % b  == c);
		
		a = 6;
		b = 1;
		c = 1;	
		System.out.println(a % (b + 3)  == c * 2);

		
	}
}