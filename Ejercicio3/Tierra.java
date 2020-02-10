
package taller8.Ejercicio3;

public class Tierra extends Planeta {
private double masa;
private double g=9.8;
    
    public Tierra(double masa){
        this.masa=masa;
    }
    public void setMasa(double masa){
    this.masa=masa;
    }
    public double getPeso(){
    return this.masa*g;
    }
    
}
