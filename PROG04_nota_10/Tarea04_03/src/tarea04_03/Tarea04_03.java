
package tarea04_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Escribe un programa que lea un número y lo descomponga en factores primos.
 * @author Elena
 */
public class Tarea04_03 {
    
    /**
     * Método que devuelve una lista de números primos para un rango dado
     * @param rangoInicial comienzo del rango 
     * @param rangoFinal final del rango
     * @return listado de números primos
     */
    private static List<Integer> numerosPrimos(int rangoInicial, int rangoFinal) {
        
	List<Integer> numeros = new ArrayList<>();
        for (int i = rangoInicial; i <= rangoFinal; i++) {
            numeros.add(i);
        }
        List<Integer> numerosPrimos = new ArrayList<>();
        int i, j;
        boolean esPrimo;

        for (i = rangoInicial; i <= rangoFinal; i++) {
            esPrimo = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                numerosPrimos.add(i);
            }
        }
        return numerosPrimos;

    }

    /**
     * Método para hacer la descomposición factorial de un número
     * @param numero número del que quieres realizar la descomposición
     * @return String con la descomposición factorial del número
     */
    public static String descomposicionEnFactores(int numero) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("La descomposición factorial del número: ").append(numero).append(" es: ");
        List<Integer> numerosPrimos = numerosPrimos(2, 100);
        int contador = 0;
        do {
            Integer numeroPrimo = numerosPrimos.get(contador);
            if (numero % numeroPrimo == 0) {
                stringBuilder.append(numeroPrimo).append(" * ");
                numero /= numeroPrimo;
            } else {
                contador++;
            }
        } while (numero != 1);
        return stringBuilder.toString().trim().substring(0, stringBuilder.toString().length() - 2);
    }

    public static void main(String[] args) {
        System.out.println(descomposicionEnFactores(30));
        System.out.println(descomposicionEnFactores(15));
        System.out.println(descomposicionEnFactores(12));
        System.out.println(descomposicionEnFactores(9));
        System.out.println(descomposicionEnFactores(8));
    }
    
}
