/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author maria
 */
public class OrdenarArray {

    private static int menorValor;
    private static int indiceMenorValor;
    private static int array[];

    public static int buscaMenorValor(int[] array) {
        menorValor = array[0];
        indiceMenorValor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menorValor) {
                menorValor = array[i];
                indiceMenorValor = i;
            }
        }
        return indiceMenorValor;
    }

    public static int[] ordenacaoPorSelecao(int[] array, int indiceMenorValor) {
        int[] arrayOrdenado = array;

        for (int i = 0; i < array.length; i++) {
            for (int indice = 0; indice <= array.length - 1; indice++) {
                if (array[i] > array[indiceMenorValor]) {
                    int guardaValor = array[i];
                    array[i] = array[indiceMenorValor];
                    array[indiceMenorValor] = guardaValor;
                }
            }
        }
        return arrayOrdenado;

    }

    //metodos auxiliares
    public static int[] geraLista(int tamLista, int valorMax) {
        Random random = new Random();
        int[] array = new int[tamLista];
        int numeroGerado;
        int numero = 0;
        for (int i = 0; i < tamLista; i++) {
            numeroGerado = random.nextInt(10);
            if (numeroGerado < valorMax && numeroGerado >= 0) {
                numero = numero + numeroGerado;
                array[i] = numero;
            } else {
                i--;
            }

        }
        return array;
    }

    public static void testaGeraLista(int numeroListas) {
        for (int i = 0; i < numeroListas; i++) {
            array = geraLista(5, 100);
            System.out.println("Lista " + i + ": " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
//            testaGeraLista(10);

        int[] array = {10, 8, 34, 4, 15};
//        array = geraLista(5, 100);

        indiceMenorValor = buscaMenorValor(array);
        int[] arrayOrdenado = ordenacaoPorSelecao(array, indiceMenorValor);
        System.out.println("O menor indice é " + indiceMenorValor + " com o valor " + array[indiceMenorValor]);
        System.out.println("O novo array ordenado é " + Arrays.toString(arrayOrdenado));
    }
}
