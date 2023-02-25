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
public class TryCatchFinally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        sdf.setLenient(false);
        try {
            System.out.println("Enter an integer: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("Enter date (MM-đ-yyyy): ");
            System.out.println("Enter your DoB (MM-dd-yyyy): ");
            Date date = sdf.parse(sc.nextLine());
            System.out.println(n);
        } catch (NumberFormatException err) {
            System.out.println("Error: ");
        } catch (ParseException err) {
            System.out.println("Error: ");
        } catch (Exception err) {
            System.out.println("");
        } finally 
        { System.out.println("Bye");}

    }
}
