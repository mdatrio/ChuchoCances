
package solitario.IU;

import java.util.ArrayList;
import solitario.Core.Baraja;
import static solitario.IU.Solitario.inicioPartida;
import solitario.Core.*;

/**
 *
 * @author AEDI
 */
public class Main {
    
 public static void main(String[] args) {              

//inicioPartida();
 
        Baraja b=new Baraja();
        b.crearCartas();
        b.barajarCartas();
        System.out.println(b.toString());

}

    
}
