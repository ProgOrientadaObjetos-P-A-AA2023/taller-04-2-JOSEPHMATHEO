package paqueteuno;

// @author JosephMatheo

public class Cheque {
    
    private Cliente cl;
    private double valorCheque;
    private double comision;
    
    public Cheque(Cliente c, double valC){
    
        cl = c;
       
    
    }
    
    public void establecerCl(Cliente c){
    
        cl = c;
    
    }
    
    public void establecerValorCheque(double n){
    
        valorCheque = n;
    
    }
    
    public void calcularComision(){
    
    comision = valorCheque * 0.00003;
    
    }
    
    public Cliente obtenerCl(){
    
        return cl;
    
    }
    
    public double obtenerValorCheque(){
    
        return valorCheque;
    
    }
    
    public double obtenerComision(){
    
        return comision;
    
    }
    
    @Override
    public String toString(){
    
        String cadena = String.format("Informacion Cheques: \n" +
                "Nombre del Cliente: %s\n" +
                "Apellido del Cliente: %s\n" +
                "Cedula del Cliente: %s\n" +
                "Nombre del Banco: %s\n" +
                "Sucursales del Banco: %d\n" +
                "Valor del cheque: %.2f\n" +
                "Comision que cobra el Banco: %.2f\n",
                
                cl.obtenerNombre(),
                cl.obtenerApellido(),
                cl.obtenerCedula(),
                cl.obtenerBn().obtenerNombreBanco(),
                cl.obtenerBn().obtenerSucursales(),
                obtenerValorCheque(),
                obtenerComision());
                
        return cadena;
    }
    
}
