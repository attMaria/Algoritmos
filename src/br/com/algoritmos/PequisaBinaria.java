/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class PequisaBinaria {
    
    //declaração de variavel
    private static int item;
    private static List<Integer> lista;
    private static boolean pesquisaBinaria;
  
    
    //Algoritmo
    //TODO criar classe apenas para geradores de array e listas
 
    public static int escolheItem(List<Integer> lista){
         Random random = new Random();
         int item = lista.get(random.nextInt(lista.size()));
         return item;
    }
    
    
    public static boolean pesquisa_binaria(List<Integer> lista, int item){
        int baixo = 0;        
        int alto = lista.size() - 1;
        int operacao = 0;
        
        while (baixo <= alto) {
           
            int meio = (baixo + alto) / 2;
            int chute = lista.get(meio);
            
            if(chute == item){
                System.out.println("Este é o valor correto: " + chute);                
                System.out.println("Numero de operações: " + operacao);
                return true; 
            }
            if(chute > item){
                System.out.println("Este valor é maior que o item: " + chute);
                alto = meio - 1;
            }
            if(chute < item){
                 System.out.println("Este valor é menor que o item: "+ chute);
                 baixo = meio +1;
            }    
             operacao++;   
        }
        return false;
    }
    
    public static double log(double base, double valor) {
            return Math.log(valor) / Math.log(base);
    }
    
    public static void main(String[] args) {
        lista = GeraListasArrays.criaLista(100);
//        item = 1;
        item = escolheItem( lista);
        pesquisaBinaria = pesquisa_binaria(lista, item);
        System.out.println("Numero maximo de operações: " + log(2, lista.size() + 1));

    }
    
}
