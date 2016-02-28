package org.kata.yahtzee.test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.kata.yahtzee.Dice;

public class DiceTest {

	private Dice dice;

	@Before
	public void setUp() {
		dice = new Dice();
	}

	@Test
	public void testRollTheDice() {
		assertThat(dice.rollTheDice(),anyOf(is(1),is(2),is(3),is(4),is(5),is(6)));
	}
	
	@Test
	public void testInitialRollTheDice()
	{
		int[] actual = dice.initialRoll();
		assertEquals(5, actual.length);
		for(int i=0; i<5; i++)
		{
			assertThat(actual[i],anyOf(is(1),is(2),is(3),is(4),is(5),is(6)));
		}
	}
	
	@Test
	public void testDiceValues()
	{
		assertArrayEquals(dice.initialRoll(), dice.diceValues());
	}

}
