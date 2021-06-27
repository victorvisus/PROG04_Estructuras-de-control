package ejercicio01;

import java.util.Scanner;

/**
 *
 * Realiza un programa que lea un número entero e indique si es par.
 *
 * @author Victor
 *
 */
public class NumPar {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = consola.nextInt();

        //Si el resto de dividir numero entre 2 es 0 el numero es par
        if (numero % 2 == 0) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }
    }
}
