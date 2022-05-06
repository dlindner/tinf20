package de.dhbw.tinf20.memorymodel.performance;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	private static final int dataSize = 50_000;
	
    public static void main(
    		final String[] arguments) {
    	
    	final int[] data = new int[dataSize];

        final Random random = new Random(132);
        for (int i = 0; i < data.length; ++i) {
            data[i] = random.nextInt() % 256;
        }

        final long start = System.nanoTime();
        long sum = 0;
        
        // Performance-Optimierung
        Arrays.sort(data);

        for (int j = 0; j < data.length; ++j) {
        	for (int i = 0; i < 100_000; ++i) {
                if (data[j] >= 128) {
                    sum += data[j];
                }
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("duration (sec): " + (System.nanoTime() - start) / 1E9);
    }
}