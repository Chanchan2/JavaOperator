package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.14
 * @ Author : KEC
 * @ Story :카우푸지수 프로그램을 객체화 하는 예제
 * */
public class KaupBean5 {

	private String name, msg; // 멤버필드
	private double height, weight;
	private int idx;

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * 멤버필드에 값을 저장하는 메소드가 setter 라면 값을 읽어 오는 메소드는 getter 라고 한다. getter 는 read 의
	 * 의미 getter 의 특징은 return 타입이 존재. 또한 특별한 상황이 아니라면 파라미터가 존재하지 않는다.
	 */

	public String getMsg() {
		// 연산부
		idx = (int) ((weight / (height * height)) * 10000);
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else {
			msg = "영양실조";
		}
		return msg;
	}

	@Override
	public String toString() {

		// 선언부
		String str = ""; // 지역변수는 무조건 초기화
		// 연산부
		str = "[" + name + "]님의 키: " + height + "cm, 몸무게 : " + weight + "kg," + " 카우푸지수 : " + getMsg();
		// 출력부
		return str;
	}
}
