package de.dhbw.tinf20.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralTest {

	@Test
	public void converts_1() {
		//int given = 1;
		RomanNumeral target = new RomanNumeral(); // Arrange
		String actual = target.convert(1); // Act
		assertThat(actual, is("I")); // Assert
	}
	
	@Test
	public void converts_2() {
		RomanNumeral target = new RomanNumeral(); // Arrange
		String actual = target.convert(2); // Act
		assertThat(actual, is("II")); // Assert
	}

	@Test
	public void converts_3() {
		RomanNumeral target = new RomanNumeral(); // Arrange
		String actual = target.convert(3); // Act
		assertThat(actual, is("III")); // Assert
	}
	
	@Test
	public void converts_4() {
		RomanNumeral target = new RomanNumeral(); // Arrange
		String actual = target.convert(4); // Act
		assertThat(actual, is("IV")); // Assert
	}
	
	@Test
	public void converts_5() {
		RomanNumeral target = new RomanNumeral(); // Arrange
		String actual = target.convert(5); // Act
		assertThat(actual, is("V")); // Assert
	}
	
	@Test
	public void converts_6() {
		RomanNumeral target = new RomanNumeral(); // Arrange
		String actual = target.convert(6); // Act
		assertThat(actual, is("VI")); // Assert
	}

	@Test
	public void converts_9() {
		RomanNumeral target = new RomanNumeral(); // Arrange
		String actual = target.convert(9); // Act
		assertThat(actual, is("IX")); // Assert
	}

}
