package de.dhbw.tinf20.ddd.valueobject;

public class Main {

	public static void main(String[] args) {
		Holzst�ck st�ck0 = new Holzst�ck(5, 5);
		Holzst�ck st�ck1 = new Holzst�ck(5, 5);
		
		boolean gleich = st�ck0.equals(st�ck1);
		System.out.println(gleich);
		assert (gleich == true);
	}
}
