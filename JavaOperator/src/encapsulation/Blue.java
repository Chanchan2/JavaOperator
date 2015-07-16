package encapsulation;

public class Blue {
	/*===== Field =====*/
	// 주사위 2개 값의 합
	private int diceSum;	// 인스턴스 변수는 초기화 하지 않는다.
	
	/*===== Constructor =====*/
	// 생성자 파라미터 2개(주사위)
	public Blue(Dice num1, Dice num2) {
		this.diceSum = num1.getDice1() + num2.getDice1();
	}
	
	
	/*===== MemberMethod =====*/

	@Override
	public String toString() {
		
		return "두 주사위의 합이 " + this.diceSum + "이니 " + this.diceSum + "칸 전진";
	}
}
