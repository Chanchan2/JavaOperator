package utill.vector;

public class Grade {
	private int kor, eng, math;
	private String hakbun, name;

	public Grade() {}	// 아래처럼 파라미터가 있는 생성자를만들면 디폴트를 별도로 추가해 주어야 함
	// setter 대신에 생성자로 학번, 이름, 3과목 점수를 입력 받음
	public Grade(String hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getHakbun() {
		return hakbun;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		int total = 0;	// 지역변수는 초기화 필수
		total = this.kor + this.eng + this.math;
		return total;	
	}
	/*
	 이런식으로 메소드 이름이 같음에도 불구하고 파라미터 갯수나 혹은 타입이 다르면 서로 다른 메소드를 인식한다.
	 이를 객체지향 4대특징 중 하나인 다양성에서 "오버로딩"이라고 말한다. 
	 주의!! 오버라이딩은 상속관계, 구현관계에서 @Override 라고 붙은 메소드를 말함.
	 * */
	public int getTotal(int kor, int eng, int math){
		int total = 0;
		total = kor + eng + math;
		// 위 kor, eng, math는 this를 지움으로써
		// 멤머필드에 인스턴스 변수가 아닌 파라미터로 넘어 온 지역변수가 되었다.
		return total;
	}
	
	@Override
	public String toString() {
		return "성적표 \n[이름 : " + name + ", 학번 : " + hakbun + "] \n"
				+ "국어 : " + kor + " , 영어 : " + eng + " , 수학 : " + math + " \n"
				+ "총합 : " + getTotal(kor, eng, math) + "\n";
	}

	// getTotal 메소드를 직접 생성
	// 파라미터로 국어 영어 수학
	// 리턴값으로 파라미터 값의 합계를 출력
}
