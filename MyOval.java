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

public class MyOval extends MyShape {
    
    double Perimeter;
    double Area;
    
    MyRectangle m; //Rectangle that inscribe the Oval.
    
    //Constructors for initializing the object
    MyOval()
    {
        m = new MyRectangle();
    }
    MyOval(MyRectangle m)
    {
        this.m = m;
    }
    
     double getPerimeter()
     {
         Perimeter = 2 * 3.14 * Math.sqrt((Math.pow(m.h , 2) + Math.pow(m.w  ,2)) / 2);
         return Perimeter;
     }
     double getArea()
     {
         Area = 3.14 * (m.h / 2) * (m.w / 2);
         return Area;
     }
     
     //the overridden method should always be declared as public
    public String toString()
    {
        String desc = getClass().getName() + "\n" + "Minor Axis = " + Double.toString((m.h / 2)) + "\n" + "Major Axis = " + Double.toString((m.w / 2))
                + "\n" + "Perimeter = " + Double.toString(getPerimeter()) + "\n" + "Area = " + Double.toString(getArea());
        return desc;
    }
    
    void draw(GraphicsContext gc)
    {
        gc.fillOval((m.x - (m.w/2)) , (m.y - (m.h/2)) , m.w , m.h);
    }
}
