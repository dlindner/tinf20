package de.dhbw.tinf20.pattern.observer;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.naming.NoPermissionException;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		WürfelDesSchicksals würfel = new WürfelDesSchicksals();
		Spielleiter ersteBeobachter = new Spielleiter("Tom", würfel);
		würfel.meldeAn(ersteBeobachter);
		
		LangsamerSpielleiter speedi = new LangsamerSpielleiter();
		würfel.meldeAn(speedi);
		//würfel.meldeAn(new LangsamerSpielleiter());
		
		würfel.meldeAn(new TrollendenSpielleiter());
		
		Spielleiter zweiterBeobachter = new Spielleiter("Jerry", würfel);
		würfel.meldeAn(zweiterBeobachter);
		
		ExecutorService parallelität = Executors.newFixedThreadPool(2, new ThreadFactory() {
			@Override
			public Thread newThread(Runnable r) {
				System.out.println("************** Erstelle Ersatz-Thread");
				Thread result = new Thread(r);
				result.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
					@Override
					public void uncaughtException(Thread t, Throwable e) {
						System.out.println(">>> Uncaught Exception in Thread " + t.getId() + ": " + e.getClass().getSimpleName());
					}
				});
				return result;
			}
		});
		
		while (true) {
			parallelität.submit(() -> {
//				try {
					würfel.würfle();
//				} catch (NullPointerException e) {
//					e.printStackTrace();
//				}
				System.out.print(".");
			});
			Thread.sleep(100L);
		}
	}
}
