/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos;

import java.util.Arrays;

/**
 *
 * @author maria
 */
public class OrdenarArray {

    private static int menorValor;
    private static int menorIndice;
    private static int[] array;

    public static int buscaMenorValor(int[] array) {
        menorValor = array[0];
        menorIndice = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menorValor) {
                menorValor = array[i];
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static int[] ordenacaoPorSelecao(int[] array) {
        int[] novoArray = new int[0];

        for (int i = 0; i < array.length; i++) {
            menorValor = buscaMenorValor(array);
            novoArray[i] = menorValor;
        }
        return novoArray;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("O menor indice é " + buscaMenorValor(array));
        System.out.println("O novo array ordenado é "+  Arrays.toString(ordenacaoPorSelecao(array)));
    }
}
