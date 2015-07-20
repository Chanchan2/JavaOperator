package inheritance;
/*
 * @ Date : 2015.07.20
 * @ Author : KEC
 * @ Story : 상속
 * */
public class Phone {	// 눈으로 식별가능한 구상 클래스
	/*===== Field =====*/
	private String company;
	private String call;
	
	/*===== Constructor =====*/
	
	/*===== MemberMethod =====*/
	// getter/setter 단축키 : ALT + SHIFT + S
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
	
}
