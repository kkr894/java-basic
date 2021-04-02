package day10.basic;
/*
 * < 객체 지향 프로그래밍 (OOP; Object Oriented Programming) >
 * - 객체 ==> 부품
 * - 프로그램에서 사용되는 데이터, 행위들을 싹 다 객체들한테 때려넣는 프로그래밍!
 * 
 * < 객체 지향 용어>
 * 1. 클래스
 * 		- 인스턴스를 만들 때 사용할 설계도
 * 2. 인스턴스(instance)
 * 		- 객체
 * 3. 레퍼런스(reference, 참조)
 * 		- 인스턴스가 위치한 물리적인 주소
 * 4. 레퍼런스 변수(참조 변수)
 * 		- 레퍼런스를 저장하는 변수
 * 5. 레퍼런스 자료형(참조 자료형)
 * 		- 레퍼런스의 자료형 (객체의 자료형이라고 봐도 무방함)
 * 		- 원시자료형 8가지를 제외한 자바의 모든 자료형
 * 			(클래스, 인터페이스, 배열, enum이 참조자료형이 된다.)
 * 
 * <참조>
 * - 인스턴스가 위치한 주소
 *  ** 주소란?
 *  	메모리의 물리적 혹은 가상의 위치
 *  	1byte 당 1번지
 *  	주소는 0 이상의 정수형
 *  	주소의 크기(길이)는 32bit => JVM 내에서는 32bit
 * - 참조변수 : 주소를 저장하는 변수 
 * 		int[] arr = new int [3];
 * 		Person per = new Person();
 * 		String s = "";  => 여기서 arr, per, s가 참조변수이다. 그 앞에 있는 int[]등이 참조자료형이다.
 * 
 * 		-> 참조변수 자체 크기는 무조건 4byte!!!!! (32bit이므로)
 * - 참조자료형 : 참조값의 자료형
 * 		==> 중요*** 이 주소를 찾아갔을 때, 메모리는 XXX모양으로 인식해라! ***
 * 		==> 같은 주소라도 자료형이 다르면 다르게 인식됨!
 *  
 */

public class Test01 {
	public static void main(String[] args) {
		// Person형 참조변수 3개 선언
		Person p1, p2, p3;
		
		// Person형 객체 2개 생성 (p1, p2에 대입)
		p1 = new Person(); 
		// new Person()
		// : Person 모양으로 인스턴스를 생성한 뒤, 그 인스턴스의 주소를 반환하게됨.
		p2 = new Person();
		p3 = null; // null은 쓰레기값만 없어진다.
		// 세 참조변수에 무엇이 들어있는지 출력
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		// 첫 번째 객체(p1)의 멤버변수에 데이터 저장
		// '.' : 접근 연산자 (~의)
		p1.name = "홍길동";
		p1.age = 25;
		p1.adult = p1.age >= 20;
		
		//p1,p2 객체의 멤버변수의 값 출력
		System.out.println(p1.name + "," + p1.age + "," + p1.adult);
		System.out.println(p2.name + "," + p2.age + "," + p2.adult);
		
		//주의! p3은 null (객체 없음)이기 때문에 멤버변수 호출 불가!
		//System.out.println(p3.name + "," + p3.age + "," + p3.adult);
		
		// Person 객체들이 가지고 있는 printInfo() 함수 실행
		p1.printInfo();
		p2.printInfo();
		
	}

}
