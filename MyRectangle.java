/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric_configuration;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Lihan Zhan
 */
public class MyRectangle extends MyShape{
    
    double h;
    double w;
    
    double Perimeter;
    double Area;
    
    //Constructors for initializing the object
    MyRectangle()
    {
        h = 0;
        w = 0;
    }
    MyRectangle(double x , double y , double w , double h)
    {
        super(x , y);
        
        this.h = h;
        this.w = w;
    }
    double getPerimeter(){
        return 2 * (this.h + this.w);
    }

    double getArea(){
        return this.h * this.w;
    }
    //the overridden method should always be declared as public
    public String toString()
    {
        String desc = getClass().getName() + "\n" + "Width = " + Double.toString(w) + "\n" + "Height = " + Double.toString(h)
                 + "\n" + "Perimeter = " + Double.toString(getPerimeter()) + "\n" + "Area = " + Double.toString(getArea());
        return desc;
    }
    
    void draw(GraphicsContext gc)
    {
        gc.fillRect((x - (w/2)) , (y - (h/2)) , w , h);
    }
}
