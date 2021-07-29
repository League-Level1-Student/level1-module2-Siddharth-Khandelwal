package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	public static void main(String[] args) {
		
	
Kettle Bob = new Kettle();
TeaBag Jeff = new TeaBag("Mint");
Cup Matt = new Cup();

	Bob.boil();
	Matt.makeTea(Jeff, Bob.getWater());
	}
	
}
