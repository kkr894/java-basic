package day10.basic;

public class Person {
	String name = "없음";   // Person의 멤버변수(=field, property) 
	int age;	   // Person의 멤버변수(=field, property)
	boolean adult; // Person의 멤버변수(=field, property)

	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println(adult ? "성인" : "미성년");
	}
}
