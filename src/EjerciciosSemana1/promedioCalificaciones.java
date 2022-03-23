
package EjerciciosSemana1;


public class promedioCalificaciones {
    public static void main (String[] args ){
        
        //DECLARACION DE VARIBALES 
        
        double eva1, eva2, eva3, eva4, eva5;
        double P1, P2, P3, P4, P5;
        double sumap;
        double p1, p2, p3, p4, p5;
        
        //INICIALIZANDO VARIABLES
        
        eva1 = 8.0;
        eva2 = 7.5;
        eva3= 9.0;
        eva4 = 8.0;
        eva5 = 9.0;
        
        P1= 0.25;
        P2 = 0.15;
        P3= 0.15;
        P4= 0.20;
        P5 = 0.25;
        
       //PROCESO
       p1 = eva1* P1;
       p2 = eva2* P2;
       p3 = eva3* P3;
       p4 = eva4* P4;
       p5 = eva5* P5;
       
       sumap = p1 + p2 + p3 + p4 + p5;
       
        System.out.println("El promedio final es: "+ sumap);
       
       
    }
}
