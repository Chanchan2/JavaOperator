package thread;
// getInstance();
public class Singletone  {
	private static Singletone singletone = new Singletone();

	private Singletone() {	// 싱글톤에서는 생성자를 private 으로 은닉화 시킨다.
		System.out.println("인스턴스 생성");
	}
	
	public static Singletone getInstance(){
		return singletone;
	}
	

	
}
