package de.dhbw.tinf20.cleanarchitecture.inversion.a;

public class Schalter {
	
    private final Schaltbar lampe;
    private boolean gedrueckt = false;

    public Schalter(Schaltbar lampe) {
        this.lampe = lampe;
    }

    public void drueckeSchalter() {
        if (this.gedrueckt) {
            lampe.ausschalten();
            this.gedrueckt = false;
            return;
        }
        lampe.anschalten();
        this.gedrueckt = true;
    }
}