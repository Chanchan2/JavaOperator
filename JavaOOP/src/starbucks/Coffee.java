package starbucks;

public class Coffee implements Recipe{
	private String coffee;
	
	@Override
	public void boilWater() {
		System.out.println("1. 물을 끓인다.");
		
	}

	@Override
	public void brew() {
		System.out.println("2. 커피를 내린다.");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("3. 물을 컵에 붓는다.");
		
	}

	@Override
	public void select(int option) {
		switch (option) {
		case 1:
			this.coffee = "밀크커피";
			break;
			
		case 2:
			this.coffee = "블랙커피";
			break;
			
		default:
			this.coffee = "선택오류";
			break;
		}
		
	}

	@Override
	public void serve() {
		System.out.println("고객님 " + this.coffee + "가 나왔습니다.");
		
	}

}
