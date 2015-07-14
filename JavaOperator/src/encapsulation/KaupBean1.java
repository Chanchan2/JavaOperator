package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.14
 * @ Author : KEC
 * @ Story :카우푸지수 프로그램을 객체화 하는 예제
 * */
public class KaupBean1 {
	
	public void getIndex() { // 메소드(동사)
		/*
		[오더]
		카우푸지수는 키와 몸무게를 입력하면 저체중...정상...비만 이런식의 결과값을
		알려주는 프로그램.
		콘솔에 출력되는 문장은 
		"[홍길동]님의 키: 180cm, 몸무게 : 70kg, 카우푸지수 : 정상"
		카우프 공식 : (몸무게 / (키 * 키)) * 10000 결과 값이
		30 초과 비만
		24 초과 30 이하과체중
		20 초과 24 이하 정상
		15 초과 20 이하 저체중
		13 초과 15 이하 마름
		13 이하 영양실조
		 * */
		// 선언부
		Scanner scanner = new Scanner(System.in);
		double height=0.0d, weight=0.0d;
		String name="", msg="";
		int idx = 0; // 카우푸 인덱스
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("키 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게 : ");
		weight = scanner.nextDouble();
		
		// 연산부
		idx = (int) ((weight / (height * height)) * 10000);	
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else {
			msg = "영양실조";
		}

		// 출력부
		System.out.println("["+name+"]님의 키: "+height+"cm, 몸무게 : "+weight+"kg,"
				+ " 카우푸지수 : "+msg);
	}
}
