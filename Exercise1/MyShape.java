/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric_configuration;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Lihan Zhan
 */
public abstract class MyShape {
    
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
    public String toString()
    {
        //getClass() method returns the runtime class of the object.
        //getName() method returns the name of that runtime class
        return getClass().getName();
    }
    
    abstract void draw(GraphicsContext gc);
}
