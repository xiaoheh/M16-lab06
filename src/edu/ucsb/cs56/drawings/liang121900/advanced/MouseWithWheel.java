package edu.ucsb.cs56.drawings.liang121900.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
A mouse

@author Zhiliang Xie
@version for cs56, M16, UCSB
*/

public class MouseWithWheel extends Mouse implements Shape{

    /** Constructor                                                                                 
@param x x coord of lower left corner of mouse                                                                                                                                                                   
@param y y coord of lower left corner of mouse                                  
@param width width of the mouse                                          
 */


    public MouseWithWheel(double x,double y,double width,double height)
    {
	super(x,y,width,height);
	GeneralPath gp = this.get();

	double w = 0.1 * width;
	double h=0.1*height;
	double winTop = y + 0.5 * height;
	double winHt =  0.25 * height;
	
	Rectangle2D.Double wheel =
	    new Rectangle2D.Double(x + (width/2)-w/2, y+0.7*height+(0.2*height-h)/2, w, h);
	
	// add the wheel to the mouse
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeMouse = this.get();
        wholeMouse.append(wheel, false);



    }




}
