package day10.basic;
/*
 * < ��ü ���� ���α׷��� (OOP; Object Oriented Programming) >
 * - ��ü ==> ��ǰ
 * - ���α׷����� ���Ǵ� ������, �������� �� �� ��ü������ �����ִ� ���α׷���!
 * 
 * < ��ü ���� ���>
 * 1. Ŭ����
 * 		- �ν��Ͻ��� ���� �� ����� ���赵
 * 2. �ν��Ͻ�(instance)
 * 		- ��ü
 * 3. ���۷���(reference, ����)
 * 		- �ν��Ͻ��� ��ġ�� �������� �ּ�
 * 4. ���۷��� ����(���� ����)
 * 		- ���۷����� �����ϴ� ����
 * 5. ���۷��� �ڷ���(���� �ڷ���)
 * 		- ���۷����� �ڷ��� (��ü�� �ڷ����̶�� ���� ������)
 * 		- �����ڷ��� 8������ ������ �ڹ��� ��� �ڷ���
 * 			(Ŭ����, �������̽�, �迭, enum�� �����ڷ����� �ȴ�.)
 * 
 * <����>
 * - �ν��Ͻ��� ��ġ�� �ּ�
 *  ** �ּҶ�?
 *  	�޸��� ������ Ȥ�� ������ ��ġ
 *  	1byte �� 1����
 *  	�ּҴ� 0 �̻��� ������
 *  	�ּ��� ũ��(����)�� 32bit => JVM �������� 32bit
 * - �������� : �ּҸ� �����ϴ� ���� 
 * 		int[] arr = new int [3];
 * 		Person per = new Person();
 * 		String s = "";  => ���⼭ arr, per, s�� ���������̴�. �� �տ� �ִ� int[]���� �����ڷ����̴�.
 * 
 * 		-> �������� ��ü ũ��� ������ 4byte!!!!! (32bit�̹Ƿ�)
 * - �����ڷ��� : �������� �ڷ���
 * 		==> �߿�*** �� �ּҸ� ã�ư��� ��, �޸𸮴� XXX������� �ν��ض�! ***
 * 		==> ���� �ּҶ� �ڷ����� �ٸ��� �ٸ��� �νĵ�!
 *  
 */

public class Test01 {
	public static void main(String[] args) {
		// Person�� �������� 3�� ����
		Person p1, p2, p3;
		
		// Person�� ��ü 2�� ���� (p1, p2�� ����)
		p1 = new Person(); 
		// new Person()
		// : Person ������� �ν��Ͻ��� ������ ��, �� �ν��Ͻ��� �ּҸ� ��ȯ�ϰԵ�.
		p2 = new Person();
		p3 = null; // null�� �����Ⱚ�� ��������.
		// �� ���������� ������ ����ִ��� ���
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		// ù ��° ��ü(p1)�� ��������� ������ ����
		// '.' : ���� ������ (~��)
		p1.name = "ȫ�浿";
		p1.age = 25;
		p1.adult = p1.age >= 20;
		
		//p1,p2 ��ü�� ��������� �� ���
		System.out.println(p1.name + "," + p1.age + "," + p1.adult);
		System.out.println(p2.name + "," + p2.age + "," + p2.adult);
		
		//����! p3�� null (��ü ����)�̱� ������ ������� ȣ�� �Ұ�!
		//System.out.println(p3.name + "," + p3.age + "," + p3.adult);
		
		// Person ��ü���� ������ �ִ� printInfo() �Լ� ����
		p1.printInfo();
		p2.printInfo();
		
	}

}