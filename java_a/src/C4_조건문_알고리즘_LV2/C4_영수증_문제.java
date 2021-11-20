package C4_조건문_알고리즘_LV2;
import java.util.Scanner;

public class C4_영수증_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int price1 = 6500;
		int price2 = 7800;
		int sel;
		System.out.println("-------- 롯 데 리 아 --------");
		System.out.println("1. 치즈버거: "+ price1  );
		System.out.println("1. 새우버거: "+ price2  );
		
		System.out.println("주문번호를 입력해주세요");
		sel = scan.nextInt();
		if(sel == 1) {
			int money;
			System.out.println("현금 입력:");
			money = scan.nextInt();
			if(money < price1) {
				System.out.println("현금이 부족합니다.");
			} else {
				System.out.println("치즈버거를 구입합니다.");
				System.out.println("잔돈 : " +(money - price1));
			}
		}
		
		if(sel == 2 ) {
			int money;
			System.out.println("현금 입력: ");
			money = scan.nextInt();
			if(money < price2) {
				System.out.println("현금이 부족합니다");
			} else {
				System.out.println("새우버거를 구입합니다");
				System.out.println("잔돈 : " + (money -price2));
			}
		}
		
		
		if(sel <= 0 || sel > 2) {
			System.out.println("메뉴에 있는 번호를 선택해주세요.");
		}
		
		System.out.println("------ 감 사 합 니 다 ----------");
		scan.close();
	}

}
