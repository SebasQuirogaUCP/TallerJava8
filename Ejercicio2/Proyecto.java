package taller8.Ejercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proyecto {

private int cod;    
private String fecha;
private int costo;
private String nom;
private String jefe;

ArrayList <Analista> analistas = new ArrayList<Analista>();
Analista[] analista = new Analista[6];
private int numAnalistas;
    
    public int getCod() {
        return cod;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCosto() {
        return costo;
    }

    public String getNom() {
        return nom;
    }

    public String getJefe() {
        return jefe;
    }

    public int getNumAnalistas() {
        return numAnalistas;
    }
    


    public void setNumAnalistas(int numAnalistas) {
        this.numAnalistas = numAnalistas;
    }


    public Proyecto(){
        
        
    }
    
    public void cargarDatos(String nom,int cod, String fecha, int sueldoTotal,  int numAnalistas){
    this.cod=cod;
    this.fecha=fecha;
    this.costo=sueldoTotal;
    this.jefe=jefe;
    this.nom=nom;
    this.numAnalistas=numAnalistas;
    
    }
    public String[] mostrarDatos(){
        
        String info[] = new String[5];
        info[0]=this.getNom();
        info[1]=String.valueOf(this.getCod());
        info[2]=this.getJefe();
        info[3]=String.valueOf(this.getNumAnalistas());
        info[4]=String.valueOf(this.getCosto());
        
        
        return info;
    }
    
    public double calcularDatos(int numAnalistas){
        Analista analista = new Analista();
        double temp=analista.getSueldo();
        
        return temp*numAnalistas;
    }
     
    public void agregarAnalista(){
        
        String n=JOptionPane.showInputDialog(null, "INGRESE NOMBRE ANALISTA", "INGRESAR ANALISTA", 1);
        String n1=JOptionPane.showInputDialog(null, "INGRESE CODIGO", "INGRESAR ANALISTA", 1);
        String n2=JOptionPane.showInputDialog(null, "INGRESE TAREA", "INGRESAR ANALISTA", 1);
        analista[4].Analista(n, Integer.parseInt(n1), n2, 123000);
        
    }
    
}
