package de.dhbw.tinf20.pattern.singleton;

public final class RandomnessSingleton {

	//private static MySingleton instance = new MySingleton();
	private static RandomnessSingleton instance;

	private RandomnessSingleton() {
		super();
//		try {
//			Thread.sleep(1000L);
//		} catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
//		}
	}

	public static synchronized RandomnessSingleton getInstance() {
		if (instance == null) {
			instance = new RandomnessSingleton();
		}
		return instance;
	}
	
	public int getZufallszahl() {
		return hashCode();
	}
}