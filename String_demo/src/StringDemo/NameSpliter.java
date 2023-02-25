/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringDemo;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class NameSpliter {

    public static void main(String[] args) {
        System.out.print("Nhap ho ten");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.trim().replaceAll(" +", " ");
        int first = name.indexOf(" ");
        int last = name.lastIndexOf(" ");
        String firstname = name.substring(0, first);
        String midlename = name.substring(first + 1, last);
        String lastname = name.substring(last + 1);
        System.out.println("First name: " + firstname);
        System.out.println("Midle name: " + midlename);
        System.out.println("Last name: " + lastname);
        System.out.println("Full name: " + name);
       
    }
    
}
