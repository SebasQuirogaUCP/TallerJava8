package taller8.Ejercicio3;

public class Jupiter extends Planeta {
private double g=160;
private double masa;

    public Jupiter(double masa){
        this.masa=masa;
    }
    public void setMasa(double masa){
    this.masa=masa;
    }
    public double getPeso(){
       return this.masa*g;
    }
}
