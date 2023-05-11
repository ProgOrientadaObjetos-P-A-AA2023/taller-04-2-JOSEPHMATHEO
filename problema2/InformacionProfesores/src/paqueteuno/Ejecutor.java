package paqueteuno;

 // @author JosephMatheo

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Provincia prv = new Provincia("Loja","214.855");
        Profesor pf = new Profesor("Jhordy","Agila",1000.50,"1105879646281",prv);
        
        pf.calcularSueldoTotal();
        
        System.out.printf("%s\n",pf);
    }
    
}
