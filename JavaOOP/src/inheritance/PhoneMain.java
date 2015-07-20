package inheritance;

import java.util.Scanner;
public class PhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone phone = new Phone();
	// 클래스이름 인스턴스(객체) = new 생성자;
	// 인스턴스를 생성하는 이유는 ? 메소드 호출
		phone.setCompany("삼성 가정용 전화기");
		System.out.println("전화 걸 사람 : ");
		phone.setCall(scanner.next());
		System.out.println(phone.getCompany()+" 을 사용해서");
		System.out.println(phone.getCall());

		
	}
}
