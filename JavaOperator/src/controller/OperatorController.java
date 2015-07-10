package controller;
import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.Switchavg;


public class OperatorController {
	public static void main(String[] args) {
		//2015.07.09 성적계산기
		CalcAvg avg = new CalcAvg();
		// avg.calcavg();
		
		//2015.07.09 심플계산기(사칙연산 계산기)
		ArithmeticCalc calc = new ArithmeticCalc();
		// calc.calc();
		
		//2015.07.10 스위치 성적계산기
		Switchavg avg2 = new Switchavg();
		//avg2.calc();
		
		//2015.07.10 스위치 성적계산기
		ManOrWoman manOrWoman = new ManOrWoman();
		manOrWoman.ssn();	// ssn()은 원 클래스의 메소드 이름이다.
	}
}
