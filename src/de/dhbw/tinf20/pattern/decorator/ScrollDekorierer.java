package de.dhbw.tinf20.pattern.decorator;

public class ScrollDekorierer extends Dekorierer {

	public ScrollDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		System.out.print(">>>");
		super.zeichne();
		System.out.print("<<<");
	}
}
