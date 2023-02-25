/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputinput;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class OutputInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a float number: ");
        float f = Float.parseFloat(sc.nextLine());
        System.out.print("Enter a double number: ");
        double d = Double.parseDouble(sc.nextLine());

        System.out.format("Integer: %d, Float: %.2f, Double: %.2f\n", n, f, d);
        System.out.printf("Integer: %d, Float: %.2f, Double: %.2f\n", n, f, d);
    }
}
