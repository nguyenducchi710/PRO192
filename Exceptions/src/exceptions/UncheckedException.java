/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter an integer: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n);
        }catch(NumberFormatException err){
            System.out.println("Error: " + err.getMessage());
        }
    }
}
