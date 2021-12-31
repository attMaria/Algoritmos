/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class ArraysNomes {
    //Utilizado em Recursão

   public static List<ArrayList> recebeDados(int qtdeNomes, int qtdeArrays,  String[] nomes){
        int tamanhoLista = nomes.length;
        int qtdeNomesTotal = qtdeNomes * qtdeArrays;
        
         List<String> nomesA = new ArrayList();
        for (int i = 0; i < nomes.length; i++) {
            nomesA.add(nomes[i]);
        }

        List<Integer> valores = new ArrayList();
        valores.add(0, tamanhoLista);
        valores.add(1, qtdeNomesTotal);
        valores.add(2, qtdeArrays);
        valores.add(3, qtdeNomes);
        
        List<ArrayList> dados = new ArrayList();
        dados.add((ArrayList) valores);
        dados.add((ArrayList) nomesA);
        
        return confereSe(dados);

    }
    
   
   
    
    public static List<ArrayList> confereSe(List<ArrayList> dados){
        List<Integer> valores = dados.get(0);
        int tamanhoLista = valores.get(0);
        int qtdeNomesTotal = valores.get(1);

        if (qtdeNomesTotal <= tamanhoLista) {

            List<ArrayList> arrays = geraArrays(dados);
            //TODO separar partes que fazem o sout 
           return arrays;
        }
        return null;
    }
    
     
    public static List<ArrayList> geraArrays(List<ArrayList> dados) {
        List<String> nomesA = dados.get(1);
        List<Integer> valores = dados.get(0);
        int qtdeArrays = valores.get(2);
        int qtdeNomes = valores.get(3);

        List<ArrayList> arrays = new ArrayList();

        for (int i = 0; i < qtdeArrays; i++) {
            List<String> nomesArray = new ArrayList();

            for (int j = 0; j < qtdeNomes; j++) {
                int tamanhoLista = nomesA.size();
                int indice = (int) (Math.random() * tamanhoLista);
                String nome = nomesA.get(indice);
                nomesArray.add(nome);
                nomesA.remove(indice);//remove o nome da lista pra não aparecer mais de uma vez nos arrays
            }
            arrays.add((ArrayList) nomesArray);
        }
        return arrays;
    }
    
}
