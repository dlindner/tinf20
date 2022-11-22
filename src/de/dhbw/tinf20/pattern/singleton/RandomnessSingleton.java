package de.dhbw.tinf20.pattern.singleton;

public final class RandomnessSingleton implements Zufallsgenerator {

//	private static RandomnessSingleton instance = new RandomnessSingleton();
	private static RandomnessSingleton instance;
	private static final Object lock = new Object();

	private RandomnessSingleton() {
		super();
//		try {
//			Thread.sleep(1000L);
//		} catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
//		}
	}

	public static RandomnessSingleton getInstance() {
		synchronized (lock) {
			if (instance == null) {
				instance = new RandomnessSingleton();
			}
			return instance;
		}
	}
	
	@Override
	public int getZufallszahl() {
		return hashCode();
	}
}