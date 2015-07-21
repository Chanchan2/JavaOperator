package abstraction;

public class BasicBot implements Robot {
	private int energy;
	private int speed;
	private String name;
	
	public void name(String name){
		this.name = name;
	}
	@Override
	public void charge(int energy) {
		this.energy = energy;
		
	}

	@Override
	public void run(int speed) {
		this.speed = speed;
		
	}

	@Override
	public void status() {
		// System.out.println("로봇명 : " + this.name);
		// System.out.println("로봇 에너지 : " + this.energy);
		// System.out.println("로봇 속도 : " + this.speed);
		System.out.print(this.name + "은 속도는 " + speed + ", 에너지는 "
		+ energy );
	}

}
