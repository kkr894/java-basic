package day13.basic;
/*
	this 키워드 
	: '나'
	  객체가 스스로를 지칭할 때 쓰는 키워드
	  이 객체의 레퍼런스
	  0번 인자를 받는 키워드
 */
class Student {
	String name;
	int score;
	
	void setData(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void printData() {
		System.out.println("이름 : " + this.name);
		System.out.println("점수 : " + this.score);
	}
}
public class Test05 {

}










