package B2_변수_알고리즘_LV1;

public class B2_과일판매_문제 {
	/*
		   [문제]
			  가게에 과일 250개가 있다. 
			  그중에 오전에 120개가 팔렸고 오후에는  80개가 팔렸다.
			  남은 과일는 전체 과일의 몇 % 인가?
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 전체과일 = 250;
		int 오전 = 120;
		int 오후 = 80;
		
		int 남은과일 = 전체과일 - 오전 - 오후;
		System.out.println("남은 과일 : " + 남은과일);
		double 일퍼센트 = 전체과일 / 100.0;
		System.out.println("일퍼센트의 개수는 : "+일퍼센트+ "개");
		System.out.println(남은과일 / 일퍼센트);
	}

}
