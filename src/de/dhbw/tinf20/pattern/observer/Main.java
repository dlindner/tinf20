package de.dhbw.tinf20.pattern.observer;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.naming.NoPermissionException;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		W�rfelDesSchicksals w�rfel = new W�rfelDesSchicksals();
		Spielleiter ersteBeobachter = new Spielleiter("Tom", w�rfel);
		w�rfel.meldeAn(ersteBeobachter);
		
		LangsamerSpielleiter speedi = new LangsamerSpielleiter();
		w�rfel.meldeAn(speedi);
		//w�rfel.meldeAn(new LangsamerSpielleiter());
		
		w�rfel.meldeAn(new TrollendenSpielleiter());
		
		Spielleiter zweiterBeobachter = new Spielleiter("Jerry", w�rfel);
		w�rfel.meldeAn(zweiterBeobachter);
		
		ExecutorService parallelit�t = Executors.newFixedThreadPool(2, new ThreadFactory() {
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
			parallelit�t.submit(() -> {
//				try {
					w�rfel.w�rfle();
//				} catch (NullPointerException e) {
//					e.printStackTrace();
//				}
				System.out.print(".");
			});
			Thread.sleep(100L);
		}
	}
}
