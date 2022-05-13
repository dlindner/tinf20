package de.dhbw.tinf20.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Intro {

	public static void main(String[] args) {
		Random rng = new Random();
		
		Stream<Integer> zufall = IntStream.generate(rng::nextInt).mapToObj(Integer::valueOf);
		zufall
			.limit(10)
			.collect(Collectors.toList());
		
		Stream<Integer> stream = IntStream.range(0, 1_000_000).mapToObj(Integer::valueOf);
		List<Integer> ergebnis = stream 
				//Stream.of(1, 2, 3)
	      .filter(n -> (n % 2) == 0)
	      .filter(n -> n > 2)
	      .sorted((i, j) -> -1 * Integer.compare(i, j))
	      .collect(Collectors.toList());
		System.out.println(ergebnis);
	}
}
