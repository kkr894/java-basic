package day13.basic;

import java.util.Arrays;

public class Test04 {
/*
  	<���� ����>
  	������ �������� ����
  	
 */
	static void aa(int...nums) { // int[] nums
		System.out.println("aa() �����! nums :" + nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void bb(String s, boolean...args) {
		
	}
	
    //static void cc(boolean...args, String s) { //---> ���� : �������ڴ� �� �ڿ� �;� �ȴ�. parameter : �Ű����� / argument : ���� 
		
	//} 
	
	// static void cc(boolean...args, String...s) // ---> ���� : �� �� �̻��� ���� ���ڷ� ó���� �� ����.
	
	public static void main(String[] args) {
		aa();
		aa(10);
		aa(10, 20, 30);
		aa(100, 200, 300, 400, 500, 600);
		
		bb("A");
		bb("A", true, false, true, true);
	}
}