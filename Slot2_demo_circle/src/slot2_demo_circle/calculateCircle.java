/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot2_demo_circle;

import javafx.scene.shape.Circle;

/**
 *
 * @author asus
 */
public class calculateCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Perimeter c1: " + c1.calculatePerimeter());
        
        Circle c2 = new Circle(100);
        System.out.println("Area c2: " + c2.calculateArea());
        System.out.println("Perimeter c2: " + c2.calculatePerimeter());
    }

   
}
