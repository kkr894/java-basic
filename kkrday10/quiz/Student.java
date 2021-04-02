/*
 * 1. Student 클래스 
 *  - 멤버변수(=필드) 선언
 *   이름, 국, 영, 수, 평균, 합격여부(boolean)
 * 
 * 2. Quiz01 메인클래스 
 *  - Student 인스턴스를 3개 생성하여 
 *  - Scanner를 사용해서 학생 3명의 이름, 국, 영, 수를 입력 받는다
 *  - 모든 인스턴스의 평균과 합격 여부(평균 60점 이상이면 합격)이 계산되어 저장
 *  - 3명의 이름, 평균, 합격 여부를 출력 
 *   
 */
package day10.quiz;

public class Student {
	String name;
	int kor, eng, mat;
	double avg = kor + eng + mat /3.0;
	boolean pass;
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("평균 : " + avg);
		System.out.println(pass? "합격" : "불합격");
	}
}
