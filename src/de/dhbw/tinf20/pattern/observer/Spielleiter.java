package de.dhbw.tinf20.pattern.observer;

public class Spielleiter implements Beobachter {
	
	private final WürfelDesSchicksals subjekt;

	public Spielleiter(final WürfelDesSchicksals subjekt) {
		super();
		this.subjekt = subjekt;
	}
	
	@Override
	public void aktualisiere() {
		int neuerZustand = this.subjekt.gibZustand();
		System.out.println("Neues Schicksal: " + neuerZustand);
	}
}
