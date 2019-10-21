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
public class MyPolygon extends MyShape{
    
    int n;
    private double[] xpoints;
    private double[] ypoints;
    
    MyPolygon()
    {
        n = 0;
    }
    
    MyPolygon(double[] xpoints , double[] ypoints , int n)
    {
        this.n = n;
        this.xpoints = xpoints;
        this.ypoints = ypoints;
    }
       
    @Override
    public String toString()
    {
        String desc;
        desc = getClass().getName() + "\n" + "N = " + n;
        return desc;
    }
    
    @Override
    public void draw(GraphicsContext gc)
    {
        usedx1 = Math.max(usedx1, (x - xpoints[1]));
        usedx2 = Math.max(usedx2, (x + xpoints[4]));
        
        usedy1 = Math.max(usedy1, (y - ypoints[0]));
        usedy2 = Math.max(usedy2, (y + ypoints[3]));
        
        gc.fillPolygon(xpoints , ypoints , n);
    }
    
    @Override
    public boolean doOverlap()
    {
        return true;
    }
    
    @Override
    public MyRectangle getMyBoundingBox()
    {
        
        return new MyRectangle(x , y , xpoints[4] - xpoints[1] , ypoints[3]);
    }
}
