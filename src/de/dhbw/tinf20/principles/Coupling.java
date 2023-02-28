package de.dhbw.tinf20.principles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Coupling {

	public static void main(String[] args) {
		ArrayList<String> data0 = new ArrayList<>(); // <- stark gekoppelt an Datentyp
		List<String> data1 = new ArrayList<>();
		Collection<String> data2 = new ArrayList<>();
		Iterable<String> data3 = new ArrayList<>(); // <- schwach gekoppelt an Datentyp
	}
}
