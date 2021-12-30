/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.algoritmo;

import br.com.algoritmos.util.GeraListasArrays;
import java.util.Arrays;

/**
 *
 * @author maria
 */

public class OrdenaPorSelecao {

    private static int menorValor;
    private static int indiceMenorValor;

    public static int buscaMenorValor(int[] array) {
        menorValor = array[0];
        indiceMenorValor = 0;
        for (int i = 1; i < array.length; i++) {
            if (menorValor > array[i]) {
                menorValor = array[i];
                indiceMenorValor = i;
            }
        }
        return indiceMenorValor;
    }

    public static int[] ordenacaoPorSelecao(int[] array) {
        int[] arrayOrdenado = array;

        for (int i = 0; i < array.length - 1; i++) {
            int percorre = i;
            for (int j = percorre + 1; j < array.length; j++) {
                if (array[i] > array[j]) {

                    int guardaValor = array[i];
                    array[i] = array[j];
                    array[j] = guardaValor;
                }

            }

        }
        return arrayOrdenado;

    }

    //TODO criar classe apenas para geradores de array e listas
    

    public static void main(String[] args) {
//        testaGeraLista(10);
//        int[] array = {5, 7, 3, 8};
        int array[] = GeraListasArrays.geraArray(20, 100);
        indiceMenorValor = buscaMenorValor(array);

        System.out.println("O menor indice é " + indiceMenorValor + " com o valor " + array[indiceMenorValor]);
        System.out.println("O array gerado é " + Arrays.toString(array));
        int[] arrayOrdenado = ordenacaoPorSelecao(array);
        System.out.println("O novo array ordenado é " + Arrays.toString(arrayOrdenado));
    }
}
