package condition;

import java.util.Scanner;

public class CalcAvg {
	public void calcavg(){
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
