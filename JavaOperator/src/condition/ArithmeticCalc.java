package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : KEC
 * @ Story : 사칙 연산 계산 프로그램
 * 
 * */
public class ArithmeticCalc {
	/*
	 오더
	 사칙연산 계산기
	 덧셈, 뺄셈, 곱셈, 나눗셈(몫 : (), 나머지 : ())
	 사칙연산 기호도 입력. +, *, -, /
	 출력결과
	 === 심플 계산기 ===
	- 5 X 5 = 25
	- 5 + 5 = 10
	- 6 ÷ 5 = 1 ... 1
	- 5 - 6 = -1
	 * */
	public static void calc() {
		// 선언부
		Scanner scanner = new Scanner(System.in);
		int num1=0, num2=0, result=0, remain=0, escape=0;
		String oper1="", oper2="";
		
		System.out.println("연산 할 숫자를 입력해 주세요");
		num1 = scanner.nextInt();
		System.out.println("연산 할 기호를 입력해 주세요");
		oper1 = scanner.next();
		System.out.println("연산 할 숫자를 입력해 주세요");
		num2 = scanner.nextInt();
		
		//연산부
		while(escape==0)
		if(oper1.equals("+")){
			result = num1 + num2;
			oper2 = "+";
			escape = 1;
		}else if(oper1.equals("-")){
			result = num1 - num2;
			oper2 = "-";
			escape = 1;
		}else if(oper1.equals("*")){
			result = num1 * num2;
			oper2 = "X";
			escape = 1;
		}else if (oper1.equals("/")){
			result = num1 / num2;
			remain = num1 % num2;
			oper2 = "÷";
			escape = 1;
		}else{
			System.out.println("입력된 값이 올바르지 않습니다.");
			System.out.println("연산기호 다시 입력");
			oper1 = scanner.next();
		}
		
		System.out.println("=== 심플 계산기 ===");
		if(oper1.equals("/")){
			if(remain != 0){
				System.out.println(num1 + " " + oper2 + " " + num2 + " = " + result + " ... " + remain);
			
			}else{
				System.out.println(num1 + " " + oper2 + " " + num2 + " = " + result);
			}
		}else{
			System.out.println(num1 + " " + oper2 + " " + num2 + " = " + result);
		}
		
	}

}

