package de.dhbw.tinf20.pattern.observer;

public class KonkretesSubjekt extends Subjekt {
	
	private int subjektZustand;
	
	public KonkretesSubjekt() {
		super();
		this.subjektZustand = 0;
	}
		
	public int gibZustand() {
		return this.subjektZustand;
	}
}
