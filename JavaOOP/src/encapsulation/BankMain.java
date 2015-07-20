package encapsulation;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 생성자가 가지는 기능
		 1. 개체를 만드는 기능
		 2. setter 기능
		 3. 개체가 만들어지는데 필수적인 요소가 주어지지 않으면 생성을 막는 기능 ==> 제약, 방어코딩
		 * */
		System.out.println("통장주 이름 : ");
		String name = scanner.next();
		BankBook bankBook = new BankBook(name);
		System.out.println("입금 : ");
		bankBook.deposit(scanner.nextInt());
		System.out.println("출금 : ");
		bankBook.withdraw(scanner.nextInt());
		System.out.println("입금 : ");
		bankBook.deposit(scanner.nextInt());

		System.out.println(bankBook.toString());
	}
}
