package day10.homework;

import java.util.Arrays;
import java.util.Scanner;

/*
3. 10 X 10 ¥�� ������ �迭 'map'�� �ִ�.

 (3-1) ������ ��ġ�� 30������ ���͸� ��ġ�غ���.
	���ʹ� 1�� ǥ���Ѵ�.
    (�ߺ� ��ġ ���)
	��ġ�� ���͸� map�� ����غ���

 (3-2) ����ڿ��� ��, �� ������ 2���� ������ �Է� �ް� 
    map �� ������� ��ġ�� ����غ���. (������ 2�� ǥ���Ѵ�.)

 (3-3) ����ڿ��� ���ϴ� ���� ������ ���������� �Է� �ް� 
    ������� ��ġ���� ���� ������ ������ ������ ����غ���.

 */
public class Homework03 {
	public static void main(String[] args) {
		int[][] map = new int[10][10]; 
		
		// (3-1)
		int r1, r2;
		for(int i = 0; i < 30; ++i) {
			r1 = (int)(Math.random() * 10);
			r2 = (int)(Math.random() * 10);
			if(map[r1][r2] == 1) {
				--i;
			}
			else {
				map[r1][r2] = 1;
			}
		}
		
		// ���� ��� ���
//		for(int i = 0; i < 10; ++i) {
//			for(int j = 0; j < 10; ++j) {
//				System.out.print(map[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
//		(3-2)
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ε���(0~9) : ");
		int user�� = sc.nextInt();
		System.out.print("�� �ε���(0~9) : ");
		int user�� = sc.nextInt();
		
		map[user��][user��] = 2;
		
//		��� ���
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		
//		(3-3) 
		System.out.print("���� ���� : ");
		int range = sc.nextInt();
		
		int ����_�� = user�� - range < 0 ? 0 : user�� - range;
		int ��_�� = user�� + range > 9 ? 9 : user�� + range;
		int ����_�� = user�� - range < 0 ? 0 : user�� - range;
		int ��_�� = user�� + range > 9 ? 9 : user�� + range;
		
		int cnt = 0;
		for(int i = ����_��; i <= ��_��; ++i) {
			for(int j = ����_��; j <= ��_��; ++j) {
				if(map[i][j] == 1) {
					++cnt;
				}
			}
		}
		
//		��� ���
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("�� " + cnt + "���� óġ ����!");
		
	}
}