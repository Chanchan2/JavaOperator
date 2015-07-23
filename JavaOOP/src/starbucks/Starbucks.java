package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성자();
		 * */
		Scanner scanner = new Scanner(System.in);
		Recipe coffee = new Coffee();
		Recipe tea = new Tea();
	
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("설탕 첨가 선택 \n"
				+ "설탕 첨가 [1] , 설탕 무첨가 [2]");
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("티 종류 선택 \n"
				+ "레몬[1] , 자몽[2]");
		tea.select(scanner.nextInt());
		tea.serve();
	}
}
