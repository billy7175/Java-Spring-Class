package A3_산술연산자_알고리즘_LV2;

public class A3_계단_문제 {
	/*
	  [문제]
		철수와 영희는 가위바위보 게임을 하고있다. 
		규칙은 아래와같다.	
		
		이기면 계단을 3칸 올라간다.
		지면  계단을 2칸 내려간다.
		비기면 아무일도 생기지않는다. 
		계단은 총 100계단이다. 
		
		50번째 계단에서 게임을 시작한다.
		
		철수는 4번이기고 2번졌다.
		철수의 현재위치를 구하시오.
		
	 */
	public static void main(String[] args) {
		System.out.println("시작 : "+  50);
		System.out.printf("현재 철수의 계단 위치는 %d", 50 + (4*3) - (2 *2));
		System.out.println();
		System.out.println(50 + (4 * 3) - (2 * 2)); // ANSWER 
	}
}
