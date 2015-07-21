package abstraction;

public class Orange implements FruitsInterface {

	@Override
	public void display(String str) {
		System.out.println(str + "오렌지 입니다.");
	}
	public int count(){	// int 리턴타입
		// 리턴타입이 void가 아니라면 반드시 return 키워드를 사용해야 한다.
		// 리턴타입이 존재할 때 코딩하는 방법
		// 1. 리턴타입의 지변을 초기화 한다.
		int count = 100;
		// String c = "";
		// Account acc = null;
		// 2. 리턴키워드 뒤에 지변을 할당한다.
		return count;
		
	}
}
