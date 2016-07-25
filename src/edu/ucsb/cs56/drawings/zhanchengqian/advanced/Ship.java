package edu.ucsb.cs56.drawings.zhanchengqian.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a ship that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Zhancheng Qian
   @version for CS56, M16, UCSB
   
*/
public class Ship extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of ship (bow)
       @param y y coord of upper left corner of ship (bow)
       @param width of the ship (width of the deck)
       @param height of ship (from deck to keel)

       //IMPORTANT width needs to be 3 times bigger than height
    */
    public Ship(double x, double y, double width, double height)
    {
  
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double xofKeelLeft = x + 1.5 * height;
        double yofKeelLeft = y + height;
        double xofKeelRight = x + width - 1.5 * height;
        double yofKeelRight = y + height;
        
        Line2D.Double bow = 
            new Line2D.Double (x, y,
                               xofKeelLeft, yofKeelLeft);
        Line2D.Double stern = 
            new Line2D.Double (x + width, y,
                               xofKeelRight, yofKeelRight);
        Line2D.Double deck = 
            new Line2D.Double (x, y,
                               x + width, y);
        Line2D.Double keel = 
            new Line2D.Double (xofKeelLeft, y + height,
                               xofKeelRight, y + height);
  
        // put the whole ship together
  
        GeneralPath wholeShip = this.get();
        wholeShip.append(bow, false);
        wholeShip.append(stern, false);
        wholeShip.append(deck, false);  
        wholeShip.append(keel, false); 
    }
}
