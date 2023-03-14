package de.dhbw.tinf20.mock;

public class Auto {

	private int alter;
	private Motor motor;
	
	public Auto(
		int alter,
		Motor motor
	) {
		super();
		this.alter = alter;
		this.motor = motor;
	}
	
	public boolean istMotorwarnleuchteAn() {
		return (this.alter > 10) || this.motor.istDefekt();
	}
}
