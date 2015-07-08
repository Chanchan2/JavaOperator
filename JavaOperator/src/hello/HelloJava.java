package hello;

// 한줄주석
/*
 * 다중주석
 * */
/*
 * @ Date : 2015.07.07
 * @ Author : KEC
 * @ Story : Hello Java
 * */
public class HelloJava {
	/* 자바의 계층 구조
	 * 프로젝트 > 패키지 > 클래스 > 멤버(멤버필드, 멤버메소드)
	 * 콘솔에 실행시키는 단축키는 : CTRL + F11
	 * 콘솔에 로딩시키는 메소드는 main() -> Class당 main은 하나씩
	 * */
	public static void main(String[] args) {
		/*
		 * 자바에서 메소드는 엑셀에서 함수와 같은 기능을 한다.
		 * 하지만 차이점은 함수는 상위개념이 없고 , 자바는
		 * 메소드 상위에 클래스가 존재한다는 점이 다르다. method=function
		 * */
		// syso 는 출력 단축키로 main() 안에서만 작동한다.
		System.out.println("헬로우 자바2");
	}

}
