package de.dhbw.tinf20.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Textanzeige anzeige = new Textanzeige();
		VisuelleKomponente au�en = anzeige;
		au�en.zeichne();
	}
}
