package day13.basic;

import java.util.Arrays;

public class Test04 {
/*
  	<가변 인자>
  	개수가 무제한인 인자
  	
 */
	static void aa(int...nums) { // int[] nums
		System.out.println("aa() 실행됨! nums :" + nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void bb(String s, boolean...args) {
		
	}
	
    //static void cc(boolean...args, String s) { //---> 에러 : 가변인자는 맨 뒤에 와야 된다. parameter : 매개변수 / argument : 인자 
		
	//} 
	
	// static void cc(boolean...args, String...s) // ---> 에러 : 두 개 이상을 가변 인자로 처리할 수 없다.
	
	public static void main(String[] args) {
		aa();
		aa(10);
		aa(10, 20, 30);
		aa(100, 200, 300, 400, 500, 600);
		
		bb("A");
		bb("A", true, false, true, true);
	}
}
