package Operator;

import java.util.Scanner;
/*
 * @ Date : 2015.07.08
 * @ Author : KEC
 * @ Story : 계산기
 * */
public class Calculator {
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너로 두 값을 입력받아서 사칙연산 결과가 나오도록 하시오.
		 * 20 + 7 = 27
		 * 20 * 7 = 140
		 * */
		// 연산에 쓸 재료들을 준비하는 선언부
		Scanner scanner = new Scanner(System.in);
		int x=0, y=0; // 지역변수는 디폴트값으로 초기화
	
		System.out.println("두 개의 정수 입력 : ");
		x = scanner.nextInt(); // next 커서 다음 문자를 변수에 할당하라.
		y = scanner.nextInt();
		
		System.out.println(x + "+" + y + "=" + (x+y));
		System.out.println(x + "-" + y + "=" + (x-y));
		System.out.println(x + "*" + y + "=" + (x*y));
		System.out.println(x + "/" + y + "=" + (x/y));
		System.out.println(x + "%" + y + "=" + (x%y));
		
		
	}
}
