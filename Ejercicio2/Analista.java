package taller8.Ejercicio2;



public class Analista {

private int cod;
private String nom;
private double sueldo;
private String tarea;
private double sueldoTotal;
private double porcAnalista;
private int proyectos;

    public void setPorcAnalista(double porcAnalista) {
        this.porcAnalista = porcAnalista;
    }

    public double getPorcAnalista() {
        return porcAnalista;
    }


    public Analista() {
        Jefe j = new Jefe();
        this.sueldoTotal=j.getSueldoTotal();
        proyectos=j.getNumProyectoAnalista();
        
    }
    public void Analista(String nom, int cod, String tarea, double sueldo){
    this.cod=cod;
    this.nom=nom;
    this.tarea=tarea;
    this.sueldo=sueldo;
    }

    public int getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getTarea() {
        return tarea;
    }
        public String[] mostrarDatos(){
    
        String[] datosAnalista=  new String[4];
        datosAnalista[0]=nom;
        datosAnalista[1]=String.valueOf(cod);
        datosAnalista[2]=String.valueOf(sueldo);
        datosAnalista[3]=tarea;
        
        return datosAnalista;
            
        
    }
    public double tomarSueldo(){
    return this.sueldoTotal*porcAnalista;
    }
    
    
    
}
