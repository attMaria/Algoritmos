/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class GeraListasArrays {

   
    private static int array[];

    //Lista usada em PesquisaBinaria, cria lista de 0 ao numeroMaximo
    public static List<Integer> criaLista(int numeroMaximo) {
        List<Integer> listaCriada = new ArrayList<>();
        for (int i = 0; i < numeroMaximo; i++) {
            listaCriada.add(i);
        }

        return listaCriada;
    }

    //Lista usada em PesquisaBinaria, cria lista de - numeroMaximo ao numeroMaximo
    public static List<Integer> criaListaNeg(int numeroMaximo) {
        List<Integer> listaCriada = new ArrayList<>();
        for (int i = -numeroMaximo; i < numeroMaximo; i++) {
            listaCriada.add(i);
        }

        return listaCriada;
    }

    //Array usado em OrdenaPorSelecao

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

    
    
}
