package day13.basic;

public class Test03 {
	
	// ��� ȣ�� (Recursive call)
	// �Լ� ���ο��� �ڱ� �ڽ��� ȣ���ϴ� ��
	static int factorial(int num) { //num : 5
		if(num==1) {
			return 1;
		}
		return num * factorial(num -1);
	}
	
	public static void main(String[] args) {
		int n = factorial(5); // 5! ���ϱ�
		System.out.println(n);
	}

}
