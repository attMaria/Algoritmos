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
public class ListaNumerica {

    private static List<Integer> listaCriada;
    private static int array[];
    

    //Listas usadas em PesquisaBinaria, cria lista de 0 ao numeroMaximo,
    public static List<Integer> criaLista(int numeroMaximo) {
        listaCriada = new ArrayList<>();
        for (int i = 0; i < numeroMaximo; i++) {
            listaCriada.add(i);
        }
        
        return listaCriada;
    }
    //cria lista de - numeroMaximo ao numeroMaximo
    public static List<Integer> criaListaNeg(int numeroMaximo) {
        listaCriada = new ArrayList<>();
        for (int i = -numeroMaximo; i < numeroMaximo; i++) {
            listaCriada.add(i);
        }

        return listaCriada;
    }

    
    //Array usado em OrdenaPorSelecao
    public static int[] geraArray(int qtdeNum, int numeroMaximo) {
        listaCriada = criaLista(numeroMaximo);
        Random random = new Random();
        array = new int[qtdeNum];
        for (int i = 0; i < qtdeNum; i++) {
            int numeroSorteado = random.nextInt(listaCriada.size());
            array[i] = numeroSorteado;
        }

        return array;
    }

   
    public static void testaGera(int numeroListas,int qtdeNum, int numeroMaximo) {
        for (int i = 0; i < numeroListas; i++) {
            array = geraArray(5, 100);
            System.out.println("Lista " + i + ": " + Arrays.toString(array));
        }
    }

    
     public static void main(String[] args) {
        int numeroListas = 2;
        int qtdeNum = 5;
        int numeroMaximo = 300;
        
        testaGera(numeroListas, qtdeNum, numeroMaximo);
    }
    
    
}
