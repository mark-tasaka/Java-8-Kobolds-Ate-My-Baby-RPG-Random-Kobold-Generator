/**
 * 
 */
package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * EdgeChart - Enumerator for Random +Edge for KOBOLDS ATE MY BABY! SUPER DELUXX EDITION
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
public enum EdgeChart{
	
	ANIMAL_CHUM,
	BOUNCY,
	EXTRA_PADDING,
	TROLL_BLOOD,
	WINNING_SMILE,
	ZILCH,
	BARK_LIKE_A_KOBOLD,
	KOBOLD_SENSES;
	

	private static final List<EdgeChart> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();

	/**
	 * Generates a Random Edge
	 *  
	 * @param rand
	 * @return
	 */
	public static EdgeChart randomEdge(Random rand)  {
	return VALUES.get(rand.nextInt(SIZE-2));
	}
	
	/**
	 * koboldEdgeName - how the edge will appear on the character sheet.
	 * 
	 * @param edgeName
	 * @return
	 */
	public static String koboldEdgeName(EdgeChart edgeName){
		switch(edgeName){
		
		case	ANIMAL_CHUM	: return	"+Animal Chum"	;
		case	BOUNCY	: return	"+Bouncy"	;
		case	EXTRA_PADDING	: return	"+Extra Padding"	;
		case	TROLL_BLOOD	: return	"+Troll Blood"	;
		case	WINNING_SMILE	: return	"+Winning Smile"	;
		case	ZILCH	: return	"+Zilch"	;
		case	BARK_LIKE_A_KOBOLD	: return	"+Bark Like A Kobold"	;
		case	KOBOLD_SENSES	: return	"+Kobold Senses"	;

		}
		return null;
		}
	
	
	/**
	 * koboldEdgeDescription - provides a description of the kobold's edges
	 * 
	 * @param edgeDescription
	 * @return
	 */
	public static String koboldEdgeDescription(EdgeChart edgeDescription){
		switch(edgeDescription){
		
		case	ANIMAL_CHUM	: return	"+Animal Chum: Animals will not attack YOU, unless YOU threaten them.\n"	;
		case	BOUNCY	: return	"+Bouncy: No matter how much damage YOU take when YOU fall, YOU will always"
				+ "\nhave aleast 1 HIT Remaining.  Plus, YOU will land in an adjacent square.\n"	;
		case	EXTRA_PADDING	: return	"+Extra Padding: 1d6 extra HITS at KOBOLD creation (the extra HITS have"
				+ "\nbeen added to the Max HITS on the Character Sheet.\n";
		case	TROLL_BLOOD	: return	"+Troll Blood: YOU can spend 1 turn regain 2 lost HITS from licking your wounds.\n"	;
		case	WINNING_SMILE	: return	"+Winning Smile: As long as YOU are smiling, Humans will not attack YOU.\n"	;
		case	ZILCH	: return	"+Zilch: No additional Edges.\n"	;
		case	BARK_LIKE_A_KOBOLD	: return	"+Bark Like A Kobold: Before rolling the dice, YOU can Bark, Growl or make"
				+ "\nKobold Sounds to reduce the difficulty of an action by 1 die.\n"	;
		case	KOBOLD_SENSES	: return	"+Kobold Senses: Ability to Taste the Smell of Things, and the ability to see"
				+ "\nin total darkness.\n"	;

		}
		return null;
		}
	
	}
	
