/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fluidos;

/**
 *
 * @author alumno
 */
public class Agua extends Liquido {

    public static final String COLOR_AGUA = "Icoloro";
    public static final Double PUREZA_DEFECTO = 1.0;

    private Double pureza;

    public Agua(Double litros) {
        super(litros, COLOR_AGUA);
        this.pureza = PUREZA_DEFECTO;
    }

    @Override
    public Agua mezclar(Liquido l) {
        Agua a = new Agua(l.litros + this.litros);
        a.setColor(l.color + "-" + this.color);
        a.pureza = l.getClass().equals(a.getClass()) ? 1.0 : this.litros / l.litros;
        return a;
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }

}
