package abstraction;

public class GunRobot extends BasicBot {
	private int attackPoint;
	
	public void roboInfo(String name, int energy, int speed, int attackPoint){
		super.name(name);
		super.charge(energy);
		super.run(speed);
		this.attackPoint = attackPoint;
	}
	
	public void attackPoint(int attackPoint){
		this.attackPoint = attackPoint;
	}
	
	@Override
	public void status() {
		super.status();
		System.out.println(", 공격력은 " + this.attackPoint);
	}
}
