package encapsulation;

public class BlueMain {
	public static void main(String[] args) {
		Dice num1 = new Dice();
		Dice num2 = new Dice();
		Blue blue = new Blue(num1, num2);
		//클래스이름 객체이름 = new 생성자() ==> 인스턴스 생성 공식
		System.out.println(blue.toString());
		
	}
}
