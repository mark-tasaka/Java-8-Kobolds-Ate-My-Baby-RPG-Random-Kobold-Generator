package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * GearChart - Enumerator for Random Gear for KOBOLDS ATE MY BABY! SUPER DELUXX EDITION
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
public enum GearChart {
	
	CUP_OF_MILK_ELEMENTAL_SUMMONING,
	BAG_OF_HOLDING_CHICKENS,
	RING_OF_HUMAN_SPEAKING,
	CODEX_OF_TABRIZ_THE_ARCANE,
	SPICE_SACK,
	BACKPACK,
	TWENTY_FIVE_FEET_ROPE,
	TEN_FOOT_POLE,
	LINT,
	GROG,
	MEAD,
	BEER,
	WINE,
	BRANDY,
	TA_KILL_YA,
	BROKEN_HOLY_WATER_VIAL,
	FLASK_OF_OIL,
	WHETSTONE,
	IRON_RATION,
	FLAMING_CLUB,
	EMPTY_WINESKIN;
	

	private static final List<GearChart> VALUES =
		    Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	
	/**
	 * Method use to generate random Gear
	 */
	public static GearChart randomGear(Random rand)  {
	return VALUES.get(rand.nextInt(SIZE));
	}
	

	/**
	 * koboldGearName - how the gear will appear on the Character Sheet
	 * 
	 * @param gearName
	 * @return
	 */
	public static String koboldGearName(GearChart gearName){
		switch(gearName){
		
		case	CUP_OF_MILK_ELEMENTAL_SUMMONING	: return	"Cup of Milk Elemental Summoning"	;
		case	BAG_OF_HOLDING_CHICKENS	: return	"Bag of Holding Chickens"	;
		case	RING_OF_HUMAN_SPEAKING	: return	"Ring of Human Speaking"	;
		case	CODEX_OF_TABRIZ_THE_ARCANE	: return	"Codex of Tabriz the Arcane"	;
		case	SPICE_SACK	: return	"Spice Sack"	;
		case	BACKPACK	: return	"Backpack"	;
		case	TWENTY_FIVE_FEET_ROPE	: return	"25 feet of Rope"	;
		case	TEN_FOOT_POLE	: return	"10 foot Pole"	;
		case	LINT	: return	"Lint"	;
		case	GROG	: return	"Grog"	;
		case	MEAD	: return	"Mead"	;
		case	BEER	: return	"Beer"	;
		case	WINE	: return	"Wine"	;
		case	BRANDY	: return	"Brandy"	;
		case	TA_KILL_YA	: return	"Ta-Kill-Ya"	;
		case	BROKEN_HOLY_WATER_VIAL	: return	"Broken Holy Water Vial"	;
		case	FLASK_OF_OIL	: return	"Flask Of Oil"	;
		case	WHETSTONE	: return	"Whetstone"	;
		case	IRON_RATION	: return	"Iron Ration"	;
		case	FLAMING_CLUB	: return	"Flaming Club"	;
		case	EMPTY_WINESKIN	: return	"Empty Wineskin"	;


		}
		return null;
		}

/**
 * ASK ALBERT ABOUT THIS	
 */
/*	public BoozeChart randomBooze (Random rand){
		if(GearChart.randomGear(rand).compareTo(GearChart.RANDOM_BOOZE)==0){
		return BoozeChart.randomBooze(rand);
		}
		return null;
	}*/
	
	/**
	 * koboldGearSpecial - A description of the special properties of the gear.
	 * 
	 * @param gearSpecial
	 * @return
	 */
	public static String koboldGearSpecial(GearChart gearSpecial){
		switch(gearSpecial){
		
		case	CUP_OF_MILK_ELEMENTAL_SUMMONING	: return	"Cup of Milk Elemental Summoning: A magic cup that allows"
				+ "YOU to summon a \nMilk Elemental (B:5, E:3. E:7, R:8 / AGL 2 / Milk Fist 1 DAM / +Bouncy / VP:2)"	;
		case	BAG_OF_HOLDING_CHICKENS	: return	"Bag of Holding Chickens: Could only hold chickens, but allows YOU to"
				+ "hold an unlimited number of chickens."	;
		case	RING_OF_HUMAN_SPEAKING	: return	"Ring of Human Speaking: When holding this ring YOU can speak to and"
				+ "\nunderstand Humans."	;
		case	CODEX_OF_TABRIZ_THE_ARCANE	: return	"Codex of Tabriz the Arcane: See pages 18 and 20 of KOBOLDS ATE MY BABY! "
				+ "\nSUPER DELUXX EDITION for a description of this item and for the Random Magic Spell Chart."	;
		case	SPICE_SACK	: return	"Spice Sack: the spices contained in this sack could be used to cook meals. If you use the"
				+ "spices for cooking and succeed a 3 Dice Cook Roll, YOUR meal will give each Kobold 1d6 Hits."	;
		case	BACKPACK	: return	"Backpack: Allows YOU to carry 1 item roughly the size of a Baby.  Neither the backpack, nor"
				+ "\nthe items carried by the backpack counts against the 2 items that YOU are allowed to carry."	;
		case	TWENTY_FIVE_FEET_ROPE	: return	"25 feet of Rope: Gives YOU a bonus Die to All Athlete and Dungeson Climb Checks."
				+ "\nOnce uncoiled, the Rope becomes -Big."	;
		case	TEN_FOOT_POLE	: return	"10 foot Pole: Gives YOU a bonus Die to all Dungeon Rolls."	;
		case	LINT	: return	"Lint: of no value"	;
		case	GROG	: return	"Grog: Gain a Bonus Die to Brawn Rolls and a Penality Die to all other"
		+ "\nRolls for 1d6 turns."	;
		case	MEAD	: return	"Mead: Regain 1d6 Hits, but suffer a Penality Die on Ego Rolls for 1d6 turns."	;
		case	BEER	: return	"Beer: Ignore the effects of -Hunger for 1d6 turns."	;
		case	WINE	: return	"Wine: Get the -In Heat Bogie for 1d6 turns."	;
		case	BRANDY	: return	"Brandy: Take 2 Damage and gain the Bard Skills for 1d6 turns."	;
		case	TA_KILL_YA	: return	"Ta-Kill-Ya: Take 1d6 Horrible Death Checks and receive the same number of VP."	;
		case	BROKEN_HOLY_WATER_VIAL	: return	"Broken Holy Water Vial: Can be thrown at Undead Creatures for 1d6 damage."	;
		case	FLASK_OF_OIL	: return	"Flask Of Oil: Can be thrown into a fire to explode, causing 1d6 damage for that square."	;
		case	WHETSTONE	: return	"Whetstone: Roll 1D6, and take the result in Damage.  For that nyumber of turns YOU do +2 Damage."	;
		case	IRON_RATION	: return	"Iron Ration: Regain 2 Hits when eaten."	;
		case	FLAMING_CLUB	: return	"Flaming Club: Last 2d6 turn after lit, and does 3 Damage during this time."	;
		case	EMPTY_WINESKIN	: return	""	;
		
		}
		return null;
		}
	
}


