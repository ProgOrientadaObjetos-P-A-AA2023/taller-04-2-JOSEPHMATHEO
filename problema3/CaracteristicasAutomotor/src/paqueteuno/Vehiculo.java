package paqueteuno;

// @author JosephMatheo

public class Vehiculo {
    
    private String cedulaDue;
    private Fabricante fv;
    private int anioFab;
    private double valorV;
    private double valorM;
    
    public Vehiculo(String cD, Fabricante f, int anioF, double valV){
    
    cedulaDue = cD;
    fv = f;
    anioFab = anioF;
    valorV = valV;
     
    }
    
    public void establecerCedulaDue(String s){
    
    cedulaDue = s;
    
    }
    
    public void establecerFv(Fabricante f){
    
    fv = f;
    
    }
    
    public void establecerAnioFab(int n){
    
    anioFab = n;
    
    }
    
    public void establecerValorV(double n){
    
    valorV = n;
    
    }
    
    public void calcularValorM(){
    
    valorM = (valorV * 0.00002) * (2023 - anioFab);
    
    }
    
    public String obtenerCedulaDue(){
    
    return cedulaDue;
    
    }
    
    public Fabricante obtenerFv(){
    
    return fv;
    
    }
    
    public int obtenerAnioFab(){
    
    return anioFab;
    
    }
    
    public double obtenerValorV(){
    
    return valorV;
    
    }
    
    public double obtenerValorM(){
    
    return valorM;
    
    }
    
    @Override
    public String toString(){
    
        String cadena = String.format("Caracteristicas Automotor: \n" +
                "Cedula del Dueno: %s\n" +
                "Nombre del Fabricante: %s\n" +
                "Ciudad de Origen: %s\n" +
                "Anio de Fabricacion: %d\n" +
                "Valor del Vehiculo: %.2f\n" +
                "Valor de la Matricula: %.2f\n",
                
                obtenerCedulaDue(),
                fv.obtenerNombreFab(),
                fv.obtenerCiudadO(),
                obtenerAnioFab(),
                obtenerValorV(),
                obtenerValorM());
                
        return cadena;
    }
    
}
