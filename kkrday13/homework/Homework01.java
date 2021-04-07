// 리턴 자료형은 메서드 작성 마지막에 생각하면 됨.
// 코드 중복은 지양
// 비교연산자는 항상 boolean이다
package day13.homework;

public class Homework01 {
	public static void main(String[] args) {
		Pokemon p1, p2;
		p1 = new Pokemon();
		p2 = new Pokemon();
		
		p1.setInfo("피카츄", 10);
		p2.setInfo("라이츄", 11);
		

		String info1, info2;
		
		System.out.println("---레벨업 전---");
		info1 = p1.getInfo();
		info2 = p2.getInfo();
		System.out.println(info1);
		System.out.println(info2);
		
		p1.levelUp();
		p2.levelUp();
	
		System.out.println("---레벨업 후---");
		info1 = p1.getInfo();
		info2 = p2.getInfo();
		System.out.println(info1);
		System.out.println(info2);
		
		
		System.out.println("p1의 공격!");
		if(p1.attack(p2)) {
			System.out.println(p2.name + "(이)가 쓰러졌다!");
			System.out.println(p1.name + "의 승리!");
		}
		else {
			System.out.println(p2.name + "(은)는 살아있다!");
		}
		
		System.out.println("p2의 공격!");
		if(p1.attack(p2)) {
			System.out.println(p2.name + "(이)가 쓰러졌다!");
			System.out.println(p1.name + "의 승리!");
		}
		else {
			System.out.println(p1.name + "(은)는 살아있다!");
		}
		
		System.out.println("맞다이 후 결과");
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
	}
}