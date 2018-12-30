package co.grab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Given the unit test, please write a simple application to make the test pass.
// This is a game call mystery number. Whoever guess and get the mystery number is the loser.
// The program will take in the guessing number and return certain status.
// Status could be the reduced numbers range, invalid, you are the loser, the next player is the loser
// Refer to the unit test for more info

public class MysteryNumberTest {

	@Test
	public void testPlayMysteryNumber() {
		Integer mysteryNumber = 50;
		MysteryNumber unit = new MysteryNumber();
		unit.setMysteryNumber(mysteryNumber);
	
		assertEquals("Invalid", unit.playMysteryNumber(1));
		assertEquals("2 to 100", unit.playMysteryNumber(2));
		assertEquals("10 to 100", unit.playMysteryNumber(10));
		assertEquals("40 to 100", unit.playMysteryNumber(40));
		assertEquals("40 to 80", unit.playMysteryNumber(80));
		assertEquals("40 to 56", unit.playMysteryNumber(56));
		assertEquals("Invalid", unit.playMysteryNumber(90));
		assertEquals("Invalid", unit.playMysteryNumber(20));
		assertEquals("40 to 51", unit.playMysteryNumber(51));
		assertEquals("49 to 51", unit.playMysteryNumber(49));
		assertEquals("You are the loser", unit.playMysteryNumber(50));
		
		mysteryNumber = 1;
		unit.setMysteryNumber(mysteryNumber);
		assertEquals("Invalid", unit.playMysteryNumber(101));
		assertEquals("Invalid", unit.playMysteryNumber(100));
		assertEquals("1 to 99", unit.playMysteryNumber(99));
		assertEquals("The next player is the loser", unit.playMysteryNumber(2));
		
		mysteryNumber = 50;
		unit.setMysteryNumber(mysteryNumber);
		assertEquals("You are the loser", unit.playMysteryNumber(50));
	}
}