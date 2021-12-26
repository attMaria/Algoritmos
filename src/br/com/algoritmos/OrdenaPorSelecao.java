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

public class OrdenaPorSelecao {

    private static int menorValor;
    private static int indiceMenorValor;
    private static int array[];

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

    //metodos que geram um array
//    public static int[] geraLista(int tamLista, int valorMax) {
//        Random random = new Random();
//        int[] array = new int[tamLista];
//        int numeroGerado;
//        int numero = 0;
//        for (int i = 0; i < tamLista; i++) {
//            numeroGerado = random.nextInt(10);
//            if (numeroGerado < valorMax && numeroGerado >= 0) {
//                numero = numero + numeroGerado;
//                array[i] = numero;
//            } else {
//                i--;
//            }
//
//        }
//        return array;
//    }
    public static int[] geraArray(int qtdeNum, int numeroMaximo) {
        //cria lista com todos os numeros até numero maximo, um pouco mais demorado
        int[] listaCriada = new int[numeroMaximo];
        for (int i = 0; i < numeroMaximo; i++) {
            listaCriada[i] = i;
        }
        //sorteia a quantidade de numeros necessarias pra formar o array
        Random random = new Random();
        array = new int[qtdeNum];
        for (int i = 0; i < qtdeNum; i++) {
            int numeroSorteado = random.nextInt(listaCriada.length);
            array[i] = numeroSorteado;
        }

        return array;
    }

    public static void testaGera(int numeroListas) {
        for (int i = 0; i < numeroListas; i++) {
            array = geraArray(5, 100);
            System.out.println("Lista " + i + ": " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
//        testaGeraLista(10);
//        int[] array = {5, 7, 3, 8};
        array = geraArray(20, 100);
        indiceMenorValor = buscaMenorValor(array);

        System.out.println("O menor indice é " + indiceMenorValor + " com o valor " + array[indiceMenorValor]);
        System.out.println("O array gerado é " + Arrays.toString(array));
        int[] arrayOrdenado = ordenacaoPorSelecao(array);
        System.out.println("O novo array ordenado é " + Arrays.toString(arrayOrdenado));
    }
}
