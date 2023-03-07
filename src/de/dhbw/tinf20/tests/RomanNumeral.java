package de.dhbw.tinf20.tests;

public class RomanNumeral {

	public RomanNumeral() {
		super();
	}

	public String convert(int wert) {
		if (wert > 3) {
			return convert(wert - 3) + "V";
		}
		if (wert > 0) {
			return convert(wert - 1) + "I";
		} else {
			return "";
		}
	}
}
