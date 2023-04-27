/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fluidos;

/**
 *
 * @author alumno
 */
public class Ron extends Liquido implements Graduable {

    public static final String COLOR_RON = "Ambar";

    private Double grados;

    public Ron(Double litros, Double grados) {
        super(litros, COLOR_RON);
        if (grados <= 1.0) {
            this.grados = grados;
        } else {
            this.grados = 1.0;
        }
    }

    @Override
    public Copa mezclar(Liquido l) throws NoSePuedeMezclarException {
        Copa c = null;
        if (l instanceof Agua || l instanceof Cola) {
            c = new Copa(this, l, this.litros + l.litros, l.color + "-" + this.color);
        } else {
            throw new NoSePuedeMezclarException();
        }
        return c;
    }

    @Override
    public Double getGrados() {
        return this.grados;
    }

}
