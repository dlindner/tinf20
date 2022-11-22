package de.dhbw.tinf20.pattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService threadpool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			threadpool.submit(Main::vorgang);
		}
		threadpool.shutdown();
	}
	
	public static void vorgang() {
		KorrektesSingleton verwendung = KorrektesSingleton.instance;
		//RandomnessSingleton verwendung = RandomnessSingleton.getInstance();
		System.out.println(
			Thread.currentThread().getId() + ": " + verwendung.getZufallszahl()
		);
	}
}
