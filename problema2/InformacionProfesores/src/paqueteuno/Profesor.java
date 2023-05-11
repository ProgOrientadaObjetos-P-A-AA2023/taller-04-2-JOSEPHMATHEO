package paqueteuno;

 // @author JosephMatheo
 
public class Profesor {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia pvr;
    
    public Profesor(String nom, String apell, double sB, String cI, Provincia p){
    
        nombre = nom;
        apellido = apell;
        sueldoBasico = sB;
        cedula = cI;
        pvr = p;
    
    }
    
    public void establecerNombre(String s){
    
    nombre = s;
    
    }
    
    public void establecerApellido(String s){
    
    apellido = s;
    
    }
    
    public void establecerSueldoBasico(double n){
    
    sueldoBasico = n;
    
    }
    
    public void calcularSueldoTotal(){
    
    sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    
    }
    
    public void establecerCedula(String s){
    
    cedula = s;
    
    }
    
    public void establecerPvr(Provincia p){
    
    pvr = p;
    
    }
    
    public String obtenerNombre(){
    
    return nombre;
    
    }
    
    public String obtenerApellido(){
    
    return apellido;
    
    }
    
    public double obtenerSueldoBasico(){
    
    return sueldoBasico;
    
    }
    
    public double obtenerSueldoTotal(){
    
    return sueldoTotal;
    
    }
    
    public String obtenerCedula(){
    
    return cedula;
    
    }
    
    public Provincia obtenerPvr(){
    
    return pvr;
    
    }
    
    @Override
    public String toString(){
    
        String cadena = String.format("Informacion Profesores: \n" +
                "Nombre: %s\n" +
                "Apellido: %s\n" +
                "Sueldo Basico: %.2f\n" +
                "Sueldo Total: %.2f\n" +
                "Cedula: %s\n" +
                "Provincia de Nacimiento: %s\n" +,
                
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula(),
                pvr.obtenerNombre());
                
        return cadena;
    }
    
}
