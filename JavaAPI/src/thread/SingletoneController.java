package thread;

public class SingletoneController {
	public static void main(String[] args) {
		Singletone singletone = Singletone.getInstance();
		Singletone singletone2 = Singletone.getInstance();
		Sample sample = new Sample();
		Sample sample2 = new Sample();
		if (singletone == singletone2) {
			System.out.println("싱글톤 같다.");
		} else {
			System.out.println("싱글톤 다르다.");
		}
		
		if (sample == sample2) {
			System.out.println("샘플 객체 같다.");
		} else {
			System.out.println("샘플 객체 다르다");
		}
	}
}
