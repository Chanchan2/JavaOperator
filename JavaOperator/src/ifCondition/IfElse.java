package ifCondition;

public class IfElse {
	public static void main(String[] args) {
		int x = 1, y = 2;	// 지변 초기화
		if ((x == 1) && (y == 1)) {	// && sms 엔퍼센트, and 연산자
			System.out.println("x 는 1 이면서 y 도 2 이다.");
		}else if ((x == 3) || (y == 3)) {	// || 는 column , or 연산자
			System.out.println("x 는 1 이거나 y 는 2 이다.");
		}else{
			System.out.println("해당 사항이 없습니다.");
		}
	}
}
