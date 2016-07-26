package edu.ucsb.cs56.drawings.wbennett.advanced;

import java.awt.*;

import edu.ucsb.cs56.drawings.pconrad.advanced.*;
import edu.ucsb.cs56.drawings.pconrad.advanced.CoffeeCup;
import edu.ucsb.cs56.drawings.pconrad.advanced.House;
import edu.ucsb.cs56.drawings.pconrad.advanced.HouseWithWindows;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a single person
     */
    
    public static void drawPicture1(Graphics2D g2) {
	    Person person = new Person(250, 250, 100, 200);
        Wizard wizard = new Wizard(500, 500, 125, 200);
        g2.setColor(Color.orange);
        g2.draw(person);

        g2.setColor(Color.blue);
        g2.draw(wizard);

        g2.drawString("A wizard and his servant by William Bennett", 10, 10);
    }


    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {



	Person normal = new Person(200, 200, 150, 200);
        Person fat = new Person(50, 50, 175, 100);



	    g2.setColor(Color.BLACK);
        g2.draw(normal);

        Shape scaledNormal = ShapeTransforms.scaledCopyOf(normal, 1.5, 1.5);
        scaledNormal = ShapeTransforms.translatedCopyOf(scaledNormal, 0, 200);
        g2.setColor(Color.RED);
        g2.draw(scaledNormal);

        g2.draw(fat);
        Stroke thick = new BasicStroke(3);
        Stroke original = g2.getStroke();

        g2.setStroke(thick);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(fat);

        g2.drawString("Various people, by William Bennett", 30, 30);
    }

    /** Draw a different picture with a few houses and coffee cups
     */

    public static void drawPicture3(Graphics2D g2) {

	// label the drawing
        Wizard overlord = new Wizard(400, 10, 150, 225);
        Person servant = new Person(25, 300, 50, 100);
        g2.drawString("A wizard and his gnome servants, by William Bennett", 350, 500);
        g2.setColor(Color.blue);
	    g2.draw(overlord);

        g2.setColor(Color.orange);
        for (int i = 0; i < 5; i++) {
            g2.draw(ShapeTransforms.translatedCopyOf(servant, i * 150, 0));
        }
    }       
}
