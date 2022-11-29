package de.dhbw.tinf20.pattern.observer;

import java.util.Random;

public class WürfelDesSchicksals extends Subjekt {
	
	private int letzteWurf;
	
	public WürfelDesSchicksals() {
		super();
		this.letzteWurf = 0;
	}
	
	public void würfle() {
		this.letzteWurf = new Random().nextInt(6) + 1;
		if (this.letzteWurf == 6) {
			benachrichtige();
		}
	}
		
	public int gibZustand() {
		return this.letzteWurf;
	}
}
