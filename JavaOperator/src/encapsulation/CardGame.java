package encapsulation;
/*
 버전업
 현재는 홍길동 승 이라고 나오는데
 개선을 요구.
 =========
 홍길동 : 6
 김유신 : 7
 김유신 승
 =========
 * */
public class CardGame {
	/* ===== Field ====== */
	// 생성자 단축키 : CTRL + SPACE
	private String winner = "", loser = ""; // 멤변선언
	private int winnerScore = 0, loserScore = 0;
	// 지역변수(로컬변수)는 메모리 영역중에서 (콜)스택에 저장
	// 인스턴스변수는 메모리 영역중에서 힙에 저장
	
	/*===== Constructor =====*/
	public CardGame() {}	// 디폴트 생성자
	
	public CardGame(CardBean bean1, CardBean bean2) {
	// getter 에서 문제해결 패턴
	// 제일 먼저 리턴타입을 카피

		if (bean1.getCard1() > bean2.getCard1()) {
			this.winner = bean1.getName1();
			this.loser = bean2.getName1();
			this.winnerScore = bean1.getCard1();
			this.loserScore = bean2.getCard1();
		}else if(bean2.getCard1() > bean2.getCard1()){
			this.winner = bean2.getName1();
			this.loser = bean1.getName1();
			this.winnerScore = bean2.getCard1();
			this.loserScore = bean2.getCard1();
		}else{
			this.winner = "비김";
		}
	}
	
	/*=====멤버메소드=====*/
	public String toString() {
	
		return "========= \n" + this.winner + " : " + this.winnerScore + "\n"
		+ this.loser + " : " + this.loserScore + "\n"
		+ this.winner + " 승 \n"
		+"========= \n";
	}
}
