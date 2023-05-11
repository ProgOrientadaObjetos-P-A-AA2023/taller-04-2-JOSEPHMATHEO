package paqueteuno;

// @author JosephMatheo
 
public class Ejecutor {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Fabricante fv = new Fabricante("Chevrolet", "China" );
        Vehiculo vh = new Vehiculo("1105708749",fv,2001,17990);
        
        vh.calcularValorM();
        
        System.out.printf("%s\n",vh);
        
    }
    
}
