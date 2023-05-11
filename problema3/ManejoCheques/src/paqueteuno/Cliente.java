package paqueteuno;

// @author JosephMatheo

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private Banco bn;
    
    public Cliente(String nom, String apel, String cI, Banco b){
    
        nombre = nom;
        apellido = apel;
        cedula = cI;
        bn = b;
   
    }
    
    public void establecerNombre(String s){
    
        nombre = s;
    
    }
    
    public void establecerApellido(String s){
    
        apellido = s;
    
    }
    
    public void establecerCedula(String s){
    
        cedula = s;
    
    }
    
    public void establecerBn(Banco b){
    
        bn = b;
        
    }
    
    public String obtenerNombre(){
    
        return nombre;
    
    }
    
    public String obtenerApellido(){
    
        return apellido;
    
    }
    
    public String obtenerCedula(){
    
        return cedula;
    
    }
    
    public Banco obtenerBn(){
    
        return bn;
    
    }
    
    
    
}
