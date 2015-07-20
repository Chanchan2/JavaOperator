package encapsulation;

public class Dice {
	/*===== Field =====*/
	private int num;
	
	/*===== Constructor =====*/
	// 생성자 단축키는 CTRL + SPACE
	public Dice(){
		this.num = (int) ((Math.random()*6)+1);
	}
	
	/*===== MemberMethod =====*/
	public int getDice1() {
		return this.num;
	}

}
