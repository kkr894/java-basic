package day10.basic;

public class Person {
	String name = "����";   // Person�� �������(=field, property) 
	int age;	   // Person�� �������(=field, property)
	boolean adult; // Person�� �������(=field, property)

	void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println(adult ? "����" : "�̼���");
	}
}
