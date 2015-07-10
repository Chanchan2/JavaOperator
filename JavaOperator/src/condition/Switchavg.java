package condition;
/*
 * @ Date : 2015.07.10
 * @ Author : KEC
 * @ Story : Switch 예제(합격여부 구하기)
 * */
import java.util.Scanner;

public class Switchavg {
	public void calc() {
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
		
		// 아래부분을 switch-case로 전환
		avg/=10;
		switch (avg) {
		case 10:
		case  9: pass="장학생";
		break;
		case  8:
		case  7:pass="합격";
		break;
		default:pass="불합격";
		break;
		}
		
		//출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------");
		System.out.println("("+name+")\t("+kor+")\t("+eng+")\t("+math+
				")\t("+total+")\t("+avg+")\t("+pass+")");
	}
	public static void main(String[] args) {
		Switchavg calc = new Switchavg();
		calc.calc();
	}
}
