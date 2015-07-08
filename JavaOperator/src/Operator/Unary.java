package Operator;
/*
 * @ Date : 2015.07.08
 * @ Author : KEC
 * @ Story : 단항 연산자 문법
 * */
public class Unary {
	/*
	 * 단항연산자
	 * i++(후위연산자), 또는 ++i(전위연산자)
	 * */
	public static void main(String[] args) {
		int i=5, j=0, x=5, y=0;	// 지역변수는 디폴트값으로 초기화
		i = i + 1;
		j = i++;
		//후위형은 변수값을 읽어온 후 연산한다.
		System.out.println("j 의 값 :\t"+j);
		
		// 전위형은 x 의 값을  증가시키고 연산한다.
		y = ++x;
		System.out.println("y 의 값 :\t"+y);
	}
}
