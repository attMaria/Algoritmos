/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.algoritmo;

import br.com.algoritmos.entidade.Objetos;
import br.com.algoritmos.gera.ArraysNomes;
import br.com.algoritmos.gera.ListasObjetos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class Recursao {


    //Abordagem while
    public static List<ArrayList> procWhile(int qtdeObjsCaixa, int maxLoops) {
        List<String> caixa = new ArrayList();
        List<String> pilha = new ArrayList();
        
        caixa = ListasObjetos.geraCaixaObjetos(qtdeObjsCaixa);
        for (String objeto : caixa) {
            if(objeto == "Caixa"){
                int index = objeto.indexOf(objeto);
                caixa.addAll(index, caixa);
            }
        }
        
        
        
        return null;
    }

    //Abordagem Recursão
    //TODO
    //Auxiliares 
    public static void imprimeArrays(List<ArrayList> arrays) {

        int i = 1;
        for (ArrayList array : arrays) {
            System.out.println("Grupo " + i);
            int j = 1;
            for (Object nome : array) {
                System.out.println("Integrante " + j + ": " + nome);
                j++;
            }
            System.out.println("");
            i++;

        }
    }

    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {
             System.out.println(" teste " + ListasObjetos.criaCaixa(5, 2));  
        }
      
       
    }

}
