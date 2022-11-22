package de.dhbw.tinf20.pattern.singleton;

public enum KorrektesSingleton implements Zufallsgenerator {

	instance;
	
	private KorrektesSingleton() {
	}
	
	@Override
	public int getZufallszahl() {
		return hashCode();
	}
}
