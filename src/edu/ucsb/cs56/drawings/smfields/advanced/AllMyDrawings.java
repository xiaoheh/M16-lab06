package edu.ucsb.cs56.drawings.smfields.advanced;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import javafx.scene.transform.Affine;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Phill Conrad
 * @author Steven Fields
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
	/** Draw a picture with a few watches
	 */

	public static void drawPicture1(Graphics2D g2) {

		AffineTransform af = g2.getTransform();

		Watch w1 = new Watch(20, 40, 20);
		g2.setColor(Color.red);
		g2.draw(w1);

		g2.translate(60, 0);
		g2.setColor(Color.green);
		g2.draw(w1);

		g2.translate(60, 0);
		g2.setColor(Color.blue);
		g2.draw(w1);

		Watch aw1 = new Watch(20, 140, 20);
		g2.translate(-120, 0);
		g2.setColor(Color.red);
		g2.draw(aw1);

		g2.translate(60, -70);
		g2.setColor(Color.green);
		g2.scale(1.5, 1.5);
		g2.draw(aw1);

		g2.translate(70, -70);
		g2.setColor(Color.blue);
		g2.scale(1.5, 1.5);
		g2.draw(aw1);

		g2.setTransform(af);



		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setColor(Color.BLACK);
		g2.drawString("Basic watches by Steven Fields", 20,20);
	}


	/** Draw a picture with a few watches and analog watches
	 */
	public static void drawPicture2(Graphics2D g2) {

		// Draw some coffee cups.

		AffineTransform af = g2.getTransform();

		Watch w1 = new Watch(20, 20, 20);
		AnalogWatch aw1 = new AnalogWatch(0, 0, 20);

		g2.setColor(Color.black);
		g2.draw(w1);
		AffineTransform af2 = new AffineTransform();
		af2.rotate(Math.PI/2, -20, 100);
		g2.transform(af2);
		g2.draw(aw1);
		g2.setTransform(af);

		AnalogWatch aw2 = new AnalogWatch(0, 0, 50);

		AffineTransform af3 = new AffineTransform();
		g2.setColor(new Color(.5f, .5f, .8f));
		af3.rotate(Math.PI/4, 100, 300);
		g2.setTransform(af3);
		g2.draw(aw2);
		g2.setTransform(af);
		AffineTransform af4 = new AffineTransform();
		g2.setColor(new Color(.7f, .3f, .1f));
		af4.rotate(-Math.PI/4, 300, 100);
		g2.setTransform(af4);
		g2.draw(aw2);
		g2.setTransform(af);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
		g2.setTransform(af);
		g2.setColor(Color.BLACK);
		g2.drawString("Watches and analog watches by Steven Fields", 20,20);
	}

	/** Draw a different picture with a few watches and analog watches
	 */

	public static void drawPicture3(Graphics2D g2) {

		// label the drawing

		g2.drawString("A bunch of watches by Steven Fields", 20,20);

		AffineTransform af = g2.getTransform();

		// Draw some coffee cups.

		AnalogWatch aw1 = new AnalogWatch(0, 0, 20);
		g2.setColor(Color.cyan);
		g2.translate(30, 30);
		g2.draw(aw1);
		AffineTransform af2 = new AffineTransform();
		g2.setColor(Color.MAGENTA);
		af2.rotate(Math.PI/3, 100, 200);
		af2.scale(1.5, 1.5);
		g2.setTransform(af2);
		g2.draw(aw1);

		g2.setTransform(af);

		Watch w1 = new Watch(0, 0, 60);

		g2.setColor(Color.blue);
		g2.translate(20, 200);
		g2.draw(w1);

	}

}
