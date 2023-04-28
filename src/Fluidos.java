
import fluidos.*;
import energias.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author alumno
 */
public class Fluidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agua a = new Agua(1.0);
        Vodka v = new Vodka(1.0, 0.4);
        Lejia l = new Lejia(2000.0);
        Ron r = new Ron(1000.0, 0.8);
        Cola c = new Cola(2000.0, Boolean.TRUE);
        Persona p = new Persona("Pedro", 150.0);
        Examen ep = new ExamenPractico("programacion", 60);
        Examen et = new ExamenTest(30, Boolean.TRUE, "mates");
        Accion pf = new partidoFutbol(6);
        System.out.println(p.getEnergia());
        while (p.getEnergia() > 30) {
            p.addTarea(et);
            p.hacerTareas();
            System.out.println(p.getEnergia());

        }
        while (p.getEnergia() < 100) {
            String i:
            switch (JOptionPane.showConfirmDialog(i, et)) {
                case val:
                    
                    break;
                default:
                    throw new AssertionError();
            }

        System.out.println(p.getEnergia());

    }

}
