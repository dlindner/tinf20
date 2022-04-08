package de.dhbw.tinf20;

public class Familienfeier {

	public Familienfeier() {
		super();
	}
	
	public void nehmeTeil(Vater person) {
		System.out.println("T2: Hässlich hier");
	}
	
	public void nehmeTeil(Onkel person) {
		System.out.println("T3: Oha, bist du aber groß geworden!");
	}
	
	public void nehmeTeil(Familienmitglied person) {
		System.out.println("T1: Nett hier, aber waren Sie schonmal...");
	}
}
