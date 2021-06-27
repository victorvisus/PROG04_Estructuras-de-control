package ejercicio04;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Escribe un programa que solicite a un usuario su nombre y edad. Debe
 * mostrarse cuantos años tendrá dentro de una década y clasificarle según su
 * edad en A[0-25], B[26-50], C[51-...].
 *
 * @author Victor Visús
 */
public class edadClasificacion {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Recoje los datos que pide el ejercicio
        System.out.println("Dime tu nombre:");
        String nombre = consola.nextLine();

        System.out.println("Tu edad: ");
        int edad = consola.nextInt() + 10;

        //Recojo el año actual
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("year = " + year);

        //Declaro una variable char y realiza la clasificación según el rango de edad
        char clas = ' ';
        if (edad >= 0 && edad <= 25) {
            clas = 'A';
        } else if (edad >= 26 && edad <= 50) {
            clas = 'B';
        } else if (edad > 51) {
            clas = 'C';
        }

        //Imprime el resultado
        System.out.println("Hola " + nombre + " en el año " + (year + 10)
                + " tendrás " + (edad) + " años y estarás en la clasificación " + clas);
    }
}
