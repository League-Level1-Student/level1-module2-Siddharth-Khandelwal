package _02_smurf;

public class SmurfsRunner {
public static void main(String[] args) {
	Smurf Bob = new Smurf("Bob");
	Bob.eat();
	Bob.getName();
	Smurf Papa = new Smurf("Papa");
	Papa.getName();
	Papa.getHatColor();
	System.out.println("Papa smurfs' hat is "+Papa.getHatColor() );
	Papa.isGirlOrBoy();
	System.out.println("Papa smurf is a "+Papa.isGirlOrBoy());
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();
	Smurfette.getHatColor();
	System.out.println("Smurfette's hat is "+Smurfette.getHatColor());
	Smurfette.isGirlOrBoy();
	System.out.println("Smurfette is a "+Smurfette.isGirlOrBoy());
}
}
