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

public class Student {
	String name;
	int kor, eng, mat;
	double avg = kor + eng + mat /3.0;
	boolean pass;
	
	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("��� : " + avg);
		System.out.println(pass? "�հ�" : "���հ�");
	}
}
