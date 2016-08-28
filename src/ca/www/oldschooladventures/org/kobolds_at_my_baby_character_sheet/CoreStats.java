/**
 * 
 */
package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

/**
 * CoreStats - the Framework for the Core 4 Statistics (Brawn, Ego, Extraneous, and Reflexes) 
 * for Kobolds Ate my Baby!
 * 
 * KOBOLDS ATE MY BABY! SUPER DELUXX EDITION: Game Designed by Chris O'Neill and Dan Landis, 
 * interior book art illustrated by John Kovalic, 2005
 * 
 * Please see http://www.koboldsatemybaby.com/ for more information about KOBOLDS ATE MY BABY! 
 * SUPER DELUXX EDITION
 * 
 * @author Mark Tasaka
 * @version 1.01 (2016-08-15)
 *
 */
public class CoreStats {
	
	private int coreStatistics;

	public CoreStats(int coreStatistics) {
		
		setCoreStatistics(coreStatistics);
	}

	/**
	 * Gets the coreStatistics
	 * 
	 * @return the coreStatistics
	 */
	public int getCoreStatistics() {
		return coreStatistics;
	}

	/**
	 * Sets the minimum and maximum boundaries of the Core Statistics
	 * for KOBOLDS ATE MY BABY! SUPER DELUXX EDITION.  The boundaries
	 * are defined on page 7 (The Handy Chart) of the core rule book.
	 * 
	 * @param coreStatistics the coreStatistics to set
	 */
	public void setCoreStatistics(int coreStatistics) {
		int min = 1;
		int max = 20;
		
		if(coreStatistics < min || coreStatistics > max){
			coreStatistics = 6;
		}
		else{
			this.coreStatistics = coreStatistics;
		}
		
		
	}

	/**
	 * toString() for the Core Statistics
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + coreStatistics + "";
	}
	
	
	
	
	
	

}
