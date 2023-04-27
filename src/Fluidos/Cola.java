/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fluidos;

/**
 *
 * @author alumno
 */
public class Cola extends Liquido {

    private Boolean cafeina;

    public Cola(Double litros, String color, Boolean cafeina) {
        super(litros, color);
        this.cafeina = cafeina;
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    public Boolean getCafeina() {
        return cafeina;
    }

    public void setCafeina(Boolean cafeina) {
        this.cafeina = cafeina;
    }

}
