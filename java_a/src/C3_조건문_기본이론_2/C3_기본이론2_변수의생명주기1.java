package C3_조건문_기본이론_2;

public class C3_기본이론2_변수의생명주기1 {
	// 변수의 생명주기
	// 벼누는 선언당시의 여는 중괄호 { 여기서부터 닫는중괄호} 여기까지 유지된다.
	// } 닫는 중괄호를 만나면 소멸된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		{
			int b= 20;
			System.out.println("a1" + a);
			System.out.println(" b1"+ b);
			
		}
	
		
		System.out.println("a2: "+ a);
	}

}
