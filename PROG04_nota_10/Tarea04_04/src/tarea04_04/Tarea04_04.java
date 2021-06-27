package tarea04_04;

import java.util.Scanner;

/**
 * Escribe un programa que solicite a un usuario su nombre y edad. Debe
 * mostrarse cuantos años tendrá dentro de una década y clasificarle según su
 * edad en A[0-25], B[26-50], C[51-...].
 *
 * @author Elena
 */
public class Tarea04_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        do {
            System.out.println("¿Cómo se llama?");
            nombre = scanner.next();
            if (nombre.matches("[0-9]")) {
                throw new IllegalArgumentException("El nombre no puede contener números");
            }

        } while (nombre.isEmpty());

        int edad = 0;
        do {
            System.out.println("¿Cuántos años tiene?");
            try {
                edad = scanner.nextInt();
                if (edad < 0) {
                    throw new IllegalArgumentException("La edad no puede ser inferior a 0");
                }
            } catch (Exception e) {
                System.out.print(e.getLocalizedMessage());
            }

        } while (edad < 0);
        edad += 10;

        if (0 < edad && edad <= 25) {
            System.out.println(String.format("%s dentro de una década tendrá %s años y pertenecerá al grupo A", nombre, edad));
        } else if (25 < edad && edad <= 50) {
            System.out.println(String.format("%s dentro de una década tendrá %s años y pertenecerá al grupo B", nombre, edad));
        } else if (51 < edad && edad <= 75) {
            System.out.println(String.format("%s dentro de una década tendrá %s años y pertenecerá al grupo C", nombre, edad));
        } else if (75 < edad && edad <= 100) {
            System.out.println(String.format("%s dentro de una década tendrá %s años y pertenecerá al grupo D", nombre, edad));
        }
    }

}
