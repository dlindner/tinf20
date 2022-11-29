package de.dhbw.tinf20.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subjekt {
	
	private final List<Beobachter> angemeldeteBeobachter;
	
	public Subjekt() {
		super();
		this.angemeldeteBeobachter = new ArrayList<>();
	}
	
	public void meldeAn(Beobachter b) {
		this.angemeldeteBeobachter.add(b);
	}
	
	public void meldeAb(Beobachter b) {
		this.angemeldeteBeobachter.remove(b);
	}
	
	protected void benachrichtige() {
		System.out.println("Es gibt gerade " + this.angemeldeteBeobachter.size() + " angemeldete Beobachter");
		for (Beobachter each : this.angemeldeteBeobachter) {
			each.aktualisiere();
		}
//		this.angemeldeteBeobachter.forEach(b -> b.aktualisiere());
//		this.angemeldeteBeobachter.forEach(Beobachter::aktualisiere);
	}

}
