package day13.homework;

public class Homework01 {
	public static void main(String[] args) {
		Pokemon p1, p2;
		p1 = new Pokemon();
		p2 = new Pokemon();
		
		p1.setInfo("��ī��", 10);
		p2.setInfo("������", 11);
		
		String info1 = p1.getInfo();
		String info2 = p2.getInfo();
		System.out.println(info1);
		System.out.println(info2);
		
		System.out.println("p1�� ����!");
		if(p1.attack(p2)) {
			System.out.println(p2.name + "(��)�� ��������!");
			System.out.println(p1.name + "�� �¸�!");
		}
		else {
			System.out.println(p2.name + "(��)�� ����ִ�!");
		}
		
		System.out.println("p2�� ����!");
		if(p2.attack(p1)) {
			System.out.println(p2.name + "(��)�� ��������!");
			System.out.println(p1.name + "�� �¸�!");
		}
		else {
			System.out.println(p1.name + "(��)�� ����ִ�!");
		}
		
		System.out.println("�´��� �� ���");
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
	}
}



