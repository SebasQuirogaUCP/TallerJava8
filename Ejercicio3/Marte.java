package taller8.Ejercicio3;

public class Marte  extends Planeta{
    private double masa;
    private double g=1231;
    
    public Marte(double masa){
        this.masa=masa;
    }
    public void setMasa(double masa){
    this.masa=masa;
    }
    public double getPeso(){
    return this.masa*g;
    }
}
