package controller;
/*
 * @ Date : 2015.07.09
 * @ Author : KEC
 * @ Story : method controller
 * */
import ifCondition.ArithmeticCalc;

import ifCondition.CalcAvg;

public class OperatorController {
	public static void main(String[] args) {
		//2015.07.09 성적계산기
		CalcAvg avg = new CalcAvg();
		avg.calcavg();
		
		//2015.07.09 심플계산기(사칙연산 계산기)
		ArithmeticCalc calc = new ArithmeticCalc();
		calc.calc();
		
	}
}
