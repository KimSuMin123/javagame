package Character;

import java.util.Scanner;

public class Magician extends Hero {
	
	public int attack() {
		
		int sum = 0;
		
		if(mp >= 10) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 불 지옥");
			System.out.println("2. 물 폭탄");
			System.out.printf("공격 번호를 입력하세요 : ");
			int num = sc.nextInt();
		
		if(num == 1) {
			
			sum += level * 10;
			sum += power * 15;
			sum += defense * 5;
			System.out.println("데미지는 " + sum + " 입니다.");
			mp = mp - 5;
			return sum;
			
		}else if(num == 2) {
			
			sum += level * 8;
			sum += power * 13;
			sum += defense * 10;
			System.out.println("데미지는 " + sum + " 입니다.");
			mp = mp - 5;
			return sum;
		}
		
		System.out.println("데미지는 " + sum + " 입니다.");
		return sum;
		
		}else {
			System.out.println("MP가 남아있지 않습니다.");
			return sum;
		}
	}
	
	public void attacked(int sum) {
		
		if(defense >= sum) {
			hp = hp - 0;
		}else {
			hp = hp + defense - sum;
		}
	}
}
	
	
	
	
	
	