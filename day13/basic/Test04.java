package day13.basic;

import java.util.Arrays;

public class Test04 {
	
	/*
	 	< 가변 인자 > 
	 	개수가 무제한인 인자
	 */
	static void aa(int...nums) { // int[] nums 
		System.out.println("aa() 실행 됨! nums : " + nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void bb(String s, boolean...bools) {
		
	}
	
//	에러!
//	static void cc(boolean...bools, String s) {
//		
//	}
	
//	에러!
//	static void dd(boolean...bools, String... s) {
//		
//	}
	
	public static void main(String[] args) {
		aa();
		aa(10);
		aa(10, 20, 30);
		aa(100, 200, 300, 400, 500, 600);
		
		bb("A");
		bb("A", true, false, true, true);
	}
}




