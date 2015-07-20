package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		//선언부
		Scanner scanner = new Scanner(System.in);
		double height=0.0d, weight=0.0d;
		String name="", msg="";
		int idx = 0; // 카우푸 인덱스
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("키 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게 : ");
		weight = scanner.nextDouble();
		
		//연산부
		KaupBean4 kaupBean = new KaupBean4();
		kaupBean.setName(name);
		kaupBean.setHeight(height);
		kaupBean.setWeight(weight);
		kaupBean.getIndex();
		
		//출력부
		System.out.println(kaupBean.toString());
		
	}
}
