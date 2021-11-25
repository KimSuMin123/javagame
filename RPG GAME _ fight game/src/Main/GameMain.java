package Main;

import java.util.Scanner;

import Character.*;

import Map.*;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Hero hero = new Hero();
		
		System.out.println("*******RPG GAME*******");
		System.out.println("1. ����");
		System.out.println("2. ������");
		System.out.println("3. �ü�");
		System.out.printf("������ ��ȣ�� �Է��ϼ���. : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			
			System.out.println("���簡 ���õǾ����ϴ�.");
			hero = new Warrior();
			hero.defense = 25;
			hero.power = 15;
			hero.level = 1;
			hero.hp = 80;
			hero.mp = 0;
			
		}else if(num == 2) {
			
			System.out.println("�����簡 ���õǾ����ϴ�.");
			hero = new Magician();
			hero.defense = 10;
			hero.power = 18;
			hero.level = 1;
			hero.hp = 60;
			hero.mp = 60;
		
		}else if(num == 3) {
			
			System.out.println("�ü��� ���õǾ����ϴ�.");
			hero = new Archer();
			hero.defense = 5;
			hero.power = 20;
			hero.level = 1;
			hero.hp = 50;
			hero.mp = 0;
		
		}
		
		System.out.printf("������ �̸��� �Է��ϼ���. : ");
		hero.name = sc.next();
		System.out.println("�̸��� �ԷµǾ����ϴ�.");
		System.out.println("���ӿ� �����Ͽ����ϴ�.");
		
		while(true) {
			
			System.out.println("*********************");
			System.out.println("���� "+ hero.name + "�� �̸� : " + hero.name);
			System.out.println("���� "+ hero.name + "�� ���� : " + hero.level);
			System.out.println("���� "+ hero.name + "�� �� : " + hero.power);
			System.out.println("���� "+ hero.name + "�� ���� : " + hero.defense);
			System.out.println("���� "+ hero.name + "�� HP : " + hero.hp);
			System.out.println("���� "+ hero.name + "�� MP : "  + hero.mp);
			System.out.println("���� "+ hero.name + "�� ����ġ : "  + hero.experience);
			System.out.println("���� "+ hero.name + "�� �� : "  + hero.money + "��");
			System.out.println("*********************");
			
			System.out.println("1. �����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.printf("������ ��Ҹ� �Է��ϼ���. : ");
			num = sc.nextInt();
			
			if(num == 1) {
				
				Monster monster = new Monster();
				System.out.println("����Ϳ� �����Ͽ����ϴ�.");
				System.out.println("1. �ʱ���");
				System.out.println("2. ������");
				System.out.println("3. �鰳");
				System.out.println("4. �����");
				System.out.printf("������ ��Ҹ� �Է��ϼ���. : ");
				num = sc.nextInt();
				
				if(num == 1) {
					
					monster = new Racoon();
					monster.name = "�ʱ���";
					monster.hp = 100;
					monster.mp = 0;
					monster.level = 1;
					monster.power = 20;
					monster.defense = 5;
					monster.money = 10;
					monster.experience = 10;
					System.out.println(monster.name + "�� ������ �����մϴ�.");
				}
				
				if(num == 2) {
					
					monster = new WildCat();
					monster.name = "������";
					monster.hp = 2000;
					monster.mp = 0;
					monster.level = 5;
					monster.power = 100;
					monster.defense = 20;
					monster.money = 30;
					monster.experience = 50;
					System.out.println(monster.name + "�� ������ �����մϴ�.");
				}
				
				if(num == 3) {
					
					monster = new WildDog();
					monster.name = "�鰳";
					monster.hp = 3000;
					monster.mp = 0;
					monster.level = 15;
					monster.power = 300;
					monster.defense = 30;
					monster.money = 50;
					monster.experience = 100;
					System.out.println(monster.name + "�� ������ �����մϴ�.");
				}
				
				if(num == 4) {
					
					monster = new WildPig();
					monster.name = "�����";
					monster.hp = 10000;
					monster.mp = 0;
					monster.level = 30;
					monster.power = 1000;
					monster.defense = 80;
					monster.money = 200;
					monster.experience = 300;
					System.out.println(monster.name + "�� ������ �����մϴ�.");
				}
				
				while(true) {
					
					System.out.println(hero.name + "�� �����Դϴ�.");
					monster.attacked(hero.attack());
					
					if(monster.hp <= 0) {
						
						System.out.println(monster.name + "�� �׾����ϴ�.");
						hero.experience += monster.experience;
						hero.money += monster.money;
						break;
					}
					
					System.out.println(monster.name + "�� �����Դϴ�.");
					hero.attacked(monster.attack());
					
					if(hero.hp <= 0) {
						
						System.out.println(hero.name + "�� �׾����ϴ�.");
						hero.hp = 1;
						System.out.println(hero.name + "�� ü��" + hero.hp + "���� ��Ȱ�߽��ϴ�.");
						break;
					}
				}
			}else if(num == 2) {
				
				WeaponStore weaponstore = new WeaponStore();
				System.out.println("���� ������ �����Ͽ����ϴ�.");
				System.out.println("1. ���� ���� (50��)");
				System.out.println("2. ���� ���� (50��)");
				System.out.println("���� ���� " + hero.money  + "�ֽ��ϴ�.");
				System.out.printf("���Ͻô� ������ �Է��ϼ���. : ");
				
				num = sc.nextInt();
				int temp = hero.money;
				
				if((hero.money = weaponstore.show(hero.money,num)) != -1) {
					
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					
					if(num == 1) {
						hero.power += 5;
					}
					
					if(num == 2) {
						hero.defense += 5;
						
					}
					
					System.out.println(temp + "�� ���ҽ��ϴ�.");
					
				}else {
					System.out.println("���� �����մϴ�.");
					System.out.println(temp + "�� ���ҽ��ϴ�.");
				}
			}else if(num == 3) {
				
				PotionStore potionstore = new PotionStore();
				System.out.println("���� ������ �����Ͽ����ϴ�.");
				System.out.println("1. �� ���� ���� (30��)");
				System.out.println("2. ���� ���� ���� (30��)");
				System.out.println("3. ����ġ ���� ���� (100��)");
				System.out.println("4. HP ���� ���� (10��)");
				System.out.println("5. MP ���� ���� (10��)");
				System.out.printf("���Ͻô� ������ �Է��ϼ���. : ");
				
				num = sc.nextInt();
				int temp = hero.money;
				
				if((hero.money = potionstore.show(hero.money,num)) != -1) {
					
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					
					if(num == 1) {
						hero.power += 3;
					}
					
					if(num == 2) {
						hero.defense += 3;	
					}
					if(num == 3) {
						hero.experience += 50;	
					}
					if(num == 4) {
						hero.hp += 50;
					}
					if(num == 5) {
						hero.mp += 50;
					}
					
					System.out.println(temp + "�� ���ҽ��ϴ�.");
					
				}else {
					System.out.println("���� �����մϴ�.");
					System.out.println(temp + "�� ���ҽ��ϴ�.");
				}
			}
			
			if(hero.experience  >= hero.level * 80) {
				
				hero.level += 1;
				System.out.println(hero.name + "�� ������" + hero.level + "�� �Ǿ����ϴ�.");
				hero.money += hero.level * 50;
				System.out.println("����� ������� ���� " + hero.level * 50 + "�� �����Ͽ� ");
				System.out.println(hero.money + "���� �Ǿ����ϴ�.");
				hero.experience = 0;
			}
			
		}
	}
}
				
				
				
				
				
				