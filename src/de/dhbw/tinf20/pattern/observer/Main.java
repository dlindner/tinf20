package de.dhbw.tinf20.pattern.observer;

public class Main {

	public static void main(String[] args) {
		KonkretesSubjekt zustandsobjekt = new KonkretesSubjekt();
		KonkreterBeobachter ersteBeobachter = new KonkreterBeobachter(zustandsobjekt);
		zustandsobjekt.meldeAn(ersteBeobachter);
		
		zustandsobjekt.benachrichtige();
	}
}
