package energias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MarcosB <your.name at your.org>
 */
public class ExamenTest extends Examen {
    private Integer numPreguntas;
    private Boolean resta;

    public ExamenTest(Integer numPreguntas, Boolean resta, String asignatura) {
        super(asignatura, numPreguntas/2);
        this.numPreguntas = numPreguntas;
        this.resta = resta;
        this.energiaNecesaria= calcularEnergia();
    }
    
 
    private Integer calcularEnergia() {
        int energia= 100;
        if(resta){
            energia = getNumPreguntas() / 2;
        }else{
            energia = getNumPreguntas() / 4; 
                  
        }
        return energia;
    }
    
    
    @Override
    public Integer getEnergia(){
        return energiaNecesaria;
        }
        

       

    
    @Override
    public void hacer() {
        for (int i = 0; i < getNumPreguntas(); i++) {
            System.out.println("Haciendo pregunta "+i+" del examen de la asignatura "+getAsignatura());            
        }
    }

    public Integer getNumPreguntas() {
        return numPreguntas;
    }

    public Boolean getResta() {
        return resta;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }

}
