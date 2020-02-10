package taller8.Ejercicio3;

public class Saturno extends Planeta {
private double g=1002300;
private double masa;

    public Saturno(double masa){
        this.masa=masa;
    }
    public void setMasa(double masa){
    this.masa=masa;
    }
    public double getPeso(){
       return this.masa*g;
    }
    
}
