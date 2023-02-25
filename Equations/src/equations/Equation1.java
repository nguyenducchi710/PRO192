/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equations;

/**
 *
 * @author asus
 */
public class Equation1 {

    public static String slove (double a, double b){
        /*double x = 0;
        if (a==0 && b==0){
            System.out.println("The equation has infinitely many solutions");
        }else if (a==0 && b!=0){
            System.out.println("The equation has no solution");
            
        }else{
            x = -b/a; return x;
        }
        return x;*/
        if (a==0){
            if (b==0){
                return "Vo so nghiem";
            }else {
                return "Vo nghiem";
            }
        }
        return String.valueOf(-b/a);
    }

    public static void main(String[] args) {
        double a = 1, b = 1;
        System.out.println("Solution of the equation ax + b = 0:  " + slove(a,b));
        
    }
    
}
