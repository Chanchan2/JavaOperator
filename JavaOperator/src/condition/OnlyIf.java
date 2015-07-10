package condition;
/*
 * @ Date : 2015.07.08
 * @ Author : KEC
 * @ Story : if만 있는 구문에 관한 문법
 * */
public class OnlyIf {
	public static void main(String[] args) {
		int x = 1, y = 2;	// 지변 초기화
		if ((x == 1) && (y == 1)) {	// && sms 엔퍼센트, and 연산자
			System.out.println("x 는 1 이면서 y 도 2 이다.");
		}
		if ((x == 1) || (y == 1)) {	// || 는 column , or 연산자
			System.out.println("x 는 1 이거나 y 는 2 이다.");
			
		}
	}
}
