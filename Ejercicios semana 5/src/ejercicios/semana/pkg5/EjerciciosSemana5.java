
package ejercicios.semana.pkg5;

import java.util.Scanner;

public class EjerciciosSemana5 {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.print("Introduce el número de ventas: ");
        int numVentas = info.nextInt();

        double sumaTotal = 0.0;

        
        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Introduce el valor de la venta " + i + ": ");
            double venta = info.nextDouble();
            sumaTotal += venta;
        }

       
        System.out.println("La suma total de las ventas es: " + sumaTotal);

        info.close();
    }
}

    
    

