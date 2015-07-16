package encapsulation;
/*
 은행계좌
 
 * */
public class Account {
	private int accnum, money, pass;
	private String name;
	public Account() {
		this.accnum = (int)(Math.random()*100000);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
}
