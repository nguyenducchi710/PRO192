/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwexceptions;
/**
 *
 * @author asus
 */
public class ThrowExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int n = Inputer.inputInteger("Enter an integer", 10, 20);
            System.out.println("Success");
        }
        catch(Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
                
    }
    
}
