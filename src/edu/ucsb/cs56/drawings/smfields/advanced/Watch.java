package edu.ucsb.cs56.drawings.smfields.advanced;

import edu.ucsb.cs56.drawings.jstaahl.simple.Circle;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

/**
 * Created by steven on 7/26/16.
 * Class for a general watch shape
 * @author Steven Fields
 */
public class Watch extends GeneralPathWrapper implements Shape {


    double watchStrapHeight;
    double watchStrapWidth;

    double circleCenterX;
    double circleCenterY;
    /**
     * @param x The x coordinate, corresponding to the left side of the object
     * @param y The y coordinate from the top, corresponding to the top of the object
     * @param radius This will be the radius of the watch face and the straps width and height will change depending on this
     */
    public Watch(double x, double y, double radius) {
        watchStrapHeight = radius * 4;
        watchStrapWidth = radius * 1.25;

        Rectangle2D.Double strap = new Rectangle2D.Double(x, y, watchStrapWidth, watchStrapHeight);

        circleCenterX = x + strap.getWidth()/2;
        circleCenterY = y + strap.getHeight()/2;

        Circle circle = new Circle(circleCenterX, circleCenterY, radius);

        GeneralPath watch = this.get();

        watch.append(strap, false);
        watch.append(circle, false);

    }

}
