package de.dhbw.tinf20.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Textanzeige anzeige = new Textanzeige();
		ScrollDekorierer deko1 = new ScrollDekorierer(anzeige);
		RahmenDekorierer deko2 = new RahmenDekorierer(deko1, 3);
		
		VisuelleKomponente auﬂen = deko2;
		auﬂen.zeichne();
	}
}
