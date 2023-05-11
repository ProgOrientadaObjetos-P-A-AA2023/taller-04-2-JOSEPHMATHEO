package paqueteuno;

// @author JosephMatheo

public class Estudiante {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad uni;
    
    public Estudiante(String nom, double nt1, double nt2, double nt3, Universidad u){

    nombre = nom;
    nota1 = nt1;
    nota2 = nt2;
    nota3 = nt3;
    uni = u;
    
    }
    
    public void establecerNombre(String s){
    
    nombre = s;
    
    }
    
    public void establecerNota1(double n){
    
    nota1 = n;
    
    }
    
    public void establecerNota2(double n){
    
    nota2 = n;
    
    }
    
    public void establecerNota3(double n){
    
    nota3 = n;
    
    }
    
    public void calcularPromedio(){
    
    promedio = (nota1 + nota2 + nota3)/3;
    
    }
    
    public void establecerUni(Universidad u){
    
    uni = u;
    
    }
    
    public String obtenerNombre(){
    
        return nombre;
        
    }
    
    public double obtenerNota1(){
    
        return nota1;
        
    }
    
    public double obtenerNota2(){
    
        return nota2;
        
    }
    
    public double obtenerNota3(){
    
        return nota3;
        
    }
    
    public double obtenerPromedio(){
    
        return promedio;
        
    }
    
    public Universidad obtenerUni(){
    
        return uni;
    }
    
    @Override
    public String toString(){
    
        String cadena = String.format("Calificaciones Estudiantes: \n" +
                "Nombre: %s\n" +
                "Nota 1: %.2f\n" +
                "Nota 2: %.2f\n" +
                "Nota 3: %.2f\n" +
                "Promedio de Notas: %.2f\n" +
                "Nombre Universidad: %s\n"+
                "Direccion Universidad: %s\n",
                
                obtenerNombre(),
                obtenerNota1(),
                obtenerNota2(),
                obtenerNota3(),
                obtenerPromedio(),
                uni.obtenerNombre(),
                uni.obtenerDireccion());
                
        return cadena;
    }
    
}
