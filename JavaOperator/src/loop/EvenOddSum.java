package loop;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : KEC
 * @ Story : for-loop + if 결합예제
 * */
public class EvenOddSum {
/*
 * 입력받은 수(1)부터 입력받은 수(10)까지의 수 중에서 각각 짝수의 합과 홀수의 합을 분리하여 출력하시오.
 * */
	
	public void calc() {
		// 지변 초기화
		Scanner scanner = new Scanner(System.in);
		int i=0, a=0, b=0, evenSum=0, oddSum=0;
		System.out.println("덧셈을 시작할 정수 입력 : ");
		a = scanner.nextInt();
		System.out.println("덧셈을 마칠 정수 입력 : ");
		b = scanner.nextInt();
		
		// 연산부
		for(i=a ; i<=b; i++){	// a 와 b 상수 // i 인덱스 변수
			if((i%2)==0){
				evenSum+=i;
			}else{
				oddSum+=i;
			}
		}
		
		// 출력부
		System.out.println(a +" 부터 " + b + " 까지의 정수 중에서 \n" + "짝수의 합은 " + evenSum + " 이고 \n"
							 + "홀수의 합은 " + oddSum + "이다.");
	}
}
