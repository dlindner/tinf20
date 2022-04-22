package de.dhbw.tinf20.varianz;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Number[] ganzzahlen = new Number[] {1, 2, 4, 8, 16};
		Double kommazahlenbereich = 1.32D;
		
		Number[] zahlen = ganzzahlen;
		// covarianz
		zahlen[0] = kommazahlenbereich;
		// contravarianz
		//zahlen[1] = new Object();
		// invarianz
		zahlen[2] = (Number) 24;
		
		for (Number each : zahlen) {
			System.out.println(each);
		}
		
		List<Integer> ganz2 = new ArrayList<>();
		ganz2.add(1);
		ganz2.add(2);
		ganz2.add(4);
		ganz2.add(8);
		ganz2.add(16);
		
		List<Object> objekte = new ArrayList<>();
		objekte.add(new Object());
		objekte.add(new Object());
		 
		List<Number> invariant = new ArrayList<>();
		invariant.add(Integer.valueOf(132));
		// geht nicht
		//invariant = ganz2;
		
		// covariant
		List<? extends Number> zahlen2 = ganz2;
		List<? extends Object> everything = zahlen2;
		
		// contravariant
		List<? super Number> contra = objekte;
		
		// geht nicht
		//contra = zahlen2;
		contra = invariant;
		
		for (Object each : contra) {
			System.out.println(each);
		}
	}
}
