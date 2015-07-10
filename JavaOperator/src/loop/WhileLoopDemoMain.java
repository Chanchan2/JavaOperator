package loop;
/*
 * @ Date : 2015.07.09
 * @ Author : KEC
 * @ Story : While Loop 문법
 * 
 * */
public class WhileLoopDemoMain {
	// loop : 원단어 뜻은 순환의 의미
	// 인덱스값을 통해 순환 횟수를 설정하고
	// limit 값을 통해 마감 인덱스 까지만 회전한다.
	/*
	 * while loop은 limit 값을 알 수 있는 상황과 없는 상황 두가지 버전으로 
	 * 사용된다.
	 * */
	// limit 값이 설정된 경우
	public static void main(String[] args) {
		int idx = 1;
		while (idx<11) {
			System.out.print(idx + "\t");
			idx++;	// 단항연산식으로 기본 idx 값에 회전 때마다 1씩 증가.
		}
	}

}
