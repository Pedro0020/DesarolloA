/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public abstract class Liquido {

    protected Double litros;
    protected String color;

    public Liquido(Double litros, String color) {
        this.litros = litros;
        this.color = color;
    }

    public abstract Liquido mezclar(Liquido l) throws NoSePuedeMezclarException;

    public void incrementar(Double cantidad) {
        this.litros += cantidad;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
