/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerdatejava8;

import java.time.LocalDateTime;

/**
 *
 * @author Bryan
 */
public class ExerDateJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDateTime data = LocalDateTime.parse("2010-05-15T10:00:00");
        System.out.println(data);
        
        data = data.plusHours(13).plusYears(4l).plusMonths(6l);
        
        System.out.println(data);
        
    }
    
}
