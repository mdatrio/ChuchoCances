/*
 * Representa al único jugador de la partida, identificado por el nombre 
 * Funcionalidad: le da la vuelta a una carta que está boca abajo, escoge una carta para moverla o al montón de descarte
 *                o la mueve encima de otra carta del interior
 */
package solitario.Core;
// SOMOZA ERES UN IMBERBE DE MERDA
/**manupe cagon
 *
 * @author AEDI
 */
public class Jugador {
    String nombre;
    boolean ganador;
    public Jugador(String nom){
    this.nombre=nom;
    ganador=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

}

