package day13.basic;

public class Person {
	String name;
	int age;
	String tel;
	
	void setData(String n0){
		setData(n0, 0, "����ó ����");
	}
	void setData(String n1, int a1){
		setData(n1, a1, "����ó ����");
	}
	void setData(String n2, int a2, String t2){
		name = n2;
		age = a2;
		tel = t2;
	}
	
	String getData() {
		return "[" + name + "] " + age + "��, " + tel;
	}
}

