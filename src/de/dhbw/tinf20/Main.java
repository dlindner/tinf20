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
		
		familie.forEach(
				Familienmitglied::essenswunsch);
//		for (Familienmitglied each : familie) {
//			each.essenswunsch();
//		}
		
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
