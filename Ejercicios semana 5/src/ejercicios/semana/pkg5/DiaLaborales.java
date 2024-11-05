
package ejercicios.semana.pkg5;

import java.util.Scanner;


public class DiaLaborales {
 public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        
 
        System.out.print("Introduce un día de la semana: ");
        String dia = info.nextLine();

        
        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(dia.substring(0, 1).toUpperCase() + dia.substring(1) + " es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println(dia.substring(0, 1).toUpperCase() + dia.substring(1) + " no es un día laboral.");
                break;
            default:
                System.out.println("Día no válido. Por favor, introduce un día de la semana.");
        }

        info.close();
    }
}
    

