package B4_연산자_기본문제;

public class B4_기본문제1_문제 {
	public static void main(String[] args) {
		//문제) 아래 연산의 결과가 모두 true가 출력되도록 숫자를  변경	
		int num = 3;
        System.out.println(num == 3);
        System.out.println(4 != 3);
        System.out.println(39 > 38);
        System.out.println(12 < 31);
        System.out.println(1 <= 11);
        System.out.println(32 >= 10);		    
        System.out.println("--------------------------");              
        //문제) 아래 연산의 결과가 모두 true가 출력되도록 변수a, b 의 값  변경	
        int a = 10;
        int b = 3;
        b = 10;
        System.out.println(a == b);
        b = 1;
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a >= b);
	}
}