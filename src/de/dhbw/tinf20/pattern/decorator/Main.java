package de.dhbw.tinf20.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Textanzeige anzeige = new Textanzeige();
		ScrollDekorierer deko1 = new ScrollDekorierer(anzeige);
		ScrollDekorierer deko2 = new ScrollDekorierer(deko1);
		RahmenDekorierer deko3 = new RahmenDekorierer(deko2, 1);
		RahmenDekorierer deko4 = new RahmenDekorierer(deko3, 1);
		RahmenDekorierer deko5 = new RahmenDekorierer(deko4, 1);
		
		VisuelleKomponente auﬂen = deko5;
		auﬂen.zeichne();
	}
}
