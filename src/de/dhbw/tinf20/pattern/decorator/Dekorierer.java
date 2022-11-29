package de.dhbw.tinf20.pattern.decorator;

public abstract class Dekorierer implements VisuelleKomponente {
	
	private final VisuelleKomponente nachfolger;
	
	public Dekorierer(VisuelleKomponente nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}

	@Override
	public void zeichne() {
		this.nachfolger.zeichne();
	}
}
