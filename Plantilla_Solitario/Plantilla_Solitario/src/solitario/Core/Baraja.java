/*
* Representa la baraja española, 40 cartas, 4 palos, valores de las cartas de 1 a 12 (excepto 8 y 9). 
* Estructura: se utilizará un TAD adecuado
* Funcionalidad: estando la baraja desordenada, devolverá la carta situada encima del montón de cartas
 */
package solitario.Core;

import java.util.ArrayList;
import java.util.Random;
import solitario.Core.Carta.tipoPalo;

public class Baraja {

    private ArrayList<Carta> barajas = new ArrayList<>();
    private final int NUMCARTAS = 48;
    private int numElem;

    public Baraja() {
        barajas = new ArrayList<>(NUMCARTAS);
        numElem = 0;
    }

    public ArrayList<Carta> getBarajas() {
        return barajas;
    }

    public void setBarajas(ArrayList<Carta> barajas) {
        this.barajas = barajas;
    }

    public int getNumElem() {
        return numElem;
    }

    public void setNumElem(int numElem) {
        this.numElem = numElem;
    }

    /* public void addCarta(Carta c) {
        if (numElem == NUMCARTAS) {
            System.out.println("Baraja llena");
        }
        barajas.add(c);
        numElem++;
    }
     */
    public void crearCartas() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                switch (i) {
                    case 0:
                        Carta c = new Carta(j, tipoPalo.BASTOS);
                        c.setPalo(tipoPalo.BASTOS);
                        barajas.add(c);
                        break;
                    case 1:
                        Carta d = new Carta(j, tipoPalo.COPAS);
                        d.setPalo(tipoPalo.COPAS);
                        barajas.add(d);
                        break;
                    case 2:
                        Carta e = new Carta(j, tipoPalo.ESPADAS);
                        e.setPalo(tipoPalo.ESPADAS);
                        barajas.add(e);
                        break;
                    case 3:
                        Carta f = new Carta(j, tipoPalo.OROS);
                        f.setPalo(tipoPalo.OROS);
                        barajas.add(f);
                        break;

                }

            }
        }
    }

    public void barajarCartas() {
        Random rd = new Random();
        ArrayList<Carta> aux = new ArrayList<>();
        for (int i = 0; i < NUMCARTAS; i++) {
            int j = rd.nextInt(barajas.size());
            aux.add(barajas.get(j));
            barajas.remove(j);

        }
        barajas = aux;

    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < barajas.size(); i++) {
            build.append(barajas.get(i) + "\n");
        }
        return build.toString();
    }

}
