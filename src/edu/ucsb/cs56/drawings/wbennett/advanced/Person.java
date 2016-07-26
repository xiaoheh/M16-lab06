package edu.ucsb.cs56.drawings.wbennett.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.wbennett.simple.Circle;
import javafx.scene.shape.Ellipse;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

/**
 * Created by William Bennett on 7/26/2016.
 */
public class Person extends GeneralPathWrapper implements Shape {



    public Person(double x, double y, double width, double height) {
        // The head takes up 25% of the
        double headWidth = width * .25;
        double headHeight = height * .20;
        double headTop = 0f;
        double headBottom = height * .25;
        double armTop = height * .30;
        double armBottom =  height * .45;
        double legTop = height * .70;
        double legBottom = height;
        double center =  width / 2;
        double armWidth = width / 3;
        double legWidth = width / 4;
        Ellipse2D head = new Ellipse2D.Double(x + center - headWidth / 2, y + headBottom - headHeight, headWidth, headHeight);


        Line2D.Double body = new Line2D.Double(center + x, headBottom + y, center + x, legTop + y);
        Line2D.Double leftArm = new Line2D.Double(center + x, armTop + y, center + x - armWidth, armBottom + y);
        Line2D.Double rightArm = new Line2D.Double(center + x, armTop + y, center + x + armWidth, armBottom + y);
        Line2D.Double leftLeg = new Line2D.Double(center + x, legTop + y, center + x - legWidth, legBottom + y);
        Line2D.Double rightLeg = new Line2D.Double(center + x, legTop + y, center + x + legWidth, legBottom + y);

        GeneralPath wholePerson = this.get();
        wholePerson.append(head, false);
        wholePerson.append(body, false);
        wholePerson.append(leftArm, false);
        wholePerson.append(rightArm, false);
        wholePerson.append(leftLeg, false);
        wholePerson.append(rightLeg, false);
    }
}
