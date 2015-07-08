package variable;
/*
 * @ Date : 2015.07.07
 * @ Author : KEC
 * @ Story : 데이터 타입에 대한 문법
 * */
import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
	// 선언부, 초기화 영역
		Scanner scanner = new Scanner(System.in);
	// int kor=0, eng=0, math=0, total=0 ; // 디폴트 값 선언 : 지역변수 초기화
	// int kor, eng, math, total;  // 인스턴스 변수 선언법 
		
	// 연산부, 프로세싱
		System.out.println("국어 점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = scanner.nextInt();
		
		int total = kor + eng + math;	// total 지역변수를 연산식으로 초기화 함
	//결과값 리턴
		System.out.println("총점 : "+ total);
		double avg = (double)total / 3;
		System.out.println("평균 : " + avg);
	} 
}
