/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Validatior {
    
    static Scanner sc = new Scanner(System.in);

    public static int inputInteger(String message, int min, int max) {
        while (true) {
            try {
                System.out.print(message);
                int n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                } else {
                    System.out.println("[!] Invalid data! [!]");
                }
            } catch (NumberFormatException e) {
                System.out.println("[!] Error: " + e.getMessage() + " [!]");
            }
        }
    }
    
    public static Date inputDate(String message, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setLenient(false);
        while (true) {
            try {
                System.out.format("%s (%s): ",message,pattern);
                Date date = sdf.parse(sc.nextLine());
                return date;
            } catch (ParseException e) {
                System.out.println("[!] Error: " + e.getMessage() + " [!]");
            }
        }
    }
    
    public static String inputString(String message, int min, int max) {
        while (true) {
            System.out.println(message);
            String name = sc.nextLine();
            int length = name.length();
            if (length >= min && length <= max) {
                return name;
            } else {
                System.out.println("Enter again!");
            }

        }

    }
}
