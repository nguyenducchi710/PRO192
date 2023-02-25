/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationdemo;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author asus
 */
public class ValidationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Validatior.inputInteger("Input an integer in [10,20]: ",10,20);
        Date date = Validatior.inputDate("Your DoB: ", "MM-dd-yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Your DoB is: " + sdf.format(date));
        String name = Validatior.inputString("Your name", 3, 10);
    }
    
}
