package loop;

public class WhileLoopMain2 {
	public static void main(String[] args) {
		// 선언부
		int idx=0;
		// 연산부
		while (true) {	// 무한루프 사용 선언
			idx++;
			System.out.print(idx + "\t");
			// 아래 구문이 없으면 무한루프
			if(idx==10){
				break;
			}
		}
	}
}
