package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : KEC
 * @ Story : 
 * */
public class IntArrayDemo {
	public static void main(String[] args) {
		// 선언부
		// 변수의 선언
		// 지역변수는 무조건 초기화 해야 한다. => 문법
		// 그런데 변수 하나하나 초기호 하려다 보니 여러개 있는경우 효율이 낮다.
		int[] arr; // 숫자형 배열의 선언
		arr = new int[100000];
		// 위 문장을 하나로 합치면,
		int[] arr2 = new int[100000];
		Scanner scanner =new Scanner(System.in);
		/*
		 자바는 객체지향 언어. 이말은 프로그램 모양을 객체화 시켜서 사용한다는 뜻과 동일
		 그럼 객체화 시킨다는 말의 뜻은 좁은 의미에서 보면 main()을 해체하고 단 하나의
		 main()만 프로그램에서 존재시키고 나머지는 클래스화 하여 필요할 때에만 그 기능을 
		 호출하여 사용한다는 의미.
		 호출방법은 공식으로 굳어졌는데
		  클래스이름 객체이름 = new 클래스이름();
		 --- ()안에 있는 변수는
		 * */
	}
}
