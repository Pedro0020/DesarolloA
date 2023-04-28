package energias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MarcosB <your.name at your.org>
 */
public class partidoFutbol implements Accion {
    
    private Integer categoria;
    private Boolean prorroga;
    private Boolean penaltis;
    private Integer energiaNecesaria;

    public partidoFutbol(Integer categoria) {
        this.categoria = comprobarCategoria(categoria);
        this.prorroga = false;
        this.penaltis = false;
        this.energiaNecesaria=calcularEnergia();
    }
    
    
    private Integer comprobarCategoria(Integer categoria){
        Integer salida = 0;
        switch (categoria){
            case 1:
                salida = 1;
            case 2:
                salida = 2;
            case 3:
                salida = 3;
            case 4:
                salida = 4;
            case 5:
                salida = 5;
            case 6:
                salida = 6;
            case 7:
                salida =7;
            default:
                salida = 1;
        }
        return salida;
    }
    

    private Integer calcularEnergia() {
        int energia = 100;
        energia= this.categoria * 40;
        if(getProrroga()){
            energia += 15/100;
        }
        if(getPenaltis()){
            energia += 5/100;
        }
        return energia;
    }
    
    public void hacer(){
        String salida = "Jugando un partido de categoria "+this.categoria;
        if(getProrroga()){
            salida +="con prorroga";
        }
        if(getPenaltis()){
            salida+="y penaltis";
        }
        System.out.println(salida);
    }

    @Override
    public Integer getEnergia() {
        return energiaNecesaria;
    }
    
    public Boolean getProrroga() {
        return prorroga;
    }

    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
    }

    public Boolean getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(Boolean penaltis) {
        this.penaltis = penaltis;
    }






}
