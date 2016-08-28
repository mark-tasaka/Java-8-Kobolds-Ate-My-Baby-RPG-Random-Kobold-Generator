/**
 * 
 */
package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * CharacterSheet - Class for the Random Creation of Kobold Characters
 * for KOBOLDS ATE MY BABY! SUPER DELUXX EDITION
 * 
 * Game Designed by Chris O'Neill and Dan Landis, 2005 (interior book art illustrated
 * by John Kovalic).
 * 
 * Please see http://www.koboldsatemybaby.com/ for more information about KOBOLDS ATE MY BABY! 
 * SUPER DELUXX EDITION
 * 
 * @author Mark Tasaka (www.oldschooladventures.org)
 * @version 1.01 (2016-08-19)
 */
public class CharacterSheet {
	
	private CoreStats brawn;
	private CoreStats ego;
	private CoreStats extraneous;
	private CoreStats reflexes;
	private int meat;
	private int cunning;
	private int luck;
	private int agility;
	private CoreStats hits;
	private int hitsPlusArmour;
	private ArmourChart armour;
	private ArmourChart armourHits;
	private ArmourChart armourSummary;
	private ArmourChart armourSpecialDescription;
	private ArrayList<EdgeChart> edges;
	private ArrayList<BogieChart> bogies;
	private GearChart gear;
	private WeaponChart weapon;
	private WeaponChart weaponDamage;
	private int weaponDamagePlusMeat;
	
	/**
	 * Random used for the random generation of statistics, weapons, etc.
	 */
	public static final Random rand = new Random();
	
	/**
	 * CharacterSheet() -  Constructor for the Random Kobold Generator.
	 * 
	 */
	public CharacterSheet(){
		
		brawn = new CoreStats(rollDice(6, 2, 0, 0));
		ego = new CoreStats(rollDice(6, 2, 0, 0));
		extraneous = new CoreStats(rollDice(6, 2, 0, 0));
		reflexes = new CoreStats(rollDice(6, 2, 0, 0));
		meat = getMeat();
		cunning = getCunning();
		luck = getLuck();
		agility = getAgility();
		armour = ArmourChart.randomArmour(rand);
		armourHits = getArmour();
		armourSummary = getArmour();
		armourSpecialDescription = getArmour();
		edges = new ArrayList<EdgeChart>();
		edges.add(EdgeChart.BARK_LIKE_A_KOBOLD);
		edges.add(EdgeChart.KOBOLD_SENSES);
		edges.add(EdgeChart.randomEdge(rand));
		hits = getHits();
		hitsPlusArmour = getHitsPlusArmour();
		bogies = new ArrayList<BogieChart>();
		bogies.add(BogieChart.FEARLESS);
		bogies.add(BogieChart.TASTE_LIKE_CHICKEN);
		bogies.add(BogieChart.randomBogie(rand));
		gear = GearChart.randomGear(rand);
		weapon = WeaponChart.randomWeapon(rand);
		weaponDamage = getWeaponDamage();
		weaponDamagePlusMeat = getWeaponDamagePlusMeat();
	}
	
	/**
	 * rollDice() is used to generate the dice rolls for the Kobold's
	 * Core Statistics.
	 * 
	 * The parameters are used to allow for variation and customization of dice rolls.
	 * 
	 * Methods of die rolling are:
	 * 1. 2d6 (by the rules)
	 * 2. 3D6 and drop the lowest
	 * 3. 4D6 and select the 2 highest
	 * 4. d11+1
	 * 5. d10+2
	 * 6. d9+3
	 * 7. d8+4
	 * 8. 3d4
	 * 9. 4d4 and drop the lowest
	 * 10. 5d4 and select the 2 highest
	 * 11. 2d5+2
	 * 
	 * @param numberOfSides - the number of sides the die has (i.e. d6)
	 * @param numberOfDiceRolled - the number of dice rolled
	 * @param numberOfDiceRemoved - the number of dice removed (i.e. roll 3d6 and drop the lowest)
	 * @param baseValue - a value that is added to the die roll to modify the results of the roll
	 * @return
	 */
	public int rollDice(int numberOfSides, int numberOfDiceRolled, int numberOfDiceRemoved, int baseValue) {
		
		if(numberOfSides <=2 || numberOfSides >=12){
			numberOfSides = 6;
		}
		
		if(numberOfDiceRolled < 0){
			numberOfDiceRolled =2;
		}
		
		if(numberOfDiceRemoved >= numberOfDiceRolled){
			numberOfDiceRemoved =0;
		}
		
		if(baseValue < 0){
			baseValue = 0;
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		

		for(int i = 0; i < numberOfDiceRolled; i++){
			numbers.add(rand.nextInt(numberOfSides)+1);
		}
		
		for(int i = 0; i < numberOfDiceRemoved; i++){
			numbers.remove(Collections.min(numbers));
		}
		
		int sum = 0;
			
		for(int i =0; i < numbers.size(); i++){
			sum += numbers.get(i);
		}
			
		return sum + baseValue;
	}

	

	/**
	 * getHits() - Gets the Kobold's Hits.  Hits equals the kobold's Brawn score.
	 * 
	 * @return the hits
	 */
	public CoreStats getHits() {
		if(edges.get(2)== EdgeChart.EXTRA_PADDING){
			CoreStats cs = getBrawn();
			cs.setCoreStatistics(cs.getCoreStatistics() + rand.nextInt(6)+1);
		}
		return getBrawn();
	}
	
	/**
	 * getHitsPlusArmour() - Gets the SUM of Kobold's Hits based on the brawn score Plus the Hits
	 * of the Kobold's Armour.
	 *  
	 * @return
	 */

 public int getHitsPlusArmour(){
	 int currentHits = getHits().getCoreStatistics();
	 return ArmourChart.koboldArmourHits(getArmourHits()) + currentHits;
	}
 

	
	/**
	 * getArmour() - Gets the Kobold's Armour.
	 * 
	 * @return the armour
	 */
	public ArmourChart getArmour() {
		return armour;
	}

	

	/**
	 * armourHits() - Gets the Kobold's Armour Hits (the amount of protection that the Armour provides).
	 * 
	 * @return the armourHits
	 */
	public ArmourChart getArmourHits() {
		return armourHits;
	}

	/**
	 * getArmourSummary() - Gets the Keys Words (i.e. +Edges, -Bogies) associated with the Armour
	 * 
	 * @return
	 */
	public ArmourChart getArmourSummary() {
		return armourSummary;
	}
	
	/**
	 * armourSpecialDescription() - Gets a description of the Armour
	 * 
	 * @return the armourSpecialDescription
	 */
	public ArmourChart getArmourSpecialDescription() {
		return armourSpecialDescription;
	}

	/**
	 * getBrawn() - Gets the Brawn Statistics (integer between 2 to 12).
	 * 
	 * @return the brawn
	 */
	public CoreStats getBrawn() {
		return brawn;
	}

	/**
	 * getEgo() - Gets the Ego Statistics (integer between 2 to 12).
	 * 
	 * @return the ego
	 */
	public CoreStats getEgo() {
		return ego;
	}

	/**
	 * getExtraneous() - Gets the Extraneous Statistics (integer between 2 to 12).
	 * 
	 * @return the extraneous
	 */
	public CoreStats getExtraneous() {
		return extraneous;
	}

	/**
	 * getReflexes() - Gets the Reflexes Statistics (integer between 2 to 12).
	 * 
	 * @return the reflexes
	 */
	public CoreStats getReflexes() {
		return reflexes;
	}


	/**
	 * getMeat - Gets Meat, an integer value dependent on the Brawn Statistics.
	 * 
	 * @return the meat
	 */
	public int getMeat() {
		if(getBrawn().getCoreStatistics() >=5 && getBrawn().getCoreStatistics() <=8){
			return 2;
		}
		else if(getBrawn().getCoreStatistics() >=9 && getBrawn().getCoreStatistics() <=12){
			return 3;
		}
		else if(getBrawn().getCoreStatistics() >=13 && getBrawn().getCoreStatistics() <=16){
			return 4;
		}
		else if(getBrawn().getCoreStatistics() >=17 && getBrawn().getCoreStatistics() <=20){
			return 5;
		}	
		return 1;
	}


	/**
	 * getCunning - Gets Cunning, an integer value dependent on the Ego Statistics.
	 *  
	 * @return the cunning
	 */
	public int getCunning() {
		if(getEgo().getCoreStatistics() >=5 && getEgo().getCoreStatistics() <=8){
			return 2;
		}
		else if(getEgo().getCoreStatistics() >=9 && getEgo().getCoreStatistics() <=12){
			return 3;
		}
		else if(getEgo().getCoreStatistics() >=13 && getEgo().getCoreStatistics() <=16){
			return 4;
		}
		else if(getEgo().getCoreStatistics() >=17 && getEgo().getCoreStatistics() <=20){
			return 5;
		}
		return 1;
	}



	/**
	 * getLuck - Gets Luck, an integer value dependent on the Extraneous Statistics.
	 * 
	 * @return the luck
	 */
	public int getLuck() {
		if(getExtraneous().getCoreStatistics() >=5 && getExtraneous().getCoreStatistics() <=8){
			return 2;
		}
		else if(getExtraneous().getCoreStatistics() >=9 && getExtraneous().getCoreStatistics() <=12){
			return 3;
		}
		else if(getExtraneous().getCoreStatistics() >=13 && getExtraneous().getCoreStatistics() <=16){
			return 4;
		}
		else if(getExtraneous().getCoreStatistics() >=17 && getExtraneous().getCoreStatistics() <=20){
			return 5;
		}	
		return 1;
	}
	


	/**
	 * getAgility() - Gets Agility, an integer value dependent on the Reflexes Statistics.
	 * 
	 * @return the agility
	 */
	public int getAgility() {
		if(getReflexes().getCoreStatistics() >=5 && getReflexes().getCoreStatistics() <=8){
			return 2;
		}
		else if(getReflexes().getCoreStatistics() >=9 && getReflexes().getCoreStatistics() <=12){
			return 3;
		}
		else if(getReflexes().getCoreStatistics() >=13 && getReflexes().getCoreStatistics() <=16){
			return 4;
		}
		else if(getReflexes().getCoreStatistics() >=17 && getReflexes().getCoreStatistics() <=20){
			return 5;
		}	
		return 1;
	}


	
	

	/**
	 * getEdges() - Gets the ArrayList for the EdgeChart enumerator.
	 * 
	 * @return the edges
	 */
	public ArrayList<EdgeChart> getEdges() {
		return edges;
	}

	/**
	 * getBogies() - Gets the ArrayList for the BogieChart enumerator.
	 * 
	 * @return
	 */
	public ArrayList<BogieChart> getBogies() {
		return bogies;
	}

	/**
	 * ASK ALBERT ABOUT WEAPON DAMAGE
	 */

	/**
	 * getGear() - Gets the Random piece of Kobold Gear.
	 * 
	 * @return
	 */
	public GearChart getGear(){
		return gear;
	}
	
	/**
	 * getWeapon() - Gets the Random Kobold weapon.
	 * 
	 * @return
	 */
	public WeaponChart getWeapon(){
		return weapon;
	}
	
	/**
	 * getWeaponDamage() - Gets an integer value representing the amount of damage the weapon does.
	 * 
	 * @return
	 */
	public WeaponChart getWeaponDamage(){
		return weaponDamage;
	}




	/**
	 * weaponDamagePlusMeat() - gets the total amount of damage that the Kobold causes
	 * from their weapon damage and their Meat score.
	 * 
	 * @return the weaponDamagePlusMeat
	 */
	public int getWeaponDamagePlusMeat() {
		return WeaponChart.koboldWeaponDamage(weapon) + getMeat();
	}



	/**
	 * toString() - Prints out the information that is displayed on the Character Sheet.
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String a = "";
		for(int i = 0; i<edges.size(); i++){
			a += EdgeChart.koboldEdgeName(edges.get(i)) + "\n";
			}
		String b = "";
		for(int i = 0; i<bogies.size(); i++){
			b += BogieChart.koboldBogieName(bogies.get(i)) + "\n";
			}

		String ed = "";
		for(int i = 0; i<edges.size(); i++){
			ed += EdgeChart.koboldEdgeDescription(edges.get(i)) + "\n";
			}
		
		String bg = "";
		for(int i = 0; i<bogies.size(); i++){
			bg += BogieChart.koboldBogieDescription(bogies.get(i)) + "\n";
			}
		return "KOBOLD:\nBRAWN: " + brawn + ", EGO: " + ego + ", EXTRAN: " + extraneous + ", REF: "
				+ reflexes + "\nMEAT: " + meat + ", CUNNING: " + cunning + ", LUCK: " + luck + ", AGILITY: " + agility
				+ ", HITS: " + hits + "(max)" +"\n\nWEAPON: " + WeaponChart.koboldWeaponName(weapon) + "(DAM: " 
				+ weaponDamagePlusMeat + "[" + WeaponChart.koboldWeaponDamage(weapon) + "])"
				+ " ("+ WeaponChart.koboldWeaponSpecial(weapon) + ")" + "\nARMOUR: " + ArmourChart.koboldArmour(armour) 
				+ " (HITS: " + ArmourChart.koboldArmourHits(armour) + ") " + "HITS+ARMOUR: " + hitsPlusArmour 
				+ "(" + ArmourChart.koboldArmourSpecialSummary(armour) + ")" + "\nGEAR: " + GearChart.koboldGearName(gear) 
				+ "\n\nEDGES:\n" + a + "\nBOGIES:\n" + b
				+ "\nSUMMARY:\n" + ed +bg + ArmourChart.koboldArmourSpecial(armour) + "\n\n" +GearChart.koboldGearSpecial(gear);
	}


	
	



}
