package day13.basic;
/*
this 키워드
: '나'
	객체가 스스로를 지칭할 때 쓰는 키워드
	이 객체의 레퍼런스
	0번 인자를 받는 키워드
	
*/
// public 클래스는 하나만 있어야 한다.
// 클래스 내부에서 멤버변수, 멤버메소드를 지칭할때는 this.가 앞에 꼭 붙어야한다. 
// (컴퓨터가 자동으로 붙어주면 생략하는 경우도 있음)--> 이름이 겹치면 자동으로 안 붙여줌
// 필드는 heap에서 생기고 메소드는 stack에서 생김
// 메소드는 호출될때 돗자리를 깐다.
// 돗자리를 깐 동시에 인스턴스의 주소가 this에 등록된다.

class Student {
	String name;
	int score;
	
	void setData(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void printData() {
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
	}
}

public class Test05 {
}
