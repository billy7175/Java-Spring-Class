package B4_연산자_기본문제;

public class B4_기본문제4_문제 {
	public static void main(String[] args) {		
		

		
		double a = 0.2;
		System.out.println("좌항" + (0.3  * 3 - a) );
		System.out.println("우항" + (0.1 * 5 + 0.2) );
		System.out.println(0.3  * 3 - a == 0.1 * 5 + 0.2);
		
		double b = 5.5;
		System.out.println("좌항 " + (0.5 * 3 + b));
		System.out.println("우항 " + (7));
		System.out.println(0.5 * 3 + b == 7);
	}
}