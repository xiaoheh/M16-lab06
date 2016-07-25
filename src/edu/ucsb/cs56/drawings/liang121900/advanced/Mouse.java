package edu.ucsb.cs56.drawings.liang121900.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**                                                                                                                                                                                                                                                                           
   A vector drawing of a mouse that implements                                                                                                                                                                                                                                
   the Shape interface, and so can be drawn, as well as                                                                                                                                                                                                                       
   rotated, scaled, etc.                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                            
   @author Zhiliang Xie                                                                                                                                                                                                                                                
   @version for CS56, M16, UCSB                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
*/
public class Mouse extends GeneralPathWrapper implements Shape
{
    /**                                                                                                                                                                                                                                                                      
       Constructor                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                              
       @param x x coord of lower left corner of mouse                                                                                                                                                                                                                         
       @param y y coord of lower left corner of mouse                                                                                                                                                                                                                         
       @param width width of the mouse                                                                                                                                                                                                                                        
       @param height height of mouse                                                                                                                                                           
 */
    
    public Mouse(double x, double y, double width, double height)
    {

	double bodyHeight = .7 * height;
	double headHeight = height - bodyHeight;
	double headWidth=0.8*width;
	double connectHeight=0.1*height;
	
	        Rectangle2D.Double body =
		    new Rectangle2D.Double(x, y+height ,
					   width, bodyHeight);

		Line2D.Double leftConnect=
		    new Line2D.Double(x,y+height,x,y+(height-connectHeight));

		

		Line2D.Double rightConnect=
		    new Line2D.Double(x+width,y+height,x+width,y+(height-connectHeight));
		
		        Line2D.Double leftRoof =
			    new Line2D.Double (x, y+height-connectHeight,
					       x + (width-headWidth)/2,y+bodyHeight-connectHeight );

			        Line2D.Double rightRoof =
				    new Line2D.Double (x + (width-(width-headWidth)/2), y+bodyHeight-connectHeight,
						       x+width, y + height-connectHeight);
				Line2D.Double midLine=
				    new Line2D.Double(x+width/2,y+bodyHeight-connectHeight,x+width/2,y+height);


				    Line2D.Double roof=
					new Line2D.Double(x+(width-headWidth)/2,y+bodyHeight-connectHeight,x+(width-(width-headWidth)/2),y+bodyHeight-connectHeight);
				
				
				// put the whole mouse together

				GeneralPath wholeMouse = this.get();
				wholeMouse.append(body, false);
				wholeMouse.append(rightRoof, false);
				wholeMouse.append(leftRoof, false);
				wholeMouse.append(midLine,false);
				wholeMouse.append(roof,false);
				wholeMouse.append(leftConnect,false);
				wholeMouse.append(rightConnect,false);
    }
}
