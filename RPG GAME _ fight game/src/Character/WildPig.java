package Character;

public class WildPig extends Monster {
	
	public int attack() {
		
		System.out.println("�������� " + power + " �Դϴ�.");
		return power;
		
	}
	
	public void attacked(int sum) {
		
		if(defense >= sum) {
			hp = hp - 0;
		}else {
			hp = hp + defense - sum;
		}
	}
}
