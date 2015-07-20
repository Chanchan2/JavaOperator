package inheritance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Iphone iphone = new Iphone();
		/*
		 [콘솔 출력문]
		 아이폰을 사용해서
		 폰을 가지고 다닐 수 있음
		 홍길동에게 전화를 검
		 홍길동에게 데이터를 전달
		 * */
		// 아이폰이 출력되게 하려면
		// 클래스변수(=스태틱변수)는
		// 클래스이름.BRAND 로 가져오면 됩니다.
		// 클래스명.필드명... get/set 없이 사용하는 이유는 은닉화(암호화)가 필요없는 고정된 값이기 때문에
		// iphone.BRAND 식으로 이용해야 한다.
		iphone.setCompany(iphone.BRAND);
		iphone.setPortable(iphone.TRUE);	// 무조건 애플은 이동식 전화만 만든다.
		System.out.println("메세지 보낼 상대 입력 : ");
		String name = scanner.next();
		iphone.setCall(name);
		System.out.println("보내는 메세지 입력 : ");
		iphone.setData(name, scanner.next());
		System.out.println(iphone.getCompany() + "을 사용해서");
		System.out.println(iphone.getMove());
		System.out.println(iphone.getCall());
		System.out.println(iphone.getData());
	
		
		
	}
}
