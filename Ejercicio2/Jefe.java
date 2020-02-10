package taller8.Ejercicio2;

import java.util.ArrayList;

public class Jefe {
private String nom;
private int sueldoFijo=1000000;
private int sueldoTotal;
private int porcAnalista;
private int numero;
private double porcentajeJefe=0.30;

    public Jefe(){
        
    }
    
    public void Jefe(String nom){
        this.nom=nom;
    }
    
    public void setPorcentajeAnalista(int porc){
    this.porcAnalista=porc;
    }
    
    public void setSueldoTotal(int sueldoTotal){
    this.sueldoTotal=sueldoTotal;
    }
    
    public int getSueldoTotal(){
    return sueldoTotal;
    }
    
    public double getSueloJefe(){
    return sueldoTotal*porcentajeJefe;
    }
    public int getNumProyectoAnalista(){
        numero = (int) (Math.random()*1) ;
        return numero;
    }
    
    public String[] mostrarDatos(){
        String[] info = new String[4];
        info[1] = String.valueOf(porcAnalista);
        info[0] = this.nom;
        info[2]=String.valueOf(sueldoTotal*porcentajeJefe);
        info[3]=String.valueOf(this.getNumProyectoAnalista());
        
        return info;
    }
    
}
