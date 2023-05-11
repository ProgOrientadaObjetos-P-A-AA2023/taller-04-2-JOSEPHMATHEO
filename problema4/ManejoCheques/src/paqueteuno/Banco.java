package paqueteuno;

 // @author JosephMatheo
 
public class Banco{
    
    private String nombreBanco;
    private int sucursales;
    
    public Banco(String nomB, int suc){
    
        nombreBanco = nomB;
        sucursales = suc;
    
    }
    
    public void establecerNombreBanco(String s){
    
        nombreBanco = s;
    
    }
    
    public void establecerSucursales(int n){
    
        sucursales = n;
    
    }
    
    public String obtenerNombreBanco(){
    
        return nombreBanco;
    
    }
    
    public int obtenerSucursales(){
    
        return sucursales;
    
    }
    
    
}
