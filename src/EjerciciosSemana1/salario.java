package EjerciciosSemana1;


public class salario {
    public static void main (String[] args) {
         //declaracion de variables 
         
         double salxhora;
         int horas;
         double renta, totalrenta;
         double salariototal;
         double totalF;
         //inicializando varibales 
         salxhora = 8.00;
         horas = 36 ;
         renta = 0.10;
         
         salariototal = salxhora * horas;
         totalrenta = salariototal * renta;
         totalF = salariototal - totalrenta;
         
        //USO DE VARIABLES 
        
        System.out.println("su salario total es:" + totalF);
         
         
                 
    }
}

