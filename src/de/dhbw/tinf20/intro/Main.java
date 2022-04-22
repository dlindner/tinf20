package de.dhbw.tinf20.intro;

import java.util.List;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(String[] arguments) {
		Familienmitglied steafan = new Vater();
		Familienmitglied onkel = new Onkel();
		
		List<Familienmitglied> familie = List.of(
				steafan,
				onkel);
		
		steafan.essenswunsch();
		onkel.essenswunsch();
		
//		familie.forEach(
//				Familienmitglied::essenswunsch);
		for (Familienmitglied each : familie) {
			if (each instanceof Vater) {
				((Vater) each).essenswunsch();
			}
			if (each instanceof Onkel) {
				((Onkel) each).essenswunsch();
			}
			each.essenswunsch();
		}
		
		Familienfeier juhu = new Familienfeier();
		
		juhu.nehmeTeil(steafan);
		juhu.nehmeTeil(onkel);
		
		familie.forEach(
				juhu::nehmeTeil);
//		for (Familienmitglied each : familie) {
//			juhu.nehmeTeil(each);
//		}
	}
}
