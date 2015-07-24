package bank;

public class BankBook{

	/*===== MemberField =====*/
	public static String BANK;
	private int bankbookNo;
	private String name;
	private int money;
	private int pass;
	private String msg;	
	// 유효성 체크결과를 알려주어 고객이 만약 실수로 잘못된 값을 입력하였다면 공지해주는 기능

	public BankBook(String name) {
		this.BANK = "[아이티뱅크]";
		this.bankbookNo = (int) ((Math.random()*99999)+(10000))%(100000);
		this.name = name;
		//this.money = 0;
	}
	// 개발자는 setter를 쓸지 생성자로 끝낼지를 고민해야 한다.
	// getter, setter 단축키 : ALT + SHIFT + S
	
	/*===== MemberMethod =====*/
	
	public String showAccount() {
	
		return  "=============== \n"
				+ BANK + "\n"
				+ " 계좌번호 : " + bankbookNo + "\n"
				+ "이름 : " + name +  "\n"
				+ "잔액 : " + money + " 원 \n"
				+ "===============";
	}
	
	
	public void setPass(int pass) {
		this.pass = pass;
	}

	
	public void withdraw(int money) {
		// 파라미터 값이 정상 값이 아닌 상태를 추정해서 필터링하는 로직이 필요해짐
		// ==> 유효성 체크
		if (money <= 0) {
			msg = "출금액은 0보다 커야 합니다.";
		} else if (this.money < money) {
			msg = "출금액이 잔액보다 큽니다.";
		} else {
			this.money -= money;
		}
	}
	
	public void deposit(int money) {
		if (money <= 0) {
			msg = "입금액은 0보다 커야 합니다.";
		} else {
			this.money += money;
		}
	}

	public int getBankbookNo() {
		return bankbookNo;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public int getPass() {
		return pass;
	}

	public String getMsg() {
		return msg;
	}

	public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
