package edu.ucsb.cs56.drawings.chunqingliu.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a phone that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Chunqing Liu
   @version for CS56, M16, UCSB
   
*/
public class Phone extends GeneralPathWrapper implements Shape
{
     /**
       Constructor
       
       @param x x coord of lower left corner of phone
       @param y y coord of lower left corner of phone
       @param width width of the phone (not including added side buttons)
       @param height of phone 
    */

    public Phone(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.


	//Make the outline of the phone
        Rectangle2D.Double outline = 
            new Rectangle2D.Double(x, y ,
				   width, height);
	//Make the small rectangle inside the outline rectangle
	Rectangle2D.Double small_rectangle = 
            new Rectangle2D.Double(x + .30 * width, y + 0.05 * height ,
				  .40 * width, 0.10 * height);


	//below are the two lines on the phone
	double  line_ends_xcoord= x + width;
        Line2D.Double upperline = 
            new Line2D.Double (x, y + 0.20 * height,
                               line_ends_xcoord, y + 0.20 * height);
	
        Line2D.Double lowerline =
            new Line2D.Double (x, y + 0.80 * height,
                               line_ends_xcoord, y + 0.80 * height);
	//put all together
        GeneralPath wholePhone = this.get();
        wholePhone.append(outline, false);
        wholePhone.append(small_rectangle, false);
        wholePhone.append(upperline, false);
	wholePhone.append(lowerline, false); 
    }
}
