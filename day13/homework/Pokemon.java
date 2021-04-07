package day13.homework;

public class Pokemon {
	// 필드
	String name;
	int level;
	int hp; // 체력
	int ap; // 공격력
	
	void resetHpAndAp() {
		hp = level * (Math.random() < 0.1 ? 110 : 100);
		ap = level * (Math.random() < 0.1 ? 3 : 2);
	}
	
	void levelUp(){
		++level;
		resetHpAndAp();
	}
	
	void setInfo(String name0, int level0){
		name = name0;
		level = level0;
		resetHpAndAp();
	}
	
	String getInfo(){
		return "이름 : " + name + "\n"
				+ "LV : " + level + "\n"
				+ "HP : " + hp + "\n"
				+ "AP : " + ap;
	}
	
	
	// 4. attack()
	//   인자값 : 다른 Pokemon
	//   하는 일 : 인자로 들어온 Pokemon 을 공격
	//			  이 객체의 공격력만큼 상대 Pokemon의 hp를 감소시킨다.
	//   리턴값 : 상대를 쓰러뜨리면(상대의 hp < 0) true
	//			 상대가 여전히 살아있다면 false
	boolean attack(Pokemon enemy){
		enemy.hp -= ap;
		return enemy.hp < 0;
	}
	
	// Quiz01에서 두 Pokemon 생성, 정의한 메서드를 자유롭게 테스트
}





