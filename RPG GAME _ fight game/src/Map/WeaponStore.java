package Map;

public class WeaponStore extends Map {
	
	int commonWeapon = 50;
	int commonShield = 50;
	
	
	public int show(int money, int num) {
		
		name = "���� ����";
		System.out.println(name + "���� ������ ���� �õ��ϴ� ���Դϴ�.");
		
		if(num == 1) {
			if(commonWeapon <= money) {
				return money - commonWeapon;
			}
		}
		
		if(num == 2) {
			if(commonShield <= money) {
				return money - commonShield;
			}
		}
		
		return money;
	}
}

