package member;

import java.util.Scanner;

public class MemberServiceController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		Scanner scanner = new Scanner(System.in);
		String input = "", key = "";
		
		while (true) {
			System.out.println("회원가입[join], 로그인[login], 로그아웃[logout] 입력. ");
			input = scanner.next();
			if (input.equalsIgnoreCase("logout")) {
				System.out.println("로그아웃, 시스템 종료");
				break;
			} else {
				switch (input) {
				case "join":	// 메소드 리팩토링 단축키 ALT + SHIFT + M
					join(service, scanner);
					break;
					
				case "login":
					System.out.println("ID 입력 : ");
					String id2 = scanner.next();
					System.out.println("비밀번호 입력 : ");
					String password2 = scanner.next();
					String result = service.login(id2, password2);
					System.out.println(result);
					String flag = result.substring(0,5);
					if(flag.equals("환영합니다")){
						break;
					} else if (flag.equals("비번이 다")){
						continue;	// 조건이 맞지 않으면 계속 루프를 돌아라
					}else {
						continue;
					}

				default:
					System.out.println("에러발생");
					break;
				}
			}
		}
	}

	private static void join(MemberService service, Scanner scanner) {
		System.out.println("ID 입력 : ");
		String id = scanner.next();
		System.out.println("비밀번호 입력 : ");
		String password = scanner.next();
		System.out.println("이름 입력 : ");
		String name = scanner.next();
		System.out.println("나이 입력 : ");
		int age = scanner.nextInt();
		System.out.println("주소 입력 : ");
		String address = scanner.next();
		Member member = new Member(id, password, name, age, address);
		service.join(member);
	}
}
