package B5_연산자_알고리즘_LV1;

public class B5_과일무게_문제 {
	/*
		[문제]
			귤 6개의 무게는 840g, 사과 3개의 무게는 750g 입니다.
 			귤 4개의 무개가 사과 2개의 무게보다 큽니까??
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 귤6 = 840;
		int 사과3 = 750;
		
		int 귤1 = 귤6 / 6;
		int 사과1 = 사과3/3;
		
		int 귤4 = 귤1*4;
		int 사과2 = 사과1*2;
		System.out.println(귤4 > 사과2);

	}

}
