package Character;

import java.util.Scanner;

public class Archer extends Hero {
	
	public int attack() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ȭ�� ����");
		System.out.println("2. ���� ȭ�� ����");
		System.out.printf("���� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		if(num == 1) {
			
			sum += level * 15;
			sum += power * 15;
			sum += defense * 15;
			System.out.println("�������� " + sum + " �Դϴ�.");
			return sum;
			
		}else if(num == 2) {
			
			sum += level * 10;
			sum += power * 20;
			sum += defense * 10;
			System.out.println("�������� " + sum + " �Դϴ�.");
			return sum;
			
		}
		System.out.println("�������� " + sum + " �Դϴ�.");
		return sum;
	}
	
	
	public void attacked(int sum) {
		
		if(defense >= sum) {
			hp = hp - 0;
		}else {
			hp = hp + defense - sum;
		}
	}
}
