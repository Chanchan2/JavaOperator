package encapsulation;
/*
 객체지향 프로그래밍에서 클래스는 현실세계를 그대로 카피하려고 한다.
 그 대상이 구체적 물질이던 개념적 추상이던 그대로 재현하려고 해야 한다.
 통장을 이루는 요소를 생각해보자.
 그 요소가 결국은 인스턴스 변수를 구성하게 된다.
 
 1.은행이름 => 아이티뱅크 	bank
 2.통장번호 => 5자리 랜덤숫자	bankbookNo
 3.소유자 이름 => 생성자에 스캐너로 입력받는 값	name
 4.날짜 / 예금 / 출금 / 잔액 => 돈 => 스캐너로 입력받는 값 숫자타입 int => money
 5.비밀번호 => 스캐너로 입력받는 값. 숫자타입 => pass
 [출력]
 ===============
 [아이티뱅크]
 계좌번호 : 12345
 이름 : 홍길동
 잔액 : 1000원
 ===============
 * */
public class BankBook {
	private String bank, name;
	private int bankbookNo, money, pass;
	
	public BankBook(Account account) {
		this.bank = "[아이티뱅크]";
		this.name = account.getName();
		this.money = account.getMoney();
	}

	
	
	
	@Override
	public String toString() {
	
		return  "=============== \n"
				+ " [아이티뱅크]"
				+ " 계좌번호 : 12345 \n"
				+ "이름 : 홍길동 \n"
				+ "잔액 : 1000원 \n"
				+ "===============";
	}
}
