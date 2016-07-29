package edu.ucsb.cs56.drawings.zhanchengqian.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Ship
      
   @author Zhancheng Qian
   @version for CS56, M16, UCSB
   
*/
public class ShipwithFunnels extends Ship implements Shape
{
    /**
     * Default Constructor for objects of class ShipwithFunnels
     * this one gives one funnel on the ship
     */
    public ShipwithFunnels(double x, double y, double width, double height)
    {
	// construct the basic ship shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make a funnel;
	// | 	+--+ 	|
	// | 	|  |	|
	// |	+--+ 	|
	// |6w	 w 	  6w|
	//
	// The width of funnel will be 1/11 of ship's width and the
	// height of the funnel is 1*height;
	
	double w = width/13;
	double funnelTop = y - height;
	double funnelHt =  height;
	
	Rectangle2D.Double funnel1=
	    new Rectangle2D.Double(x + 6*w, funnelTop, w, funnelHt);
	
	// add the funnel to the ship
	
        GeneralPath wholeShip = this.get();
        wholeShip.append(funnel1, false);
    }    
    /**
     * Constructor for objects of class ShipwithFunnels
     * this one asks you to input numoffunnels which is the number of
     * funnels you want the ship to have
     */
    public ShipwithFunnels(double x, double y, double width, double height, int numoffunnels)
    {
	// construct the basic ship shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make a funnel;
	// | 	+--+ +--+	|
	// | 	|  | |  |	|
	// |	+--+ +--+ 	|
	// |5w	 w 	w  w 5w |
	//
	// The width of funnel will be 1/11 of ship's width and the
	// height of the funnel is 1*height;
	
	double w = width/13;
	double funnelTop = y - height;
	double funnelHt =  height;
	int margin = (13 - (numoffunnels * 2 - 1)) / 2;
	
	GeneralPath wholeShip = this.get();
	for (int i=0; i<numoffunnels; i++){
	Rectangle2D.Double funnel1=
	    new Rectangle2D.Double(x + margin * w + i * 2 * w, funnelTop, w, funnelHt);

	    wholeShip.append(funnel1, false);
	}
   
    }    
}
