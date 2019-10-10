/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric_configuration;

/**
 *
 * @author Lihan Zhan
 */

import java.lang.Math;
import javafx.scene.canvas.GraphicsContext;

public class MyLine extends MyShape {
    
    double x1 , x2;
    double y1 , y2;
    double angle;
    
    double length;
    
    //Constructors for initializing the object
    MyLine()
    {
        angle = 0;
        
        x1 = 0;
        y1 = 0;
        
        x2 = 0;
        y2 = 0;
        
        length = Math.sqrt(  Math.pow(this.x2 - this.x1 , 2) + Math.pow(this.y2 - this.y1 , 2));
    }
    MyLine(double x1 , double y1 , double x2 , double y2)
    {   
        this.x1 = x1;
        this.y1 = y1;
        
        this.x2 = x2;
        this.y2 = y2;
    }
    double getAngle(){
        double tantheta = (this.y2 - this.y1) / (this.x2 - this.x1);
        angle = Math.atan(tantheta);
        angle = Math.toDegrees(angle);
        return angle;
    }
    double getLength(){
        length = Math.sqrt(  Math.pow(this.x2 - this.x1 , 2) + Math.pow(this.y2 - this.y1 , 2));
        return length;
    }
    //the overridden method should always be declared as public
    public String toString()
    {
        String desc = getClass().getName() + "\n" + "Length = " + Double.toString(getLength()) + "\n" + "Angle = " + Double.toString(getAngle());
        return desc;
    }
    
    void draw(GraphicsContext gc)
    {
        gc.strokeLine(x1 , y1 , x2 , y2);
    }
}
