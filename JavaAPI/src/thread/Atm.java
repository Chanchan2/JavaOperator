package thread;

public class Atm {
	public synchronized void inchul(String name){
		System.out.println(name + "이(가) 인출 요청함");
		for (int i = 0; i < 100000000; i++) {
			if (i==1000) {
				System.out.println(name + "이(가) 인출 중 ...");
			}
		}
		System.out.println(name + "이(가) 인출해 나감");
	}
}
