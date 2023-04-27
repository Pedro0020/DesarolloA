/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fluidos;

/**
 *
 * @author alumno
 */
public class Fluidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agua a = new Agua(2000.0);
        Vodka v = new Vodka(1000.0,0.4);
        Lejia l = new Lejia(2000.0);
        Ron r = new Ron(1000.0, 0.8);
        Cola c = new Cola(2000.0, Boolean.TRUE);
        System.out.println(a.mezclar(l).color);
        System.out.println(a.mezclar(r).color);
        try {
        System.out.println(v.mezclar(c).color);
        System.out.println(v.mezclar(a).color);
        System.out.println(r.mezclar(l).color);
        }catch (NoSePuedeMezclarException n){
            System.out.println(n);
        }
    }
    
    
}
