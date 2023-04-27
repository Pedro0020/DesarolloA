/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public class Cola extends Liquido {
    public static final String COLOR_COCA = "marron";
    private Boolean cafeina;

    public Cola(Double litros, Boolean cafeina) {
        super(litros, COLOR_COCA);
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
