package day10.homework;

import java.util.Scanner;

/*
총 4학년
각 학년에는 3반씩있음
각 반에는 4명의 학생들이 있음
총 학생들의 이름을 저장할 배열을 생성하세요.
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
							(grade + 1) + "학년 " + 
							(clazz + 1) + "반 " + 
							(no + 1) + "번 학생 이름:");
					names[grade][clazz][no] = sc.next();
				}
			}
		}
		
		for(int grade = 0; grade < names.length; ++grade) { 
			for (int clazz = 0; clazz < names[grade].length; ++clazz) {
				for(int no = 0; no < names[grade][clazz].length; ++no) {
					System.out.println(
							(grade + 1) + "학년 " + 
							(clazz + 1) + "반 " + (no + 1) + "번 학생 - " +  
							names[grade][clazz][no]);
				}
			}
		}
		
		
	}
}





