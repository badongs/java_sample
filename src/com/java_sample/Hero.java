package com.java_sample;

import java.util.Random;

public class Hero {
	private String name;
	private int hp = 100;

	//
	public Hero(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	//
	public void punch(Hero enermy) {
		enermy.hp -= 10;
		System.out.printf("[%s]의 펀치\n", this.name);
		System.out.printf("\t%s: %d/100\n", enermy.name, enermy.hp);

		if (enermy.hp == 0) {
			System.out.println();
			System.out.printf("***** %s의 승리입니다. *****",this.name);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hero arthas = new Hero("아서스");
		Hero leona = new Hero("레오나");

		Random random = new Random();

		while (arthas.hp > 0 && leona.hp > 0) {
			Boolean isArthasTurn = random.nextBoolean();
			Hero attacker = isArthasTurn ? arthas : leona; // 공격자
			Hero defender = isArthasTurn ? leona : arthas; // 방어자

			attacker.punch(defender);
			Thread.sleep(1000);
		}
	}
}
