package B2_변수_알고리즘_LV1;

public class B2_놀이공원_문제 {
	/*
	  [문제]
		   철수는 놀이공원에 갔습니다. 
		   놀이공원 입장료는 15000원 입니다.
		   철수는 이런저런 할인을 받아서 9000원에 입장했습니다.
		   몇 % 할인받은것일까요?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 입장료 = 15000;
		int 일퍼센트 = 15000 / 100;
		int 지불금액 = 9000;
		int 할인금액 = 입장료 - 지불금액;
		int 할인률 = 할인금액 / 일퍼센트;
		System.out.println("철수가 받은 할인률은 " + 할인률 + "% 입니다.");
	}

}
