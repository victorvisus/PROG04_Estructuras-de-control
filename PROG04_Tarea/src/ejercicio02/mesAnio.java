package ejercicio02;

import java.util.Scanner;

/**
 * Realiza un programa que lea un mes en formato numérico y un año e indique el
 * número de días de ese mes. Para realizar este ejercicio hay que tener en
 * cuenta que un año es bisiesto si es divisible por cuatro, excepto cuando es
 * divisible por 100, a no ser que sea divisible por 400.
 *
 * @author Víctor Visús
 */
public class mesAnio {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        //Recoge el número de mes y el año que se introduce por consola
        System.out.println("Dime un mes (número): ");
        int mesNum = consola.nextInt();;

        System.out.println("¿de que año? ");
        int anio = consola.nextInt();

        /* Creo un array con el número de dias de los meses del año, al final del
        array agrego los dias de febrero bisiesto */
        int[] dias = new int[]{31, 28, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31, 29};

        /* Calcula si el año introducido es Bisiesto */
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            //System.out.println("el año " + anio + " es bisiesto");

            /* Si el año es Bisiesto comprueba si es el mes 2, si esto es correcto
            coge la posición 13-1 del Array */
            if (mesNum == 2) {
                System.out.println("El mes tiene " + dias[(13 - 1)]);
            } else {
                /* Si no es el mes 2 coge del array la posición del mes introducido - 1 */
                System.out.println("El mes tiene " + dias[(mesNum - 1)]);
            }

        } else {
            //System.out.println("el año " + anio + " NO es bisiesto");

            /* Si el año no es bisiesto coge la posición del mes introducido - 1 */
            System.out.println("El mes tiene " + dias[mesNum - 1]);

        }
    }
}
