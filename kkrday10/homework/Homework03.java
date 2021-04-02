package day10.homework;

import java.util.Arrays;
import java.util.Scanner;

/*
3. 10 X 10 짜리 이차원 배열 'map'이 있다.

 (3-1) 랜덤한 위치에 30마리의 몬스터를 배치해보자.
	몬스터는 1로 표시한다.
    (중복 위치 허용)
	배치된 몬스터를 map에 출력해보자

 (3-2) 사용자에게 행, 열 순서로 2개의 정수를 입력 받고 
    map 에 사용자의 위치를 출력해보자. (유저는 2로 표시한다.)

 (3-3) 사용자에게 원하는 공격 범위를 정수형으로 입력 받고 
    사용자의 위치에서 공격 가능한 몬스터의 개수를 출력해보자.

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
		
		// 몬스터 결과 출력
//		for(int i = 0; i < 10; ++i) {
//			for(int j = 0; j < 10; ++j) {
//				System.out.print(map[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
//		(3-2)
		Scanner sc = new Scanner(System.in);
		System.out.print("행 인덱스(0~9) : ");
		int user행 = sc.nextInt();
		System.out.print("열 인덱스(0~9) : ");
		int user열 = sc.nextInt();
		
		map[user행][user열] = 2;
		
//		결과 출력
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		
//		(3-3) 
		System.out.print("공격 범위 : ");
		int range = sc.nextInt();
		
		int 시작_행 = user행 - range < 0 ? 0 : user행 - range;
		int 끝_행 = user행 + range > 9 ? 9 : user행 + range;
		int 시작_열 = user열 - range < 0 ? 0 : user열 - range;
		int 끝_열 = user열 + range > 9 ? 9 : user열 + range;
		
		int cnt = 0;
		for(int i = 시작_행; i <= 끝_행; ++i) {
			for(int j = 시작_열; j <= 끝_열; ++j) {
				if(map[i][j] == 1) {
					++cnt;
				}
			}
		}
		
//		결과 출력
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("총 " + cnt + "마리 처치 가능!");
		
	}
}