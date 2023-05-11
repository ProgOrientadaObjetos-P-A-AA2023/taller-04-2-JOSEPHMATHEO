package paqueteuno;

// @author JosephMatheo

public class Universidad {
    
    private String nombre;
    private String direccion;
    
    public Universidad(String nom, String dir){
    
    nombre = nom;
    direccion = dir;
    
    }
    
    public void establecerNombre(String n){
    
    nombre = n;
    
    }
    
    public void establecerDireccion(String n){
    
    direccion = n;
    
    }
    
    public String obtenerNombre(){
        
        return nombre;
        
    }
    
    public String obtenerDireccion(){
    
        return direccion;
        
    }
    
}
