package B4_연산자_기본문제;

public class B4_기본문제3_문제 {
	
	public static void main(String[] args) {		
		// 모두 사실이 되도록 변수의 값을 변경해보자
		int a = 17;
		System.out.println("좌항 = " +  (7 * 2 - a));
		System.out.println("우항 = "+ (3 * -2 - -3));
		System.out.println(7 * 2 - a == 3 * -2 - -3);
		
		
		int b = 5;
		System.out.println("좌항 = " +  (b * b - 25));
		System.out.println("우항 = "+ (0));
		System.out.println(b * b - 25 == 0);
		
		
		int c = 6;
		System.out.println("좌항 = " +  (3 * c + 2));
		System.out.println("우항 = "+ (20));
		System.out.println(3 * c + 2 == 20);
		
		int d = 4;
		System.out.println("좌항 = " +  (5 * d));
		System.out.println("우항 = "+ (2 * 10));
		System.out.println(5 * d == 2 * 10);
		
	}
}