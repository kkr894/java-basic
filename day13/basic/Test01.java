package day13.basic;
// overload : ���� �̸��� �޼��带 ���� �� �����ϴ� ��
public class Test01 {
	public static void main(String[] args) {
		// �츮�� ���� �޼���� 
		// �Ű������� ����/�ڷ��� == ���ڰ��� ����/�ڷ��� 
		
		MyTest test = new MyTest();
		
		test.aa();
		test.aa(10); 
		test.aa("������");
		test.aa(10, 20); 
		
		System.out.println();
		System.out.println(10);
		System.out.println("������");
		// System.out.println(10, 20); // �ȵ�
	}
}




