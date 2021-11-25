package Map;

public class WeaponStore extends Map {
	
	int commonWeapon = 50;
	int commonShield = 50;
	
	
	public int show(int money, int num) {
		
		name = "무기 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		
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

