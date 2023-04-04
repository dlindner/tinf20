package de.dhbw.tinf20.refactoring.rewe;

import java.util.Optional;

public class AngleProvider {

	private Sensor sensor;
	
	int getAngle() throws RuntimeException {
		if (sensor.isWorking()) {
			return sensor.getAngle();
		}
		//return -1;
		throw new RuntimeException("Fehler!");
	}
	
	// Maybe, Promise
	Optional<Integer> maybeGetAngle() {
		if (sensor.isWorking()) {
			return Optional.of(sensor.getAngle());
		}
		return Optional.empty();
	}
	
	Optional<String> findTextInDatabase(int index) throws RuntimeException {
		// Bug!
		return null;
	}
}
