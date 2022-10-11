package de.dhbw.tinf20.ddd.valueobject;

public class Main {

	public static void main(String[] args) {
		Holzstück stück0 = new Holzstück(5, 5);
		Holzstück stück1 = new Holzstück(5, 5);
		
		boolean gleich = stück0.equals(stück1);
		System.out.println(gleich);
		assert (gleich == true);
	}
}
