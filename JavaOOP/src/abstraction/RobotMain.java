package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobot
		 
		 출력
		 건로봇은 속도는 10, 에너지는 10, 공격력은 50
		 - 공격력은 인스턴스 변수로 int attackPoint
		 쉴드로봇은 속도는 20, 에너지는 20, 방어력은 50
		 - 방어력은 인스턴스 변수로 int SheildPoint
		 * */
		GunRobot gunRobot = new GunRobot();
		ShieldRobot shieldRobot = new ShieldRobot();
		
		gunRobot.roboInfo("건로봇", 10, 10, 50);
		shieldRobot.robotInfo("쉴드로봇", 20, 20, 50);
		
		Robot[] robot = new Robot[2];
		robot[0] = gunRobot;
		robot[1] = shieldRobot;
		
		for(Robot robot1 : robot){
			robot1.status();
		}
	}
}
