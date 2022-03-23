
package EjerciciosSemana1;

public class afp {
    public static void main(String[] args) {
        //declaracion de variables
        
        double afpt;
        double afpe;
        double salario;
        double tafp1, tafp2;
        
        //inicializando variables
        
        afpt = 0.06;
        afpe= 0.065;
        salario= 500;
        
        tafp1 = (salario * afpt);
        tafp2 = (salario * afpe);
        
        System.out.println("El pago de afp en concepto de trabajador es:$" + tafp1);
        System.out.println("El pago de afp en concepto de empleador es:$" + tafp2);
        
            
    }
}
