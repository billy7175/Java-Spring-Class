package B2_변수_알고리즘_LV1;

public class B2_투표_문제 {
	/*
    [문제]
 		철수네 반은 학생이 40명이다.
 	 	철수와 , 영희 와 , 민수 이는 반장선거에 나갔다.
 	 	민수는 득표를 전체중 40% 를 획득했고, 
 	 	영희는 9표를 획득했다.
 	 	나머지는 철수가 득표를 했다.
 	 	철수는 전체 득표에서 몇%를 획득했는가?
  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double 전체 = 40;
		double 일퍼센트 = 전체 / 100;
		System.out.println("전체 = "+ 전체);
		System.out.println("일퍼센트 = "+ 일퍼센트);
		double 민수 = 일퍼센트 * 40;
		
		System.out.println("민수 " + 민수 + "명");
		double 남은수 = 전체 - 민수;
		System.out.println("남은수 " + 남은수);
		
		double 영희의표수 = 9;
		남은수 = 남은수 - 9;
		System.out.println("영희표 빼고 남은 수 " + 남은수);
		double 철수퍼센티지 = 남은수/일퍼센트;
		System.out.println("철수의 % 는 = " + 철수퍼센티지);
		
		double 영희퍼센티지 = 영희의표수 / 일퍼센트;
		System.out.println("영희의 퍼센티지는 = "+ 영희퍼센티지);
	}

}
