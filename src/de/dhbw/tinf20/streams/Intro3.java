package de.dhbw.tinf20.streams;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Intro3 {

	public static void main(String[] args) {
		Supplier<EkligeS��igkeit> derAndereOnkel = new Supplier<EkligeS��igkeit>() {
			public EkligeS��igkeit get() {
				return new EkligeS��igkeit("Marzipan", 20);
			}
		};

		Stream<S��igkeit> f�llhorn = Stream.generate(() -> new EkligeS��igkeit("Marzipan", 20));
		
		Optional<S��igkeit> maybeS��igkeit = f�llhorn
			.findFirst();
			//.forEach(marzipan -> System.out.println("Hmm, lecker " + marzipan.name()));
		
		maybeS��igkeit.ifPresent(s -> System.out.println("Hmm, lecker " + s.name()));
		maybeS��igkeit.map(s -> s.name());
		maybeS��igkeit.filter(s -> s.name().equals("Marzipan"));
	}
}
