package de.dhbw.tinf20.cleanarchitecture.inversion.b;

import de.dhbw.tinf20.cleanarchitecture.inversion.a.Schaltbar;

public class SchaltbareLampeAdapter implements Schaltbar {
	
	private final Lampe lampe;

	public SchaltbareLampeAdapter(Lampe lampe) {
		super();
		this.lampe = lampe;
	}
	
	@Override
	public void anschalten() {
		this.lampe.anknipsen();
	}
	
	@Override
	public void ausschalten() {
		this.lampe.anknipsen();
	}
}
