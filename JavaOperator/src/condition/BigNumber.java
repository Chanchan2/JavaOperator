package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : KEC
 * @ Story : if-else 예제(큰 수 구하기)
 * */
public class BigNumber {
	public static void main(String[] args) {
		/*
		 문제 ) 학생 3명의 (이름과) 점수를 입력받아서 1등 출력 (0점 ~ 100점)
		 결과 ) 1등은 (홍길동이며,) 98점입니다.
		 힌트 ) a 와 b 비교, b 와 c 를 비교, a 와 c 를 비교
			
		 * */
		Scanner scanner = new Scanner(System.in);
		int sco1=0, sco2=0, sco3=0;
		String stu1="", stu2="", stu3="";
		
		System.out.println("이름을 입력하세요. ");
		stu1 = scanner.next();
		System.out.println("점수를 입력하세요. ");
		sco1 = scanner.nextInt();
		System.out.println("이름을 입력하세요. ");
		stu2 = scanner.next();
		System.out.println("점수를 입력하세요. ");
		sco2 = scanner.nextInt();
		System.out.println("이름을 입력하세요. ");
		stu3 = scanner.next();
		System.out.println("점수를 입력하세요. ");
		sco3 = scanner.nextInt();
	
		 //조건식을 따져서 결과를 가정하지 말고, 결과를 상상한 다음 거기에 맞는 조선식을 설정
		if(sco1>sco2 && sco1>sco3){
			System.out.println("1등은 "+stu1+"이며 "+sco1+"점 입니다.");
		}else if(sco2>sco1 && sco2>sco3){
			System.out.println("1등은 "+stu2+"이며 "+sco2+"점 입니다.");
		}else if(sco3>sco1 && sco3>sco2){
			System.out.println("1등은 "+stu3+"이며 "+sco3+"점 입니다.");
		}else{
			System.out.println("동점자가 존재합니다.");
		}
		
	}
}
