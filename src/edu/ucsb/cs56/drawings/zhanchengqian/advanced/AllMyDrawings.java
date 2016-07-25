package edu.ucsb.cs56.drawings.zhanchengqian.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Zhancheng Qian
 * @version for UCSB CS56, M16 
 */

public class AllMyDrawings
{
    
    public static void drawPicture1(Graphics2D g2) {
	
	Ship s1 = new Ship(100,250,200,20);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	ShipwithFunnels sf1 = new ShipwithFunnels(50,350,150,25);
	ShipwithFunnels sf2 = new ShipwithFunnels(200,350,300,50,3);
	
	g2.draw(sf1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(sf2);

	Shape sf3 = ShapeTransforms.rotatedCopyOf(sf2, Math.PI/6.0);
	Shape sf4 = ShapeTransforms.translatedCopyOf(sf3,-250,-200);
	g2.draw(sf4); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few ships by Zhancheng Qian", 20,20);
    }
    
    
    public static void drawPicture2(Graphics2D g2) {
	

	
	ShipwithFunnels large = new ShipwithFunnels(100,50,450,80,4);
	ShipwithFunnels small = new ShipwithFunnels(20,50,150,20,1);
	ShipwithFunnels middle = new ShipwithFunnels(20,150,300,40,2);
	ShipwithFunnels fat = new ShipwithFunnels(20,250,280,60,2);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(middle);
	g2.setColor(Color.MAGENTA); g2.draw(fat);
	
	Ship s1 = new Ship(100,60,90,15);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	ShipwithFunnels sf1 = new ShipwithFunnels (50,350, 140,25,2);
	ShipwithFunnels  sf2 = new ShipwithFunnels (200,350,300,60, 3);
	
	g2.draw(sf1);
	g2.setColor(new Color(0x8F00FF)); 
	
	Shape sf3 = ShapeTransforms.rotatedCopyOf(sf2, Math.PI/4.0);
	
	g2.draw(sf3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Ships by Zhancheng Qian", 20,20);
    }
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Ships by Zhancheng Qian", 20,20);
	

	
	ShipwithFunnels  large = new ShipwithFunnels (20,230,360,60,2);
	ShipwithFunnels  small = new ShipwithFunnels (20,100,240,40,1);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
    }       

    public static void drawPicture4(Graphics2D g2) {
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL); 

	ShipwithFunnels s1 = new ShipwithFunnels(50,50,120,20,3);
	g2.setStroke(thick);
	g2.setColor(Color.BLACK); g2.draw(s1);

	ShipwithFunnels s2 = new ShipwithFunnels(50,200,250,50,4);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
    }
}
