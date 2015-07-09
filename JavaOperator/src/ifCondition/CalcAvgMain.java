package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : KEC
 * @ Story : if-else 예제
 * 		프로그램을 하나 개발해야 한다. 오더는
 * 	학생		국어		영어		수학		총점		평균		합격여부
 * --------------------------------------------------------
 * (홍길동)	(90)	(90)	(90)	(270)	(90)	(장학생)
 * 
 * 평균이 90점 이상이면 장학생, 70점 이상 - 90점 미만이면 합격
 * 평균이 70점 미만이면 불합격
 * */
public class CalcAvgMain {
	public static void main(String[] args) {
		//선언부
		Scanner scanner = new Scanner(System.in);
		int	kor=0, eng=0, math=0, total=0;
		int avg=0;
		String name="", pass="";	// 지역변수에 대한 초기화는 필수 !!
		
		//연산부
		System.out.println("이름을 입력하세요. ");
		name =scanner.next();
		System.out.println("국어 성적 : ");
		kor = scanner.nextInt();
		System.out.println("영어 성적 : ");
		eng = scanner.nextInt();
		System.out.println("수학 성적 : ");
		math = scanner.nextInt();
		total = kor + eng + math;
		avg =  total / 3;
		
		if (avg>=90) {
			pass = "장학생";
		} else if((avg>=70) && (avg<90)){
			pass = "합격";
		} else{
			pass = "불합격";
		}
			
		//출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------");
		System.out.println("("+name+")\t("+kor+")\t("+eng+")\t("+math+
				")\t("+total+")\t("+avg+")\t("+pass+")");
		
	}
}
