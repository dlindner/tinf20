package de.dhbw.tinf20.pattern.decorator;

public class Textanzeige implements VisuelleKomponente {
	
	@Override
	public void zeichne() {
		System.out.print("Lorem Ipsum");
	}
}
