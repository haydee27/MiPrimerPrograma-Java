
package EjerciciosSemana1;


public class Ejercicio1 {
    
    public static void main (String [] args) {
        
        //declarando varuables 
        double R1, R2, R3, R4, Req, Rdeno;
        //inicializacion de varibales
        
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 82;
        
        Rdeno = ((1/R1) + (1/R2) + (1/R3) + (1/R4));
        Req = 1 / Rdeno;
        
        System.out.println("La resistencia equivale: " +Req);
        
    }
}
