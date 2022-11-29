package de.dhbw.tinf20.pattern.observer;

public class LangsamerSpielleiter implements Beobachter {
	
	@Override
	public void aktualisiere() {
		System.out.println("H‰‰h?");
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Achso!");
	}
}
