package starbucks;

public class Tea implements Recipe {
	private String tea;

	@Override
	public void boilWater() {
		System.out.println("1. 물을 끓인다.");
		
	}

	@Override
	public void brew() {
		System.out.println("2. 티백을 내린다.");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("3. 물을 컵에 붓는다.");
		
	}

	@Override
	public void select(int option) {
		switch (option) {
		case 1:
			this.tea = "레몬티";
			break;
			
		case 2:
			this.tea = "자몽티";
			break;
			
		default:
			this.tea = "선택오류";
			break;
		}
		
	}

	@Override
	public void serve() {
		System.out.println("고객님 " + this.tea + " 가 나왔습니다.");
		
	}

	
}
