package day10.homework;

import java.util.Scanner;

/*
�� 4�г�
�� �г⿡�� 3�ݾ�����
�� �ݿ��� 4���� �л����� ����
�� �л����� �̸��� ������ �迭�� �����ϼ���.
 */
public class Homework01 {
	public static void main(String[] args) {
		String[][][] names =new String[4][3][4];
		Scanner sc = new Scanner(System.in);
		
		for(int grade = 0; grade < names.length; ++grade) { 
			// grade : 0,1,2,3
			for (int clazz = 0; clazz < names[grade].length; ++clazz) {
				// clazz : 0, 1, 2
				for(int no = 0; no < names[grade][clazz].length; ++no) {
					// no : 0,1,2,3
					System.out.print(
							(grade + 1) + "�г� " + 
							(clazz + 1) + "�� " + 
							(no + 1) + "�� �л� �̸�:");
					names[grade][clazz][no] = sc.next();
				}
			}
		}
		
		for(int grade = 0; grade < names.length; ++grade) { 
			for (int clazz = 0; clazz < names[grade].length; ++clazz) {
				for(int no = 0; no < names[grade][clazz].length; ++no) {
					System.out.println(
							(grade + 1) + "�г� " + 
							(clazz + 1) + "�� " + (no + 1) + "�� �л� - " +  
							names[grade][clazz][no]);
				}
			}
		}
		
		
	}
}





