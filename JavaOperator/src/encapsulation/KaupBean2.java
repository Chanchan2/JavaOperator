package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.14
 * @ Author : KEC
 * @ Story :카우푸지수 프로그램을 객체화 하는 예제
 * */
public class KaupBean2 {
	/*
	public 은 은닉화가 되어있지 않은 상태임 은닉화를 하려면 private을 넣어야 함
	그런데 데이터 값은 private을 넣어야(은닉화)하고 기능-메소드는 public을 넣어야 한다.
	 * */
	/*
	 자바의 게층 구조
	 프로젝트(어플리케이션) > 패키지 > 클래스 > 멤버
	 멤버는 딱 두가지로 구성되어 있다. 
	 -> private으로 선언된 (감춰진) 속성 : 멤버필드
	 -> public으로 선언된 (오픈된) 기능 : 멤버메소드
	 * */
	private String name, msg;
	private double height, weight;
	private int idx;
	
	public void getIndex() { // 메소드(동사)

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
