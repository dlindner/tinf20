package de.dhbw.tinf20.ddd.valueobject;

import java.util.Objects;

public final class Holzst�ck {

	private final int l�ngeInZentimeter;
	private final int breiteInZentimeter;
	
	public Holzst�ck(final int l�nge, final int breite) {
		super();
		l�ngeInZentimeter = l�nge;
		breiteInZentimeter = breite;
	}
	
	public boolean istGleichZu(Holzst�ck anderes) {
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(breiteInZentimeter, l�ngeInZentimeter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Holzst�ck)) {
			return false;
		}
		Holzst�ck other = (Holzst�ck) obj;
		return breiteInZentimeter == other.breiteInZentimeter && l�ngeInZentimeter == other.l�ngeInZentimeter;
	}
}
