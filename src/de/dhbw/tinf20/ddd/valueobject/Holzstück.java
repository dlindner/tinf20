package de.dhbw.tinf20.ddd.valueobject;

import java.util.Objects;

public final class Holzstück {

	private final int längeInZentimeter;
	private final int breiteInZentimeter;
	
	public Holzstück(final int länge, final int breite) {
		super();
		längeInZentimeter = länge;
		breiteInZentimeter = breite;
	}
	
	public boolean istGleichZu(Holzstück anderes) {
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(breiteInZentimeter, längeInZentimeter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Holzstück)) {
			return false;
		}
		Holzstück other = (Holzstück) obj;
		return breiteInZentimeter == other.breiteInZentimeter && längeInZentimeter == other.längeInZentimeter;
	}
}
