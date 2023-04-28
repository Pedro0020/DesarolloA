package energias;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MarcosB <your.name at your.org>
 */
public class Persona implements Energetico {

    private String nombre;
    private final Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;
    private Stack<Accion> tareas;

    public Persona(String nombre,  Double capacidadVejiga) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.estadoVejiga = 0.0;
        this.energiaActual = 100;
        this.tareas = new Stack();
    }

    public void addTarea(Accion a) {
        tareas.add(a);
    }

    public Integer hacerTareas() {
        int contador = 0;
        int totales = tareas.size();
        Accion x;
        for (Accion tarea : tareas) {
            x = tareas.peek();
            if (x.getEnergia() < energiaActual) {
                contador++;
                energiaActual -= x.getEnergia();
            }

        }
        if (totales > contador) {
            this.energiaActual = 0;
        }
        return contador;
    }

    public void vaciarVejiga() {
        this.estadoVejiga = 0.0;
    }

    public Double beber(Bebible x) {
        //Cuanto me bebo??
        if (this.estadoVejiga + x.getLitros() <= this.capacidadVejiga) {
            this.estadoVejiga += x.getLitros();
            this.energiaActual += x.getEnergia();
        }
        return 0.0;
    }

    @Override
    public Integer getEnergia() {
        return energiaActual;
    }

    public Double getEstadoVejiga() {
        return estadoVejiga;
    }

    public Double getCapacidadVejiga() {
        return capacidadVejiga;
    }

}
