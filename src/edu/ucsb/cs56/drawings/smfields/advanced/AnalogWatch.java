package edu.ucsb.cs56.drawings.smfields.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by steven on 7/26/16.
 * Class that extends Watch to make an Analog Watch that tells time!
 * @author Steven Fields
 */
public class AnalogWatch extends Watch {

    /**
     *
     * @param x The x coordinate of the watch
     * @param y They y coordinate of the watch
     * @param radius The radius of the watch face
     */
    public AnalogWatch(double x, double y, double radius) {
        super(x, y, radius);
        Calendar calendar = Calendar.getInstance();
        double hour = calendar.get(Calendar.HOUR);
        double minutes = calendar.get(Calendar.MINUTE);

        GeneralPath gp = this.get();

        Point2D.Double center = new Point2D.Double(this.circleCenterX, this.circleCenterY);
        Point2D.Double minuteHandPoint = new Point2D.Double(circleCenterX + Math.cos(2 * Math.PI * (minutes/60) - Math.PI/2) * radius * .9,
                                                            circleCenterY + Math.sin(2 * Math.PI * (minutes/60) - Math.PI/2) * radius * .9);
        Point2D.Double hourHandPoint = new Point2D.Double(circleCenterX + Math.cos(2 * Math.PI * (hour/12) - Math.PI/2) * radius/2,
                                                          circleCenterY + Math.sin(2 * Math.PI * (hour/12) - Math.PI/2) * radius/2);

        Line2D.Double minuteHand = new Line2D.Double(center, minuteHandPoint);
        Line2D.Double hoursHand = new Line2D.Double(center, hourHandPoint);

        gp.append(minuteHand, false);
        gp.append(hoursHand, false);


    }

}
