
package Developer;


public class ejemplo2 {
    public static void main(String[] args) {
        
        double interes, capitalPrestado, tiempo, tasadeinteres, tiempoenmeses;
        
        //inicializando
        
        interes =144;
        capitalPrestado= 1200.00;
        tasadeinteres = 0.08;
        
        //uso de variables
        tiempo = interes / (capitalPrestado * tasadeinteres);
        tiempoenmeses = tiempo * 12;
        System.out.println("Tiempo: " + tiempo + "años");
        System.out.println("Tiempo: "+ tiempoenmeses + "meses");
    }
    
}
