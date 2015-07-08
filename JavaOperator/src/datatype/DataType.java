package datatype;
/*
 * @ Date : 2015.07.07
 * @ Author : KEC
 * @ Story : 데이터 타입에 대한 문법
 * */
public class DataType { // 낙타표기법 (카멜 표기법)
/*
데이터 타입이란 ?
- 메모리를 생성하기 위한 도구
- 메모리의 크기와 메모리의 형태를 저장하기 위한 도구
- 메모리를 얻고 사용하는 방법
- 데이터 타입을 설정
- 데이터 타입에 맞는 변수 선언
- 변수에 값 할당
 * */
	public static void main(String[] args) {
		// 데이터 타입 + 변수 형태
		byte bt; // 정수형 8bits
		short sh; // 정수형 16bits
		long lo; // 정수형 64bits
		int a; // int 는 정수형 숫자 32bits **
		float f; // float 는 실수형 숫자
		double d; // double 은 실수형 숫자 (무한대 개념) **
		char c; // char 는 알파벳
		boolean b; // 참이냐 거짓이냐를 나타낼때
		
		int a2;
		a2 = 5; // 인트형 변수 a2 에 숫자 5를 할당한다.
		int a3 = 5;
		System.out.println(a3);
		
	}
}
