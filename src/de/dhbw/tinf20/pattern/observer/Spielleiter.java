package de.dhbw.tinf20.pattern.observer;

public class Spielleiter implements Beobachter {
	
	private final W�rfelDesSchicksals subjekt;
	private String name;

	public Spielleiter(String name, final W�rfelDesSchicksals subjekt) {
		super();
		this.name = name;
		this.subjekt = subjekt;
	}
	
	@Override
	public void aktualisiere() {
		int neuerZustand = this.subjekt.gibZustand();
		System.out.println(this.name + " sieht neues Schicksal: " + neuerZustand);
	}
}
