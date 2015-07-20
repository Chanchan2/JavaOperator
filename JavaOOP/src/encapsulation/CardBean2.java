package encapsulation;

public class CardBean2 {
	private String name1, name2;
	private int card1, card2;
	
	public void setName1(String name1) {
		// ()안의 값을 파라미터라 하고 소속은 지변
		this.name1 = name1;
		// this.name1 은 인스턴스 변수(멤변)이고
		// = name1 은 파라미터로 넘어온 지변(스캐너가 받은값 )
		// 스캐너가 받아 논 값을 가진 지변 값을 멤변 name1에 할당하라. 
		// 파라미터값과 멤변값의 이름은 달라도 상관없다.		단, 데이터타입(String, int)은 반드시 일치해야 한다.
	}
	
	public String getName1() {
		return name1;
	}
	
	public void setName2(String name2) {
		this.name2 = name2;
	}
	
	public String getName2() {
		return name2;
	}
	
	public void setCard1(int card1) {
		this.card1 = card1;
	}
	
	public int getCard1() {
		return card1;
	}
	
	public void setCard2(int card2) {
		this.card2 = card2;
	}
	
	public int getCard2() {
		return card2;
	}
	
	public String getWinner() {
		// getter 에서 문제해결 패턴
		// 제일 먼저 리턴타입을 카피
		String winner = "";
		if (this.card1 > this.card2) {
			winner = name1 + "승";
		}else if(this.card2 > this.card1){
			winner = name2 + "승";
		}else
			winner = "무승부";
		return winner;
	}

	
	@Override
	public String toString() {
		
		return "[" + name1 + " : " + card1 +"] vs [" + name2 +" : "+ card2 + "]"
				+ "\n" + this.getWinner();
	}

}
