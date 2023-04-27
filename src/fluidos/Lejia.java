/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public class Lejia extends Liquido {

    public static final String COLOR_LEJIA = "Icoloro";
    public static final Double PUREZA_DEFECTO = 1.0;

    private Double pureza;

    public Lejia(Double litros) {
        super(litros, COLOR_LEJIA);
        this.pureza = PUREZA_DEFECTO;
    }

    @Override
    public Lejia mezclar(Liquido l) {
        Lejia j = new Lejia(l.litros + this.litros);
        j.setColor(l.color + "-" + this.color);
        j.pureza = l.getClass().equals(j.getClass()) ? 1.0 : this.litros / l.litros;
        return j;
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }
    
}
