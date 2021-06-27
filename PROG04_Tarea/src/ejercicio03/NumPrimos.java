package ejercicio03;

import java.util.Scanner;

/**
 * Escribe un programa que lea un número y lo descomponga en factores primos.
 *
 * @author Victor
 */
public class NumPrimos {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        //Solicita un número
        System.out.println("Ingrese el numero: ");
        int numero = consola.nextInt();

        System.out.println("Su descomposición es: ");

        /* Descompone el número en sus factores primos y los imprime */
        for (int i = 2; i < numero; i++) {

            while (numero % i == 0) {
                numero = numero / i;
                System.out.print(i + " ");
            }
        }
    }
}
