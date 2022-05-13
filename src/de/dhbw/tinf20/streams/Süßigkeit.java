package de.dhbw.tinf20.streams;

public class Süßigkeit {

	private String name;
	private int gewicht;

	public Süßigkeit(String name, int gewicht) {
		super();
		this.name = name;
		this.gewicht = gewicht;
	}
	
	public String name() {
		return name;
	}
	
	public int gewicht() {
		return gewicht;
	}
}
