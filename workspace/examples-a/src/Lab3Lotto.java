
public class Lab3Lotto {
	static java.util.Scanner scanner = new java.util.Scanner(System.in); // 입력기 생성

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selection = selectMenu();
		
		
		if(selection.equals("1")) {
			int[] numbers = selectBasicNumbers();
			
//			System.out.println("준비중입니다.");
			showNumbers(numbers);
			
		} else if(selection.equals("2")) {
			System.out.println("행운을 빕니다!!!!");
			System.out.println("프로그램을 종료합니다");
		} else {
			System.out.println("지원하지 않는 명령어입니다.");
		}
	}
	
	static String selectMenu() {
		java.util.Scanner scanner = new java.util.Scanner(System.in); // 입력기 생성
		System.out.println("****************");
		System.out.println("1. 당첨 예상 번호 뽑기.");
		System.out.println("2. 종류");
		System.out.println("****************");
		System.out.println("작업을 선택하세요 : ");
		String selection = scanner.nextLine(); // 사용자 입력을 문자ㅕㄹ(0개 이상의 문자 집합)로 변환
		System.out.println("Your selection is "+ selection);
		return selection;
	}

	private static int[] selectBasicNumbers() {
		int [] numbers = new int[6]; // 정수 6개를 저장할 수 있는 배열 인스턴 만들고 주소를 저장
		for(int i =0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 45)+1;
			for(int j=0; j < i; j++) {
				if(numbers[i] == numbers[j]) { // 중복된 데이터가 발견된다면
					// i = -1 을 넣음으로써 초기화를 시킬 수 있음;
					i--; // i-=1, --i, i= i-1;
					break;
				}
			}
		}
		return numbers;
	}

	private static void showNumbers(int[] numbers) {
		System.out.println("당첨 예상 번호 :");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i);
			System.out.println("[" +numbers[i] +"]");
		}
	}

}
