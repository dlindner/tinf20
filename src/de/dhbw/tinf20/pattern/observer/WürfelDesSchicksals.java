package de.dhbw.tinf20.pattern.observer;

import java.util.Random;

public class W�rfelDesSchicksals extends Subjekt {
	
	private int letzteWurf;
	
	public W�rfelDesSchicksals() {
		super();
		this.letzteWurf = 0;
	}
	
	public void w�rfle() {
		this.letzteWurf = new Random().nextInt(6) + 1;
		if (this.letzteWurf == 6) {
			benachrichtige();
		}
	}
		
	public int gibZustand() {
		return this.letzteWurf;
	}
}
