/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringDemo;

/**
 *
 * @author asus
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = new String("Hi Everyone");
        String s = "Hello Everybody";
        System.out.println(a+" "+s);
        System.out.println(a.length()+" "+s.length());
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(a.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(1, 6));
        
        String[] e = s.split(" ");
        /*for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
            
        }*/
        for (String x:e){
            System.out.println(x);
        }
        String newS = s.replace("Hello", "Hi");
        System.out.println(newS);
        System.out.println(s.indexOf("e"));
        System.out.println(s.lastIndexOf("e"));
        
        
    }
    
}
