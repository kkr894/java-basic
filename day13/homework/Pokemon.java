package day13.homework;

public class Pokemon {
	// �ʵ�
	String name;
	int level;
	int hp; // ü��
	int ap; // ���ݷ�
	
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
		return "�̸� : " + name + "\n"
				+ "LV : " + level + "\n"
				+ "HP : " + hp + "\n"
				+ "AP : " + ap;
	}
	
	
	// 4. attack()
	//   ���ڰ� : �ٸ� Pokemon
	//   �ϴ� �� : ���ڷ� ���� Pokemon �� ����
	//			  �� ��ü�� ���ݷ¸�ŭ ��� Pokemon�� hp�� ���ҽ�Ų��.
	//   ���ϰ� : ��븦 �����߸���(����� hp < 0) true
	//			 ��밡 ������ ����ִٸ� false
	boolean attack(Pokemon enemy){
		enemy.hp -= ap;
		return enemy.hp < 0;
	}
	
	// Quiz01���� �� Pokemon ����, ������ �޼��带 �����Ӱ� �׽�Ʈ
}





