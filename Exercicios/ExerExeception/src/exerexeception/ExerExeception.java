/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerexeception;

/**
 *
 * @author Bryan
 */
public class ExerExeception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b;
        a = 0;
        b = 1;
        int[] array = new int[10];
       
        try {
            //int res = b / a; //java.lang.ArithmeticException
            //System.out.println(array[15]); //java.lang.ArrayIndexOutOfBoundsException
            ExerExeception exer = new ExerExeception();
            exer.daErro();
            
            
        } catch(java.lang.ArithmeticException | java.lang.ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage() + " Deu erro");
        } finally {
            System.out.println("Passo");
        }
        
        
    }
    
    public void daErro(){
        double[] str = new double[10];
        System.out.println(str[100]);
    }
    
    
    
    
}
