/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

import energias.Bebible;


/**
 *
 * @author alumno
 */
public class Vodka extends Liquido implements Graduable, Bebible {

    public static final String COLOR_RON = "Ambar";

    private Double grados;

    public Vodka(Double litros, Double grados) {
        super(litros, COLOR_RON);
        if (grados <= 1.0) {
            this.grados = grados;
        } else {
            this.grados = 1.0;
        }
    }

    /**
     *
     * @param l
     * @return
     * @throws NoSePuedeMezclarException
     */
    @Override
    public Copa mezclar(Liquido l) throws NoSePuedeMezclarException {
        Copa c = null;
        if (l instanceof Agua || l instanceof Cola) {
            c = new Copa(this, l);
        } else {
            throw new NoSePuedeMezclarException();
        }
        return c;
    }

    @Override
    public Double getGrados() {
        return this.grados;
    }

    @Override
    public Integer getEnergia() {
    int i = (int) ((super.litros * this.grados) - super.litros);
        return -150 * i;    }

}
