package tarea04_02;

import java.util.IllegalFormatException;
import java.util.Scanner;

/**
 * Realiza un programa que lea un mes en formato numérico y un año e indique el número de días de ese mes. Para realizar este ejercicio 
 * hay que tener en cuenta que un año es bisiesto si es divisible por cuatro, excepto cuando es divisible por 100, a no ser que sea divisible por 400.
 * @author Elena
 */
public class Tarea04_02 {
    
    private static boolean esBisiesto(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        } if(year % 100 == 0) {
            return false;
        }
        return false;
    }
    
    private static int diasDelMes(int month, int year){
        
        int diasDelMes = 30;
        switch (month) {
            case 1:
                diasDelMes = 31;
                break;
                
            case 2:
                if (esBisiesto(year)) {
                    diasDelMes = 29;
                } else {
                    diasDelMes = 28;
                }
                break;
                
            case 3:
                diasDelMes = 31;
                break;
                
            case 4:
                diasDelMes = 30;
                break;
                
            case 5:
                diasDelMes = 31;
                break;
                
            case 6:
                diasDelMes = 30;
                break;
                
            case 7:
                diasDelMes = 31;
                break;
                
            case 8:
                diasDelMes = 31;
                break;
                
            case 9:
                diasDelMes = 30;
                break;
                
            case 10:
                diasDelMes = 31;
                break;
                
            case 11:
                diasDelMes = 30;
                break;
                
            case 12:
                diasDelMes = 31;
                break;

        }
        return diasDelMes;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes = 0;
        do {
            System.out.println("Introduce el mes del que quieres saber los días: ");
            mes = scanner.nextInt();
            if (mes < 1 || mes > 12) {
                throw new IllegalArgumentException("El mes debe estar entre 1 y 12");
            }
        } while (mes < 1 || mes > 12);

        int year = 0;
        do {
            System.out.println("Introduce el año: ");
            year = scanner.nextInt();
            if (year < 0) {
                throw new IllegalArgumentException("El año no puede ser negativo");
            }
        } while (year < 0);



        System.out.println(String.format("El mes %d tiene %d días", mes, diasDelMes(mes, year)));
    }
    
}
