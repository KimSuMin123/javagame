package Main;

import java.util.Scanner;

import Character.*;

import Map.*;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Hero hero = new Hero();
		
		System.out.println("*******RPG GAME*******");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 궁수");
		System.out.printf("직업의 번호를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			
			System.out.println("전사가 선택되었습니다.");
			hero = new Warrior();
			hero.defense = 25;
			hero.power = 15;
			hero.level = 1;
			hero.hp = 80;
			hero.mp = 0;
			
		}else if(num == 2) {
			
			System.out.println("마법사가 선택되었습니다.");
			hero = new Magician();
			hero.defense = 10;
			hero.power = 18;
			hero.level = 1;
			hero.hp = 60;
			hero.mp = 60;
		
		}else if(num == 3) {
			
			System.out.println("궁수가 선택되었습니다.");
			hero = new Archer();
			hero.defense = 5;
			hero.power = 20;
			hero.level = 1;
			hero.hp = 50;
			hero.mp = 0;
		
		}
		
		System.out.printf("영웅의 이름을 입력하세요. : ");
		hero.name = sc.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		
		while(true) {
			
			System.out.println("*********************");
			System.out.println("현재 "+ hero.name + "의 이름 : " + hero.name);
			System.out.println("현재 "+ hero.name + "의 레벨 : " + hero.level);
			System.out.println("현재 "+ hero.name + "의 힘 : " + hero.power);
			System.out.println("현재 "+ hero.name + "의 방어력 : " + hero.defense);
			System.out.println("현재 "+ hero.name + "의 HP : " + hero.hp);
			System.out.println("현재 "+ hero.name + "의 MP : "  + hero.mp);
			System.out.println("현재 "+ hero.name + "의 경험치 : "  + hero.experience);
			System.out.println("현재 "+ hero.name + "의 돈 : "  + hero.money + "원");
			System.out.println("*********************");
			
			System.out.println("1. 사냥터");
			System.out.println("2. 무기 상점");
			System.out.println("3. 포션 상점");
			System.out.printf("입장할 장소를 입력하세요. : ");
			num = sc.nextInt();
			
			if(num == 1) {
				
				Monster monster = new Monster();
				System.out.println("사냥터에 입장하였습니다.");
				System.out.println("1. 너구리");
				System.out.println("2. 살쾡이");
				System.out.println("3. 들개");
				System.out.println("4. 멧돼지");
				System.out.printf("입장할 장소를 입력하세요. : ");
				num = sc.nextInt();
				
				if(num == 1) {
					
					monster = new Racoon();
					monster.name = "너구리";
					monster.hp = 100;
					monster.mp = 0;
					monster.level = 1;
					monster.power = 20;
					monster.defense = 5;
					monster.money = 10;
					monster.experience = 10;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				
				if(num == 2) {
					
					monster = new WildCat();
					monster.name = "살쾡이";
					monster.hp = 2000;
					monster.mp = 0;
					monster.level = 5;
					monster.power = 100;
					monster.defense = 20;
					monster.money = 30;
					monster.experience = 50;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				
				if(num == 3) {
					
					monster = new WildDog();
					monster.name = "들개";
					monster.hp = 3000;
					monster.mp = 0;
					monster.level = 15;
					monster.power = 300;
					monster.defense = 30;
					monster.money = 50;
					monster.experience = 100;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				
				if(num == 4) {
					
					monster = new WildPig();
					monster.name = "멧돼지";
					monster.hp = 10000;
					monster.mp = 0;
					monster.level = 30;
					monster.power = 1000;
					monster.defense = 80;
					monster.money = 200;
					monster.experience = 300;
					System.out.println(monster.name + "과 전투를 시작합니다.");
				}
				
				while(true) {
					
					System.out.println(hero.name + "의 공격입니다.");
					monster.attacked(hero.attack());
					
					if(monster.hp <= 0) {
						
						System.out.println(monster.name + "가 죽었습니다.");
						hero.experience += monster.experience;
						hero.money += monster.money;
						break;
					}
					
					System.out.println(monster.name + "의 공격입니다.");
					hero.attacked(monster.attack());
					
					if(hero.hp <= 0) {
						
						System.out.println(hero.name + "이 죽었습니다.");
						hero.hp = 1;
						System.out.println(hero.name + "이 체력" + hero.hp + "으로 부활했습니다.");
						break;
					}
				}
			}else if(num == 2) {
				
				WeaponStore weaponstore = new WeaponStore();
				System.out.println("무기 상점에 입장하였습니다.");
				System.out.println("1. 공동 무기 (50원)");
				System.out.println("2. 공동 방패 (50원)");
				System.out.println("현재 돈이 " + hero.money  + "있습니다.");
				System.out.printf("원하시는 물건을 입력하세요. : ");
				
				num = sc.nextInt();
				int temp = hero.money;
				
				if((hero.money = weaponstore.show(hero.money,num)) != -1) {
					
					System.out.println("구입이 완료되었습니다.");
					
					if(num == 1) {
						hero.power += 5;
					}
					
					if(num == 2) {
						hero.defense += 5;
						
					}
					
					System.out.println(temp + "원 남았습니다.");
					
				}else {
					System.out.println("돈이 부족합니다.");
					System.out.println(temp + "원 남았습니다.");
				}
			}else if(num == 3) {
				
				PotionStore potionstore = new PotionStore();
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println("1. 힘 증강 포션 (30원)");
				System.out.println("2. 방어력 증강 포션 (30원)");
				System.out.println("3. 경험치 증강 포션 (100원)");
				System.out.println("4. HP 증강 포션 (10원)");
				System.out.println("5. MP 증강 포션 (10원)");
				System.out.printf("원하시는 물건을 입력하세요. : ");
				
				num = sc.nextInt();
				int temp = hero.money;
				
				if((hero.money = potionstore.show(hero.money,num)) != -1) {
					
					System.out.println("구입이 완료되었습니다.");
					
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
					
					System.out.println(temp + "원 남았습니다.");
					
				}else {
					System.out.println("돈이 부족합니다.");
					System.out.println(temp + "원 남았습니다.");
				}
			}
			
			if(hero.experience  >= hero.level * 80) {
				
				hero.level += 1;
				System.out.println(hero.name + "의 레벨이" + hero.level + "이 되었습니다.");
				hero.money += hero.level * 50;
				System.out.println("레밸업 기념으로 돈이 " + hero.level * 50 + "원 증가하여 ");
				System.out.println(hero.money + "원이 되었습니다.");
				hero.experience = 0;
			}
			
		}
	}
}
				
				
				
				
				
				