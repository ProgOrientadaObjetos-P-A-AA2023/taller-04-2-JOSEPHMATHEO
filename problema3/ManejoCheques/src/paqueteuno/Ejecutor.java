package paqueteuno;

 // @author JosephMatheo

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Banco bn = new Banco("Banco Pichincha",206);
        Cliente cl = new Cliente("Pablo","Loaiza","11057896342",bn);
        Cheque ch = new Cheque(cl,500.50);
        
        ch.calcularComision();
        
        System.out.printf("%s\n",ch);
        
    }
    
}
