package day13.basic;

public class Test02 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setData("ȫ�浿"); // "ȫ�浿", 0��, "����ó ����"
		p2.setData("��浿", 15); // "��浿", 15��, "����ó ����"
		p3.setData("�ֱ浿", 25, "010-2222-3333"); // "�ֱ浿", 25��, "010-2222-3333"
		
		
		// Person �ν��Ͻ����� ��� ���� ���
		System.out.println(p1.getData());
		System.out.println(p2.getData());
		System.out.println(p3.getData());
		
	}
}