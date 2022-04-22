package de.dhbw.tinf20.calisthenics;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		System.out.println("Erste Zeile");
		int wert = 100;
		for (int i = 0; i < 400; i++) {
			wert += i;
			reagiereAufHohenWert(wert);
		}
		
		int wert1 = 100;
		int wert2 = 200;
		
		IntStream.of(wert1)
				 .filter(w -> w < wert2)
				 .findFirst()
				 .ifPresent(w -> System.out.println("Kleiner"));
		
		//wert1 < wert2 ? then : else
		if (wert1 < wert2) {
			;
		}		
	}

	private static void reagiereAufHohenWert(int wert) {
		// short-circuit evaluation
		//((wert > 500) && System.out.println("Zuviel des Guten!"));
	}
}
