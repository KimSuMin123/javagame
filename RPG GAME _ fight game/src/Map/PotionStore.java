package Map;

public class PotionStore extends Map{
	
	int powerPotion = 30;
	int defensePotion = 30;
	int experiencePotion = 100;
	int hpPotion = 10;
	int mpPotion = 10;
	
	public int show(int money, int num) {
		
		name = "���� ����";
		System.out.println(name + "���� ������ ���� �õ��ϴ� ���Դϴ�.");
		
		if(num == 1) {
			if(powerPotion <= money) {
				return money - powerPotion;
			}
		}
		
		if(num == 2) {
			if(defensePotion <= money) {
				return money - defensePotion;
			}
		}
		
		if(num == 3) {
			if(experiencePotion <= money) {
				return money - experiencePotion;
			}
		}
		
		if(num == 4) {
			if(hpPotion <= money) {
				return money - hpPotion;
			}
		}
		
		if(num == 5) {
			if(mpPotion <= money) {
				return money - mpPotion;
			}
		}
		return money;
	}
}
