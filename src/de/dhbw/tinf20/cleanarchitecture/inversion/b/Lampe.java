package de.dhbw.tinf20.cleanarchitecture.inversion.b;

/**
 * CANNOT BE EDITED
 */
public class Lampe {

	private boolean leuchtet = false;

	public void anknipsen() {
		this.leuchtet = true;
	}

	public void ausknipsen() {
		this.leuchtet = false;
	}
}