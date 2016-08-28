/**
 * 
 */
package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * WeaponChart - Enumerator for Random Weapons for KOBOLDS ATE MY BABY! SUPER DELUXX EDITION
 * 
 * Game Designed by Chris O'Neill and Dan Landis, 2005 (interior book art illustrated
 * by John Kovalic).
 * 
 * Please see http://www.koboldsatemybaby.com/ for more information about KOBOLDS ATE MY BABY! 
 * SUPER DELUXX EDITION
 * 
 * @author Mark Tasaka (www.oldschooladventures.org)
 * @version 1.01 (2016-08-17)
 */
public enum WeaponChart {
	
	IRON_SKILLET,
	LARGE_BONE,
	CHAIN,
	CLUB,
	SMALL_SWORD,
	DAGGER,
	HAMMER,
	SLING_SHOT,
	COOKING_UTENSIL,
	DEAD_RAT,
	SQUAT;
	
	private static final List<WeaponChart> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();

	/**
	 * Generates a Random Weapon
	 * 
	 * @param rand
	 * @return
	 */
	public static WeaponChart randomWeapon(Random rand)  {
	return VALUES.get(rand.nextInt(SIZE));
	}

	/**
	 * koboldWeaponName - this is how the weapon will be displayed on the Character Sheet
	 * 
	 * @param weaponName
	 * @return
	 */
	public static String koboldWeaponName(WeaponChart weaponName){
		switch(weaponName){
		
		case	IRON_SKILLET	: return	"Iron Skillet"	;
		case	LARGE_BONE	: return	"Large Bone"	;
		case	CHAIN	: return	"Chain"	;
		case	CLUB	: return	"Club"	;
		case	SMALL_SWORD	: return	"Small Sword"	;
		case	DAGGER	: return	"Dagger"	;
		case	HAMMER	: return	"Hammer"	;
		case	SLING_SHOT	: return	"Sling Shot"	;
		case	COOKING_UTENSIL	: return	"Cooking Utensil"	;
		case	DEAD_RAT	: return	"Dead Rat"	;
		case	SQUAT	: return	"Squat"	;
		
		}
		return null;
		}
	
	/**
	 * koboldWeaponDamage - an integer containing the amount of damage that the weapon does.
	 * 
	 * @param weaponDamage
	 * @return
	 */
	public static int koboldWeaponDamage(WeaponChart weaponDamage){
		switch(weaponDamage){
		
		case	IRON_SKILLET	: return	3	;
		case	LARGE_BONE	: return	3	;
		case	CHAIN	: return	2	;
		case	CLUB	: return	2	;
		case	SMALL_SWORD	: return	2	;
		case	DAGGER	: return	1	;
		case	HAMMER	: return	1	;
		case	SLING_SHOT	: return	1	;
		case	COOKING_UTENSIL	: return	1	;
		case	DEAD_RAT	: return	0	;
		case	SQUAT	: return	0	;
		
		}
		return 0;
		}
	
	/**
	 * koboldWeaponSpecial - edges/bogies of the weapon.
	 * 
	 * @param weaponSpecial
	 * @return
	 */
	public static String koboldWeaponSpecial(WeaponChart weaponSpecial){
		switch(weaponSpecial){
		
		case	IRON_SKILLET	: return	"+Cook"	;
		case	LARGE_BONE	: return	"-Big"	;
		case	CHAIN	: return	"+Climb"	;
		case	CLUB	: return	"+Bash"	;
		case	SMALL_SWORD	: return	"Looks pretty wimpy"	;
		case	DAGGER	: return	"Looks pretty cool"	;
		case	HAMMER	: return	"+Useful"	;
		case	SLING_SHOT	: return	"-Stones"	;
		case	COOKING_UTENSIL	: return	"+Cook"	;
		case	DEAD_RAT	: return	"-Foul Smelling"	;
		case	SQUAT	: return	""	;
		
		}
		return null;
		}
	
	
	/**
	 * koboldWeaponSpecialDescription - provides a description of the weapon's properties.
	 * 
	 * @param weaponSpecialDescription
	 * @return
	 */
	public static String koboldWeaponSpecialDescription(WeaponChart weaponSpecialDescription){
		switch(weaponSpecialDescription){
		
		case	IRON_SKILLET	: return	"Iron Skillet [+COOK]: Gives YOU a bonus to All Cook Rolls"	;
		case	LARGE_BONE	: return	"Large Bone [-BIG]: Requires two hands to use."	;
		case	CHAIN	: return	"Chain [+Climb]: Gives YOU a bonus Die to All Athlete and Dungeon Climbing Rolls."	;
		case	CLUB	: return	"Club [+Bash]: Gives YOU a bonus Die to All Bash Rolls"	;
		case	SMALL_SWORD	: return	""	;
		case	DAGGER	: return	""	;
		case	HAMMER	: return	"Hammer [+Useful]: Gives YOU a bonus Die to All Dungeon Rolls."	;
		case	SLING_SHOT	: return	"Sling Shot [+Stones]: Whenever YOU are outside YOU can spend an Action to find 1d6 Stones."	;
		case	COOKING_UTENSIL	: return	"Cooking Utensil [+COOK]: Gives YOU a bonus to All Cook Rolls"	;
		case	DEAD_RAT	: return	""	;
		case	SQUAT	: return	""	;
		
		}
		return null;
		}
}
