package de.dhbw.tinf20.pattern.observer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		WürfelDesSchicksals würfel = new WürfelDesSchicksals();
		Spielleiter ersteBeobachter = new Spielleiter(würfel);
		würfel.meldeAn(ersteBeobachter);
		
		while (true) {
			würfel.würfle();
			System.out.print(".");
			Thread.sleep(100L);
		}
	}
}
