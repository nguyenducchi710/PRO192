/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Student {
    int id;
    String name;
    double score;
    
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ID: ");
        this.id = Integer.parseInt(sc.nextLine()); //Doi kieu du lieu qua Integer
        System.out.println("Input Name: ");
        this.name = sc.nextLine();
        System.out.println("Input Score: ");
        this.score = Double.parseDouble(sc.nextLine()); //Doi kieu du lieu qua Double
    }
    
    public void outputInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Score: " + this.score);
        
              
    }
            
            
    
    
}
