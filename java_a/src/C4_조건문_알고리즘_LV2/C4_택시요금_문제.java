package C4_조건문_알고리즘_LV2;
import java.util.Scanner;
public class C4_택시요금_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int 이동거리;
		int 기본요금 = 10000;
		System.out.println("이동거리를 입력해주세요:");
		이동거리 = scan.nextInt();
		if(이동거리 > 0 && 이동거리 <= 10) {
			System.out.println("택시요금: " + 기본요금);
		}
		
		if(이동거리 > 10) {
			int 추가거리  = 이동거리 - 10;
			int 추가요금수 = 추가거리 / 3;
			if(추가거리 % 3 > 0 ) {
				추가요금수 = 추가요금수 +1;
			}
			
			System.out.println("추가거리 : " + 추가거리);
			System.out.println("추가요금 : " + 추가요금수 + " 번");
			System.out.println("택시요금 : " + (기본요금 + (추가요금수 * 2300)));
			
		}
		
		scan.close();
	}

}
