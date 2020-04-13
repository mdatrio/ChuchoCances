/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitario.Core;

import java.util.ArrayList;

/**
 *
 * @author Carlos Somoza
 */
public class Mainisimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Baraja b=new Baraja();
        b.crearCartas();
        b.barajarCartas();
        System.out.println(b.toString());
        
    }
    
}
