/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea04_01;

import java.util.Scanner;

/**
 * Realiza un programa que lea un número entero e indique si es par.
 * @author Helena
 */
public class Tarea04_01 {
    
    public static void esPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(String.format("El número %d es par", numero));
        } else {
            System.out.println(String.format("El número %d NO es par", numero));
        }
    }

    public static void main(String[] args) {

        System.out.println("Introduce un número entero: ");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        esPar(numero);

    }
    
}
