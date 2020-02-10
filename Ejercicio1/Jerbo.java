package taller8.Ejercicio1;
public class Jerbo extends Roedor {
   
    public Jerbo(){
    }
    
    @Override
    public String getMamiferoRoedor(){
        return "ROEDOR JERBO ES MAMIFERO"; 
    }
    
    @Override
    public String getComidaRoedor(){
        return "ROEDOR JERBO COME SEMILLAS";
    } 
    
    @Override
    public String caminar(){
     return "EL JERBO CORRE A 3 KM/H";
    }
    
   
}
