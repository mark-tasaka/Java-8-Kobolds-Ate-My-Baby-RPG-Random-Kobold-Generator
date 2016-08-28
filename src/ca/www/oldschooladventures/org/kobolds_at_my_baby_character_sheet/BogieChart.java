/**
 * 
 */
package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * BogieChart - Enumerator for Random -Bogies for KOBOLDS ATE MY BABY! SUPER DELUXX EDITION
 * 
 * Game Designed by Chris O'Neill and Dan Landis, 2005 (interior book art illustrated
 * by John Kovalic).
 * 
 * Please see http://www.koboldsatemybaby.com/ for more information about KOBOLDS ATE MY BABY! 
 * SUPER DELUXX EDITION
 * 
 * @author Mark Tasaka (www.oldschooladventures.org)
 * @version 1.01 (2016-08-16)
 */
public enum BogieChart{
	
	ANGRY_FRIENDS,
	ANIMAL_FOE,
	FOUL_SMELLING,
	HUNGRY,
	IN_HEAT,
	TASTES_LIKE_BABY,
	FEARLESS,
	TASTE_LIKE_CHICKEN;
	
	/**
	 * Method use to generate Random Bogie
	 */
	private static final List<BogieChart> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();

	public static BogieChart randomBogie(Random rand)  {
	return VALUES.get(rand.nextInt(SIZE-2));
	}

	
	/**
	 * koboldBogieName - how the -Bogie will appear on the Character Sheet
	 * 
	 * 
	 * @param bogieName
	 * @return
	 */
	public static String koboldBogieName(BogieChart bogieName){
		switch(bogieName){
		
		case	ANGRY_FRIENDS	: return	"-Angry Friends"	;
		case	ANIMAL_FOE	: return	"-Animal Foe"	;
		case	FOUL_SMELLING	: return	"-Foul Smelling"	;
		case	HUNGRY	: return	"-Hungry"	;
		case	IN_HEAT	: return	"-In Heat"	;
		case	TASTES_LIKE_BABY	: return	"-Tastes Like Baby"	;
		case	FEARLESS	: return	"-Fearless"	;
		case	TASTE_LIKE_CHICKEN	: return	"-Taste Like Chicken"	;

		}
		return null;
		}

	/**
	 * koboldBogieDescription - provides a description of what the -Bogie does.  This
	 * is displayed under Special on the Character Sheet.
	 * 
	 * @param bogieDescription
	 * @return
	 */
	public static String koboldBogieDescription(BogieChart bogieDescription){
		switch(bogieDescription){
		
		case	ANGRY_FRIENDS	: return	"-Angry Friends: No additional Negative Qualities.\n"	;
		case	ANIMAL_FOE	: return	"-Animal Foe: All Animals within your map square will try to leave,"
				+ "and will attack YOU if you bother them.\n"	;
		case	FOUL_SMELLING	: return	"-Foul Smelling: Anything in your map square will Notice YOU.\n"	;
		case	HUNGRY	: return	"-Hungry: Each time YOU come across something edible, YOU have to make an EGO"
				+ "\nroll or go into a feed frenzy.  While in this frenzy, your EGO is reduce by 1 Die.\n"	;
		case	IN_HEAT	: return	"-In Heat: Each time YOU encounter an Adult Human (Elf, etc.) YOU have to make an Ego"
				+ "\nroll or attempt to HUMP the human's (elf, etc.) leg.  Each turn spent HUMPING reduces your Ego by 1 Die.\n"	;
		case	TASTES_LIKE_BABY	: return	"-Tastes Like Baby: If YOU are wounded, every critter or kobold in YOUR map square"
				+ "\nmust make an Ego roll at 3 Dice (kobolds with the -Hungry Bogie must make a 5 Dice Ego roll instead).  Failed"
				+ "\nrolls result in the critter or kobold developing a desire to eat YOU.\n"	;
		case	FEARLESS	: return	"-Fearless: If the YOU are being exceptionally cowardly, the MAYOR may make YOU"
				+ "\ntake a KOBOLD HORRIBLE DEATH CHECK.\n"	;
		case	TASTE_LIKE_CHICKEN	: return	"-Tastes Like Chicken: Should YOU become wounded, all Critters in YOUR square"
				+ "\nmust make a Ego roll with 1 Die. A failure will result in the critter developing the desire to eat YOU.\n"	;

		
		}
		return null;
		}
	
}
