package day13.basic;

public class Person {
	String name;
	int age;
	String tel;
	
	void setData(String n0){
		this.setData(n0, 0, "연락처 없음");
	}
	void setData(String n1, int a1){
		this.setData(n1, a1, "연락처 없음");
	}
	void setData(String n2, int a2, String t2){
		this.name = n2;
		this.age = a2;
		this.tel = t2;
	}
	
	String getData() {
		return "[" + name + "] " + age + "세, " + tel;
	}
}



