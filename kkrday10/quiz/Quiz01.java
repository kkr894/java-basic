/*
 * 1. Student Ŭ���� 
 *  - �������(=�ʵ�) ����
 *   �̸�, ��, ��, ��, ���, �հݿ���(boolean)
 * 
 * 2. Quiz01 ����Ŭ���� 
 *  - Student �ν��Ͻ��� 3�� �����Ͽ� 
 *  - Scanner�� ����ؼ� �л� 3���� �̸�, ��, ��, ���� �Է� �޴´�
 *  - ��� �ν��Ͻ��� ��հ� �հ� ����(��� 60�� �̻��̸� �հ�)�� ���Ǿ� ����
 *  - 3���� �̸�, ���, �հ� ���θ� ��� 
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
		System.out.println("�̸�?");
		s1.name= sc.next();
		System.out.println("����?");
		s1.kor = sc.nextInt();
		System.out.println("����?");
		s1.eng = sc.nextInt();
		System.out.println("����?");
		s1.mat = sc.nextInt();
				System.out.println(avg);
				System.out.println(s1.name);
				if (avg >= 60) {
					System.out.println("�հ�");
				} else { System.out.println("���հ�");
		
	}
	
}
}
