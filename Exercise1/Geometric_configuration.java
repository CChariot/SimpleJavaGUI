/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric_configuration;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Lihan Zhan
 */

public class Geometric_configuration extends Application{

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
        // TODO code application logic here
       launch(args);
    }
     
     public void start(Stage primaryStage) throws Exception
    {
        //window and canvas creation code
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1000, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        //pair 1
        gc.setFill(MyColor.RED.getColor());
        MyRectangle rect1 = new MyRectangle(500 , 250 , 500 , 250);
        rect1.draw(gc);
        gc.setFill(MyColor.BLUE.getColor());
        MyOval oval1 = new MyOval(rect1);
        oval1.draw(gc);
        
        //pair 2
        gc.setFill(MyColor.mix(MyColor.RED.getColor(),MyColor.BLUE.getColor()));
        MyRectangle rect2 = new MyRectangle(500 , 250 , 353.553 , 176.77);
        rect2.draw(gc);
        gc.setFill(MyColor.GREEN.getColor());
        MyOval oval2 = new MyOval(rect2);
        oval2.draw(gc);
        
        //pair 3
        gc.setFill(MyColor.mix(MyColor.GREEN.getColor(),MyColor.BLUE.getColor()));
        MyRectangle rect3 = new MyRectangle(500 , 250 , 249.99 , 124.99);
        rect3.draw(gc);
        gc.setFill(MyColor.RED.getColor());
        MyOval oval3 = new MyOval(rect3);
        oval3.draw(gc);
        
        MyLine line = new MyLine(0 , 0 , 1000 , 500);
        line.draw(gc);
        
        //canvas and window attribute code
        root.getChildren().add(canvas);
        primaryStage.setTitle("Figure");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
