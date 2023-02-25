/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author asus
 */
public class ExceptionPropagation {
    public static void A() {
        B();
    }
    public static void B() {
        C();
    }
    public static void C() {
        D();
    }
    public static void D(){
        
    }
}
