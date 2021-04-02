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

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Student s1, s2, s3;
		double avg = 0;

		s1=new Student();
		s2=new Student();
		s3=new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름?");
		s1.name= sc.next();
		System.out.println("국어?");
		s1.kor = sc.nextInt();
		System.out.println("영어?");
		s1.eng = sc.nextInt();
		System.out.println("수학?");
		s1.mat = sc.nextInt();
				System.out.println(avg);
				System.out.println(s1.name);
				if (avg >= 60) {
					System.out.println("합격");
				} else { System.out.println("불합격");
		
	}
	
}
}
