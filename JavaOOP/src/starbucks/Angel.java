package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AngelCoffee kim = new AngelCoffee();
		/*System.out.println("설탕 첨가 선택 \n"
				+ "설탕 첨가 [1] , 설탕 무첨가 [2]");
		kim.prepare(scanner.nextInt());*/
		
		AngelTea lee = new AngelTea();
		System.out.println("티 종류 선택 \n"
				+ "레몬[1] , 자몽[2]");
		lee.prepare(scanner.nextInt());
		
	}
}
