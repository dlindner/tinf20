package de.dhbw.tinf20;

import java.util.List;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(String[] arguments) {
		Vater steafan = new Vater();
		Onkel onkel = new Onkel();
		
		List<Familienmitglied> familie = List.of(
				steafan,
				onkel);
		
		steafan.essenswunsch();
		onkel.essenswunsch();
		
		for (Familienmitglied each : familie) {
			each.essenswunsch();
		}
	}
}
