package B1_변수_기본이론;

public class B1_기본이론7_자료형변환 {
	public static void main(String[] args) {
    /*
     * 정수 + 정수
     * 실수 + 실수
     * 문자 + 문자
     * 
     * */
		
	// 자동형변환
		System.out.println(10 + 10.3);
		System.out.println("안녕 : "+ 10);
		
		// 강제형변환
		// 방법은 : 변수앞에 변환하고 싶은 자료형을 () 소괄호와 함께 써준다.
		int a = 10;
		double b = (double)a;
		int c = (int)b;
		
		int test1 = 10;
		double test2 = 20.3;
		
		int test3 = test1 + (int)test2;
	}
}
