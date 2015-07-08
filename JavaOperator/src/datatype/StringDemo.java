package datatype;
/*
 * @ Date : 2015.07.07
 * @ Author : KEC
 * @ Story : String 타입 문법
 * */
public class StringDemo {
	public static void main(String[] args) {
		char c = 'c'; 
		// 맨 끝에 있는 ;을 구분자라 부른다.
		// char 데이터 타입의 c 변수에 알파벳 c 값을 할당함.
		System.out.println(c);
		String s = "abc";
		System.out.println(s);
		System.out.println("abc");
		// 알파벳 하나만 출력할 경우는 char타입을 사용
		// 하나 이상 복수의 문자열을 출력할 때에는 String 타입 사용
		// 주의할점은 싱클 쿼터와 더블 쿼터에 유의
	}
}
