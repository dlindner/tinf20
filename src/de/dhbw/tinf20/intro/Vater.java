package de.dhbw.tinf20.intro;

public class Vater extends Familienmitglied {
	
	public static final String S2_SLUSHY_MIT_EIS = "S2: Sushi mit Eis";

	public Vater() {
		super();
	}
	
	@Override
	public void essenswunsch() {
		System.out.println(S2_SLUSHY_MIT_EIS);
	}
}
