package abstraction;
/*
 * @ Date : 2015.07.17
 * @ Author : KEC
 * @ Story : 인터페이스를 통한 추상화 구현
 * */
public interface Account {
	/*
	 추상메소드 (Abstract method) : {} Body가 없는 메소드
	 구상메소드 (Concrete method) : {} Body를 갖는 메소드
	 
	 그럼 추상메소드를 왜 만드는가 ? 
	 액션으로 이루어진 개념들은 개발자에 따라, 혹은 해석하는 사람에 따라 달라지므로
	 아웃라인(매소드이름, 파라미터 타입, 갯수)을 정해서 인터페이스에 있는 기능은 
	 반드시 구현하라는 암묵의 지시사항 => 프로그래머에 제약을 준다.
	 * */
	
	public void withdraw(int money);
	public void deposit(int money);
}
