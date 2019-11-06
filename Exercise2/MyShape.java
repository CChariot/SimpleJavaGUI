/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric_configuration;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Lihan
 */
abstract public class MyShape implements MyShapePositionInterface{
    
    //these are the extreme coordinates that are occupied by the shapes
    double usedx1 = 0;
    double usedx2 = 0;
    
    double usedy1 = 0;
    double usedy2 = 0;
    
    //x and y coordinates
    double x;
    double y;
    
    //Constructors for initializing the object
    MyShape()
    {
        x = 0;
        y = 0;
    }
    MyShape(double x , double y)
    {
        this.x = x;
        this.y = y;
    }
    
    //returning the values of x and y by individual functions
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    
    //setting the values of x and y by individual functions
    void setX(double x)
    {
        this.x = x;
    }
    void setY(double y)
    {
        this.y = y;
    }
    
    
    //the overridden method should always be declared as public
    @Override
    public String toString()
    {
        //getClass() method returns the runtime class of the object.
        //getName() method returns the name of that runtime class
        return getClass().getName();
    }
    
    @Override
    public double distanceTo(double target_x , double target_y)
    {
        return Math.sqrt( Math.pow((target_x - x) , 2.0) + Math.pow((target_y - y) , 2.0 ));
    }
    
    @Override
    public void moveTo(double delta_x , double delta_y)
    {
        x = x + delta_x;
        y = y + delta_y;
    }
    
    @Override
    public double[] getPoint()
    {
        return new double[]{this.x , this.y};
    }
    
    @Override
    public boolean doOverlap()
    {
        MyRectangle bounded = this.getMyBoundingBox();
        if(
                (x - bounded.w/2) > usedx1 && (x + bounded.w/2) > usedx2
                &&
                (y - bounded.h/2) > usedy1 && (y + bounded.h/2) > usedy2    
        )
        {
            return false;
        }
        return true;
    }
    
    abstract void draw(GraphicsContext gc);
}
