package bank;

public class Bank implements BankRole{
	//필드
	// 은행은 통장을 여러개를 관리한다. 따라서 필드에 인스턴스변수 하나를 지정하지 않고
	// 여려개를 담을 수 있는 배열을 지정한다.
	// 아래 배열은 은행에서보면 계좌를 관리하는 DB
	private BankBook[] bankBookList;
	private int count;	// 은행에서 관리하는 통장 갯수
	
	//생성자
	// 배열, 자료구조(컬렉션) 를 보유하는 객체를 만들고자 할 때는
	// 그 객체의 생성자에 배열, 자료구조의 객체생성해준다.
	public Bank(int count) {
		bankBookList = new BankBook[count];
	}
	
	//멤버메소드
	/* getter/setter */
	
	public BankBook[] getBankBookList() {
		return bankBookList;
	}
	public int getCount() {
		return count;
	}
	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	// 계좌개설
	/*
	 계좌번호, 계좌주, 비밀번호, 잔액 만 입력하면 통장을 만들어 준다.
	 * */
	@Override
	public void openAccount(String ownerName, int password, int restMoney) {
		BankBook bankBook = new BankBook(ownerName);
		bankBook.setPass(password);
		bankBook.deposit(restMoney); 
		// 통장을 개설하자마자 은행전산 DB에 통장정보 저장 개념
		bankBookList[count] = (BankBook) bankBook;
		this.count++;	// 전체 은행에 개설된 통장 갯수 1 증가
		System.out.println();
	}
	
	// 계좌검색 (계좌번호) -> 리턴결과 : 계좌 1개
	@Override
	public BankBook searchAccountByAccountNo(String accountNo) {
		BankBook account = null;
		// String  -> int
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			/*
			 문자타입(String) 서로 같은지 여부 .equals()
			 숫자타입(int) 서로 같은지 여부 ==
			 * */
			if (bankBookList[i].getBankbookNo() == searchAccountNo) {
				account = bankBookList[i];
			}
		}
		return account;
	}
	// 계좌검색 (이름) -> 리턴결과 : 계좌 여러개
	@Override
	public BankBook[] searchAccountByName(String ownerName) {
		// searchAccountByName() 이 메소드를 호출하면 자동으로 
		// searchCountByName()을 먼저 호출하라
		int tempcount = this.SearchCountByName(ownerName);
		if (tempcount == 0) {	// 조회하는 사람의 통장이 하나도 없다면
			return null;
			
		}
		// 위처럼 필터링을 하는 이유는 본 알고리즘을 하기전에 필요없는 상태라면
		// 알고리즘을 호출하기 않기 위해서이다.  그렇지 않으면 자원(Resource : Memory, DB)
		BankBook[] accounts = new BankBook[tempcount];
		tempcount=0;	// 0으로 초기화 시켜서 배열의 인덱스로 사용해야 함
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getName().equals(ownerName)) {
				accounts[tempcount] = bankBookList[i];
				tempcount ++;
			}
		}
		return accounts;
	}
	
	// 계좌검색(이름) -> 리턴결과 : 숫자
	@Override
	public int SearchCountByName(String name) {
	/*
	 for 문을 돌면서 파라미터로 받은 이름과 동일한 통장(계좌)이 있다면 count를 0에서 1씩 증가시켜라.
	 * */
		int count = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {
				count++;
			}
		}
		return count;
	}
	// 계좌해지 -> 리턴결과 : true or false
	@Override
	public boolean closeAccount(String accountNo) {
		// flag는 삭제가 성공적으로 이루어지면 true를 리턴하고 삭제할게 없으면
		// false를 리턴
		boolean closeOk = false;
		// String(문자열)으로 들어온 값을 숫자로 바꿔서 비교
		BankBook bankBook = this.searchAccountByAccountNo(accountNo);
		// 필터링에서는 if-else 구문을 사용하지 않고 if 문을 사용한다.
		if (bankBook == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return closeOk;
		}
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo() == searchAccountNo) {
				
		/*
		 j=0로 바꾼 이유는 홍길돌의 계좌가 은행 전체 계좌의 50번째라면..
		 내부 for 문에서 다시 처음 0부터 회전하지 않고 홍길동의 계좌가 있는 인덱스
		 번호부터 뒤에 있는 계좌번호를 덮어쓰는 방식으로 진행한 후 맨 마지막 인덱스번호를
		 제거하면 은행에서 전체 계좌가 100개가 있는 상황이라면 홍길동이 삭제된 후 전체 계좌수는
		 99개가 될 것이다. 따라서 this.count-1을 해주었음
		 * */
				for (int j = i; j < this.count-1; j++) {
					bankBookList[i] = bankBookList[j+1];
				}
				count --;
				// 위 알고리즘을 거친 후에야 계좌 삭제가 일어났다고 본다.
				closeOk = true;
			}
		}
		
		return closeOk;
	}

}
