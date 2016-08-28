/**
 * 
 */
package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * ArmourChart - Enumerator for Random Armour for KOBOLDS ATE MY BABY! SUPER DELUXX EDITION
 * 
 * Game Designed by Chris O'Neill and Dan Landis, 2005 (interior book art illustrated
 * by John Kovalic).
 * 
 * Please see http://www.koboldsatemybaby.com/ for more information about KOBOLDS ATE MY BABY! 
 * SUPER DELUXX EDITION
 * 
 * @author Mark Tasaka (www.oldschooladventures.org)
 * @version 1.01 (2016-08-14)
 *
 */
public enum ArmourChart {
	
	BIG_SHIELD,
	METAL_POT_HELM,
	BEER_BARREL,
	LEATHER_APRON,
	LEATHER_JACKET,
	SMALL_SHIELD,
	HEAVY_T_SHIRT,
	KIDS_CLOTHES,
	SOCKS,
	LINTMAIL_VEST,
	NAKKID;
	

	private static final List<ArmourChart> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();

	/**
	 * Randomly Generates the Armour for the Kobolds Character Sheet
	 */
	public static ArmourChart randomArmour(Random rand)  {
	return VALUES.get(rand.nextInt(SIZE));
	}
	
	/**
	 * koboldArmour - uses switch statement for the display of the Armour on the Character Sheet
	 * 
	 * @param koboldArmourDescription
	 * @return
	 */
	public static String koboldArmour(ArmourChart koboldArmourDescription){
		switch(koboldArmourDescription){
		
		case	BIG_SHIELD	:	return	"Big Shield"	;
		case	METAL_POT_HELM	:	return	"Metal Pot Helm"	;
		case	BEER_BARREL	:	return	"Beer Barrel"	;
		case	LEATHER_APRON	:	return	"Leather Apron"	;
		case	LEATHER_JACKET	:	return	"Leather Jacket"	;
		case	SMALL_SHIELD	:	return	"Small Shield"	;
		case	HEAVY_T_SHIRT	:	return	"Heavy T-Shirt"	;
		case	KIDS_CLOTHES	:	return	"Kids Clothes"	;
		case	SOCKS	:	return	"Socks"	;
		case	LINTMAIL_VEST	:	return	"Lintmail Vest"	;
		case	NAKKID	:	return	"Nakkid"	;

		}
		return null;
	}
	
	/**
	 * koboldArmourHits - uses switch statement for the HITS each piece of Armour has
	 * 
	 * @param koboldArmourHitsAmount
	 * @return
	 */
	public static int koboldArmourHits(ArmourChart koboldArmourHitsAmount){
		switch(koboldArmourHitsAmount){
		
		case	BIG_SHIELD	:	return	10	;
		case	METAL_POT_HELM	:	return	10	;
		case	BEER_BARREL	:	return	12	;
		case	LEATHER_APRON	:	return	8	;
		case	LEATHER_JACKET	:	return	8	;
		case	SMALL_SHIELD	:	return	6	;
		case	HEAVY_T_SHIRT	:	return	4	;
		case	KIDS_CLOTHES	:	return	2	;
		case	SOCKS	:	return	1	;
		case	LINTMAIL_VEST	:	return	1	;
		case	NAKKID	:	return	0	;
		
		}
		return 0;
		}
	
	
	/**
	 * 
	 * @param koboldArmourSpecialSummary
	 * @return
	 */
	public static String koboldArmourSpecialSummary(ArmourChart koboldArmourSummary){
		switch(koboldArmourSummary){
		
		case	BIG_SHIELD	:	return	"-BIG, 2 DAM"	;
		case	METAL_POT_HELM	:	return	"+COOK"	;
		case	BEER_BARREL	:	return	"-BULKY"	;
		case	LEATHER_APRON	:	return	"+BACKPACK"	;
		case	LEATHER_JACKET	:	return	"+FONZIE"	;
		case	SMALL_SHIELD	:	return	"-ITEM, 1 DAM"	;
		case	HEAVY_T_SHIRT	:	return	""	;
		case	KIDS_CLOTHES	:	return	""	;
		case	SOCKS	:	return	""	;
		case	LINTMAIL_VEST	:	return	""	;
		case	NAKKID	:	return	""	;

		}
		return null;
		}
		
	
	/**
	 * koboldArmourSpecial - uses switch statement to display the special description
	 * of the Armour on the Kobold Character Sheet.
	 * 
	 * @param koboldArmourSpecialDescription
	 * @return
	 */
	public static String koboldArmourSpecial(ArmourChart koboldArmourSpecialDescription){
		switch(koboldArmourSpecialDescription){
		
		case	BIG_SHIELD	:	return	"Big Shield (2 Damage) [-BIG]: Requires two hands to use."	;
		case	METAL_POT_HELM	:	return	"Metal Pot Helm [+COOK]: Gives a Bonus Die to Cook Rolls."	;
		case	BEER_BARREL	:	return	"Beer Barrel [-BULKY]: Reduces Kobolds Agility by 1 "	;
		case	LEATHER_APRON	:	return	"Leather Apron [+BACKPACK]: Can be used as a Backpack"	;
		case	LEATHER_JACKET	:	return	"Leather Jacket [+FONZIE]: You feel Really Cool wearing the Jacket"	;
		case	SMALL_SHIELD	:	return	"Small Shield (1 Damage) [-ITEM]: Counts as 1 Item for Carrying Purposes"	;
		case	HEAVY_T_SHIRT	:	return	""	;
		case	KIDS_CLOTHES	:	return	""	;
		case	SOCKS	:	return	null	;
		case	LINTMAIL_VEST	:	return	null	;
		case	NAKKID	:	return	null	;

		}
		return null;
		}
		

}
