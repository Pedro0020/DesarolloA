/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public class Copa extends Liquido implements Graduable {

    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Graduable alcohol, Liquido mezcla) {
        super(0.0, "l");
        Liquido l = (Liquido) alcohol;
        Liquido la = (Liquido) mezcla;
        super.color = l.color + "-" + la.color;
        super.litros = l.litros + la.litros;
        this.mezcla = mezcla;
        this.alcohol = alcohol;
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(Liquido mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public Double getGrados() {
        if (this.alcohol instanceof Vodka e) {
            e = (Vodka) this.alcohol;
            return e.getGrados() * e.litros / super.litros;
        } else if (this.alcohol instanceof Ron e) {
            e = (Ron) this.alcohol;
            return e.getGrados() * e.litros / super.litros;
        }
        return null;
    }
    
}
