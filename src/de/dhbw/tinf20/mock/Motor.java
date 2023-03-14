package de.dhbw.tinf20.mock;

import java.util.Random;

public class Motor {

	public Motor() {
		super();
	}

	public boolean istDefekt() {
		return new Random().nextBoolean();
	}
}
