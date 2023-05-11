package paqueteuno;

// @author JosephMatheo
 
public class Ejecutor {

    public static void main(String[] args) {

        // TODO code application logic here

        Universidad uni = new Universidad("Universidad Tecnica Particular de Loja","San Cayetano Alto, Calle Paris");
        Estudiante est = new Estudiante("Luis Morales",8.50,9,9.30,uni);

        est.calcularPromedio();
        
        System.out.printf("%s\n",est);
    
    }
    
}
