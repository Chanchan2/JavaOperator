package array;
/*
 * @ Date : 2015.07.13
 * @ Author : KEC
 * @ Story :문자열형(String) 배열 예제
 * */
public class StringArrayDemo {
	/*
	자바에서 배열문법
	1. 무조건 같은 type
	2. 배열은 크기가 있어야 한다.
	3. 배열 크기는 객체.length
	4. 배열은 new 로 생성하고, 메모리영역 heap에 할당
	5. 배열 출력은 for 문으로 한다.
	 * */
	public static void main(String[] args) {
		String[] strArr =new String[3];
		strArr[0] = "1"; // 리터럴 타입 1 을 첫번째에 할당
		strArr[1] = "2";
		strArr[2] = "3";
		for (int i = 0; i < strArr.length; i++) {
			// System.out.print(i + "\t");
			System.out.print(strArr[i]+"\t");
		}
	}
	
	
}
