package paqueteuno;

// @author JosephMatheo
 
public class Provincia {
    
    private String nombre;
    private String habitantes;
    
    public Provincia(String nom, String hbt){
    
        nombre = nom;
        habitantes = hbt;
    
    }
    
    public void establecerNombre(String n){
    
    nombre = n;
    
    }
    
    public void establecerHabitantes(String n){
    
    habitantes = n;
    
    }
    
    public String obtenerNombre(){
    
    return nombre;
    
    }
    
    public String obtenerHabitantes(){
    
    return habitantes;
    
    }
}
