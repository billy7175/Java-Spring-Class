package B1_변수_기본이론;

public class B1_기본이론4_변수의특징 {
	/*
	 * # 변수의 특징
	 * [1]. 변수는 값을 한개만 저장할 수 있다.
	 * [2]. 때문에 새로운 값이 저장되면 이전의 값은 사라진다.
	 * [3]. 같은 이름의 변수를 또 다시 선언 할 수 없다. ==> (int 를 같은이름에 2번사용못한다.)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a = 20; 
		System.out.println(a);
		
		// int a; 이미 a 가 존재한다.
//		int a;
	}

}
