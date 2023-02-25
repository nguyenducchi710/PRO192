/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Enter your DoB (MM-dd-yyyy): ");
        try{
        Date dob = sdf.parse(sc.nextLine());
            System.out.println("Valid date");
        }catch(ParseException ex){
            System.out.println("Invalid date");
        }
    }
}
