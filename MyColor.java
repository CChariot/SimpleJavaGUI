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

import javafx.scene.paint.Color;

public enum MyColor {
    RED ,
    BLUE,
    GREEN;
    
    Color c;
    
    MyColor()
    {
        switch(this.ordinal())
        {
            case 0:
                this.c = Color.RED;
                break;
            case 1:
                this.c = Color.GREEN;
                break;
            case 2:
                this.c = Color.BLUE;
                break;
        }
    }
    
    Color getColor()
    {
        return c;
    }

   static Color mix(Color color1, Color color2){

        Color color = new Color ((color1.getRed()+color2.getRed())/2,(color1.getGreen()+color2.getGreen())/2,
                        (color1.getBlue()+color2.getBlue())/2,(color1.getOpacity()+color2.getOpacity())/2);

        return color;
    }

}
