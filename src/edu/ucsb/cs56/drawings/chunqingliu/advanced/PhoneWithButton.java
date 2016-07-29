package edu.ucsb.cs56.drawings.chunqingliu.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   an iPhone5 
      
   @author Chunqing Liu
   @version for CS56, M16, UCSB
   
*/
public class PhoneWithButton extends Phone implements Shape
{
    /**
     * Constructor for objects of class pPhone
     */
    public PhoneWithButton(double x, double y, double width, double height)
    {
	// construct the basic phone shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	

	double rec1_Top = y + 0.3 * height;
	double rec3_Top = y + 0.85 * height;
	double small_rec_width = 0.05 * width;
	Rectangle2D.Double rec1 =
	    new Rectangle2D.Double(x + width, rec1_Top, small_rec_width, 0.10 * height);
	Rectangle2D.Double rec2 =
	    new Rectangle2D.Double(x - 0.05 * width, rec1_Top, small_rec_width, 0.18 * height);
        Rectangle2D.Double rec3 =
	    new Rectangle2D.Double(x +  0.45 * width, rec3_Top , small_rec_width, 0.05 * height);


	// add the buttons to the phone
	
        GeneralPath wholePhone = this.get();
         wholePhone.append(rec1, false);
	 wholePhone.append(rec2, false);
         wholePhone.append(rec3, false);
    }    
}
