package abstraction;

public class ShieldRobot extends BasicBot{
	/*=== Field ===*/
	private int sheildPoint;
	
	/*=== Constructor ===*/
	
	/*=== MemberMethod ===*/
	public void robotInfo(String name, int energy, int speed, int sheildPoint){
		super.name(name);
		super.charge(energy);
		super.run(speed);
		this.sheildPoint = sheildPoint;
	}
	
	@Override
	public void status() {
		super.status();
		System.out.println(", 방어력은 " + this.sheildPoint);
	}
}
