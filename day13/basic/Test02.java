package day13.basic;

public class Test02 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setData("홍길동"); // "홍길동", 0살, "연락처 없음"
		p2.setData("김길동", 15); // "김길동", 15살, "연락처 없음"
		p3.setData("최길동", 25, "010-2222-3333"); // "최길동", 25살, "010-2222-3333"
		
		
		// Person 인스턴스들의 모든 정보 출력
		System.out.println(p1.getData());
		System.out.println(p2.getData());
		System.out.println(p3.getData());
		
	}
}