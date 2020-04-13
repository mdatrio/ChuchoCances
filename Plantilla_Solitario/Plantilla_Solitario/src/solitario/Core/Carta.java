/*
 * Representa una carta, formada por un número y su palo correspondiente
 */
package solitario.Core;

import java.util.ArrayList;

/**
 *
 * @author AEDI
 */
public class Carta {
    private int numero;
    public enum tipoPalo{BASTOS,ESPADAS,OROS,COPAS};
    private tipoPalo palo;

    public Carta(int numero, tipoPalo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public tipoPalo getPalo() {
        return palo;
    }

    public void setPalo(tipoPalo palo) {
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
   
    //Las cartas son los padres


}
