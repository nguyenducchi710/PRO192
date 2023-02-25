/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputinput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Student {

    private int id;
    private String name;
    private Date dob;
    private double score;
    
    Scanner sc = new Scanner(System.in);
    
    public Student(int id, String name, Date dob, double score) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.score = score;
    }
    
    public static void displayHeader() {
        System.out.println(StringEx.repeat("_",64));
        System.out.format("| %5s | %-30s | %10s | %6s |\n", "id", "name", "dob", "score");
        System.out.println(StringEx.repeat("_",64));    
    }

    public void display1() {
        System.out.format("| %5d | %-30s | %10tD | %6.2f |\n", id, name, dob, score);
    }
    
    public void display2() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.format("| %5d | %-30s | %10s | %6.2f |\n", id, name, sdf.format(dob), score);
    }
    
    public void addStudent() throws ParseException{
        System.out.println("ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("DoB: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.dob = sdf.parse(sc.nextLine());
        System.out.println("Score: ");
        this.score = Double.parseDouble(sc.nextLine());       
    }

    public Student() {
    }
}
