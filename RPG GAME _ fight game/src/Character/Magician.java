package Character;

import java.util.Scanner;

public class Magician extends Hero {
	
	public int attack() {
		
		int sum = 0;
		
		if(mp >= 10) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1. �� ����");
			System.out.println("2. �� ��ź");
			System.out.printf("���� ��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
		
		if(num == 1) {
			
			sum += level * 10;
			sum += power * 15;
			sum += defense * 5;
			System.out.println("�������� " + sum + " �Դϴ�.");
			mp = mp - 5;
			return sum;
			
		}else if(num == 2) {
			
			sum += level * 8;
			sum += power * 13;
			sum += defense * 10;
			System.out.println("�������� " + sum + " �Դϴ�.");
			mp = mp - 5;
			return sum;
		}
		
		System.out.println("�������� " + sum + " �Դϴ�.");
		return sum;
		
		}else {
			System.out.println("MP�� �������� �ʽ��ϴ�.");
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
	
	
	
	
	
	