package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : KEC
 * @ Story : 인터페이스인 Product 를 구현한 클래스
 * */
public class ProductSpec implements Product{
	/*=== Field ===*/
	private String company;	// 제조사
	private String name;
	private String serialNo;

	
	/*=== Constructor ===*/
	
	
	/*=== MemberMethod ===*/
	@Override
	public void showInfo() {
		System.out.println("제조사 : " + this.company);
		System.out.println("제품명 : " + this.name);
		System.out.println("시리얼넘버 : " + this.serialNo);
		
	}
	@Override
	public void writeInfo(String company, String name, String serialNo) {
		// 청색글씨 = 인스턴스 변수 , 밤색글씨 = 파라미터로 넘어온 지변
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
		
	}
}
