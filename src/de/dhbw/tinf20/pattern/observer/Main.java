package de.dhbw.tinf20.pattern.observer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		W�rfelDesSchicksals w�rfel = new W�rfelDesSchicksals();
		Spielleiter ersteBeobachter = new Spielleiter(w�rfel);
		w�rfel.meldeAn(ersteBeobachter);
		
		while (true) {
			w�rfel.w�rfle();
			System.out.print(".");
			Thread.sleep(100L);
		}
	}
}
