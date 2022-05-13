package de.dhbw.tinf20.streams;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Intro3 {

	public static void main(String[] args) {
		Supplier<EkligeSüßigkeit> derAndereOnkel = new Supplier<EkligeSüßigkeit>() {
			public EkligeSüßigkeit get() {
				return new EkligeSüßigkeit("Marzipan", 20);
			}
		};

		Stream<Süßigkeit> füllhorn = Stream.generate(() -> new EkligeSüßigkeit("Marzipan", 20));
		
		Optional<Süßigkeit> maybeSüßigkeit = füllhorn
			.findFirst();
			//.forEach(marzipan -> System.out.println("Hmm, lecker " + marzipan.name()));
		
		maybeSüßigkeit.ifPresent(s -> System.out.println("Hmm, lecker " + s.name()));
		maybeSüßigkeit.map(s -> s.name());
		maybeSüßigkeit.filter(s -> s.name().equals("Marzipan"));
	}
}
