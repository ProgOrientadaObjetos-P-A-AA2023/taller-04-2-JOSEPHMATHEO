package paqueteuno;

// @author JosephMatheo

public class Fabricante {
    
    private String nombreFab;
    private String ciudadO;
    
    public Fabricante(String nomF, String cO){
    
    nombreFab = nomF;
    ciudadO = cO;
  
    }
    
    public void establecerNombreFab(String s){
    
    nombreFab = s;
    
    }
    
    public void establecerCiudadO(String s){
    
    ciudadO = s;
    
    }
    
    public String obtenerNombreFab(){
    
    return nombreFab;
    
    }
    
    public String obtenerCiudadO(){
    
    return ciudadO;
    
    }
    
}
