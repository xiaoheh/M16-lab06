package edu.ucsb.cs56.drawings.wbennett.advanced;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by William Bennett on 7/26/2016.
 */
public class Wizard extends Person implements Shape{

    public Wizard(double x, double y, double width, double height) {
        super(x, y, width, height);
        GeneralPath path = this.get();

        double hatx1 = width * .35 + x;
        double hatx2 = width * .5 + x;
        double hatx3 = width * .65 + x;
        double haty1 = height * .1 + y;
        double haty2 = -(height * .2) + y;
        double haty3 = haty1;
        Line2D.Double hatSeg1 = new Line2D.Double(hatx1, haty1, hatx2, haty2);
        Line2D.Double hatSeg2 = new Line2D.Double(hatx2, haty2, hatx3, haty3);
        Line2D.Double hatSeg3 = new Line2D.Double(hatx3, haty3, hatx1, haty1);

        double staffWidth = width * .05;
        double staffHeight = height * .5;
        double staffX = x + width * 5 /6 ;
        double staffY = y + height * 1/4;

        Rectangle2D.Double staff = new Rectangle2D.Double(staffX, staffY, staffWidth, staffHeight);

        double staffCenterX = staffX + staffWidth / 2;

        double staffOrbWidth = width * .05;
        double staffOrbHeight = height * .05;
        double staffOrbX = staffX;
        double staffOrbY = staffY - staffOrbHeight;

        Ellipse2D staffOrb = new Ellipse2D.Double(staffCenterX - staffOrbWidth / 2, staffOrbY, staffOrbWidth, staffOrbHeight);
        path.append(hatSeg1, false);
        path.append(hatSeg2, false);
        path.append(hatSeg3, false);
        path.append(staff, false);
        path.append(staffOrb, false);
    }
}
