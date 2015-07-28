package utill.vector;

import java.util.Vector;

public interface GradeService {
	// 인터페이스는 추상 메소드만 존재한다. 따라서 abstract 를 생략해도 디폴트로 존자한다.
	/*
	 성적표를 컬렉션에 입력
	 * */
	public void input(Grade grade);
	/*
	 학생들 전체 성적표 출력
	 * */
	public void printList();
	/*
	 학번으로 성적 결과 조회(검색)
	 * */
	public String searchGradeByHakbun(String hakbun);
	/*
	 이름으로 성적 결과 조회(검색)
	 * */
	public Vector<Grade> searchGradByname(String name);
	/*
	 총점 역순 정렬
	 * */
	public void descByTotal();
	/*
	 이름 사전식 정렬
	 */
	public void ascByname();
}
