package _02_smurf;

public class SmurfsRunner {
public static void main(String[] args) {
	Smurf Bob = new Smurf("Bob");
	Bob.eat();
	Bob.getName();
	Smurf Papa = new Smurf("Papa");
	Papa.getName();
	Papa.getHatColor();
	Papa.isGirlOrBoy();
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();
	Smurfette.getHatColor();
	Smurfette.isGirlOrBoy();
}
}
