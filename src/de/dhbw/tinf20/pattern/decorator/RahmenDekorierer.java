package de.dhbw.tinf20.pattern.decorator;

public class RahmenDekorierer extends Dekorierer {

	private int rahmenbreite;

	public RahmenDekorierer(
		VisuelleKomponente nachfolger,
		int rahmenbreite
	) {
		super(nachfolger);
		this.rahmenbreite = rahmenbreite;
	}
	
	@Override
	public void zeichne() {
		for (int i = 0; i < this.rahmenbreite; i++) {
			System.out.print("|");
		}
		super.zeichne();
	}
}
