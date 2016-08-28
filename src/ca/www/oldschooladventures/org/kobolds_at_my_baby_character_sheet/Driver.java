/**
 * 
 */
package ca.www.oldschooladventures.org.kobolds_at_my_baby_character_sheet;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author Mark
 *
 */
public class Driver {
	
    public static void main(String[] args) {
    	JFrame f = new JFrame();
    	

    			
    	try {
    		f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("kobolds_character.png")))));
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	f.pack();
    	f.setVisible(true);
    	f.setSize(600, 800);


    		}

    }
    
	/*
	public static void main(String[] args){
		
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel emptyLabel = new JLabel("test");
		//3. Create components and put them in the frame.
		//...create emptyLabel...
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		//4. Size the frame.
		//frame.pack();

		//5. Show it.
		frame.setVisible(true);
		
		*/



