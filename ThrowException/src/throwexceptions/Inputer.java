package throwexceptions;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class Inputer {

    public static int inputInteger(String message, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        int n = Integer.parseInt(sc.nextLine());
        if (n >= min && n <= max) {
            return n;
        } else {
            String reason = String.format("[!] Invalid data. The integer must be belong [%d,%d]", min, max);
            throw new NumberFormatException(reason);
        }

    }
}