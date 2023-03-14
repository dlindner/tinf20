package de.dhbw.tinf20.programmentwurf;

public enum Einheit {
	
	kg("Kilogramm"),
	liter("Liter"),
	kilo("Kilogramm"),
	;
	
	private String name;
	
	private Einheit(String name) {
		this.name = name;
	}
	
//	public void changeName(String newName) {
//		this.name = newName;
//	}

}
