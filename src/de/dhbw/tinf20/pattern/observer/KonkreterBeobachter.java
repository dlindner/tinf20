package de.dhbw.tinf20.pattern.observer;

public class KonkreterBeobachter implements Beobachter {
	
	private final KonkretesSubjekt subjekt;

	public KonkreterBeobachter(final KonkretesSubjekt subjekt) {
		super();
		this.subjekt = subjekt;
	}
	
	@Override
	public void aktualisiere() {
		int neuerZustand = this.subjekt.gibZustand();
		System.out.println("Neuer Zustand: " + neuerZustand);
	}
}
