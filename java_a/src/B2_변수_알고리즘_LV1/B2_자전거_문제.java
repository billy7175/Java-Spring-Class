package B2_변수_알고리즘_LV1;

public class B2_자전거_문제 {
	/*
	  [문제]
	 	철수는 자전거를 타고 일정한 빠르기로 7분동안 23 / 30km를 갔습니다.
	 	철수가 자전거를 타고 1분동안 간 거리는 몇 km입니까?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double 총거리 = 23/30.0;
		System.out.println(총거리);
		double 일분 = 총거리 / 7;
		System.out.printf("일분동안 간 거리 : %.2f km", 일분);
	}

}
