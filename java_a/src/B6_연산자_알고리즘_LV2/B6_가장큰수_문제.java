package B6_연산자_알고리즘_LV2;

public class B6_가장큰수_문제 {
	/*
	 * 
	 * 
	
	 [문제]
		아래 변수 a , b , c 중에서 a에 가장큰수가 저장되어있는지 확인합니다.
		a 는 가장큰수입니까?

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 20;
		int c = 10;
		
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("a는 가장 큰 수 인가요 ? "+ (a > b && b > c));
	}

}
