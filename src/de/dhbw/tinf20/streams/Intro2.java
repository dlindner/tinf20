package de.dhbw.tinf20.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intro2 {

	public static void main(String[] args) {
		List<String> ergebnis = Stream.of(
				  new S��igkeit("Weingummi", 180),
				  new S��igkeit("Lakritzschnecken", 240),
				  new S��igkeit("Gummib�rchen", 40))
		      .filter((S��igkeit x) -> x.gewicht() > 100)
		      .map(s -> s.name())
		      .sorted()
		      .collect(Collectors.toList());
		System.out.println(ergebnis);
	}
}
