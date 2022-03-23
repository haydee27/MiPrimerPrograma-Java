
package EjerciciosSemana1;

 
public class horasextras {
    public static void main (String[] args){
        
        double pagoD; 
        int horasE;
        double porc;
        double ttalhoras;
        double salario, tsalario;
        int diasL;
        double renta;
        double phoras;
        double Pago;
        
        //Inicializando varibales
        
        pagoD = 10.00;
        horasE = 50;
        porc= 0.10;
        diasL= 30;
        renta = 0.10;
        
        //procedimiento
        
        ttalhoras= pagoD * porc;
        phoras= horasE * ttalhoras;
        salario = diasL * pagoD + phoras;
        tsalario = salario * renta;
        Pago= salario - tsalario;
        
        System.out.println("El salario total es: $" + Pago);
        
        
      
        
        
     
        
        
        
    }
}
