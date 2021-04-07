package day13.basic;

public class Test03 {
	
	// 재귀 호출 (Recursive call)
	// 함수 내부에서 자기 자신을 호출하는 것
	static int factorial(int num) { //num : 5
		if(num==1) {
			return 1;
		}
		return num * factorial(num -1);
	}
	
	public static void main(String[] args) {
		int n = factorial(5); // 5! 구하기
		System.out.println(n);
	}

}
