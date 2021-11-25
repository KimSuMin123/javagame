package Character;

public class Monster extends Character{
	
	public int power;
	public int defense;
	public int money;
	public int experience;
	
	public int attack() {
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
