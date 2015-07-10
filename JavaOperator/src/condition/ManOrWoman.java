package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : KEC
 * @ Story : Switch 예제(성 판별)
 * */
public class ManOrWoman {
	public void ssn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(예 800101-2123456)");
		String id = scanner.next();
		String msg = "";
		/*
		charAt(n) 이 메소드는 0 부터 시작하여 n번째 글자 하나만 출력하는데 ,
		출력결과를 프로그래밍에서는 리턴값이라고 한다.
		아래 예 같은 상황에서는 리턴값이 2가 된다.
		 * */
		char ch = id.charAt(7);
		/*
		 * id 의 체계
		 * 1,3 번 남자
		 * 2,4 번 여자
		 * 5번 외국인
		 * */
		switch (ch) {
		case '1': case '3': msg = "남성" ;
			break;
			
		case '2': case '4': msg = "여성" ;
			break;
			
		case '5': msg = "외국인" ;
			break;
		default: 
			System.out.println("주민번호를 잘못 입력하셨습니다.");
			System.out.println("다시 입력 : ");
			String id1 = scanner.next();
			ch = id1.charAt(7);
	
		}
		System.out.println("입력하신 주민번호는 " + msg + " 입니다.");
	}
}
