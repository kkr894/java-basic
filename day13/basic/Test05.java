package day13.basic;
/*
this Ű����
: '��'
	��ü�� �����θ� ��Ī�� �� ���� Ű����
	�� ��ü�� ���۷���
	0�� ���ڸ� �޴� Ű����
	
*/
// public Ŭ������ �ϳ��� �־�� �Ѵ�.
// Ŭ���� ���ο��� �������, ����޼ҵ带 ��Ī�Ҷ��� this.�� �տ� �� �پ���Ѵ�. 
// (��ǻ�Ͱ� �ڵ����� �پ��ָ� �����ϴ� ��쵵 ����)--> �̸��� ��ġ�� �ڵ����� �� �ٿ���
// �ʵ�� heap���� ����� �޼ҵ�� stack���� ����
// �޼ҵ�� ȣ��ɶ� ���ڸ��� ���.
// ���ڸ��� �� ���ÿ� �ν��Ͻ��� �ּҰ� this�� ��ϵȴ�.

class Student {
	String name;
	int score;
	
	void setData(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void printData() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + score);
	}
}

public class Test05 {
}
