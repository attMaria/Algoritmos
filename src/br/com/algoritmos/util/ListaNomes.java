/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.util;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class ListaNomes {

    public static List<String> geraListaNomes(String[] nomes, String[] sobrenomes, int qtdeNomes) {
        Random random = new Random();
        List<String> alunos = new ArrayList();

        for (int i = 0; i < qtdeNomes; i++) {
            
            int numeroNome = random.nextInt(nomes.length);
            int numeroSobrenome = random.nextInt(sobrenomes.length);
            
            String nome = nomes[numeroNome];
            String sobrenome = sobrenomes[numeroSobrenome];
            
            String nomeCompleto = nome + " " + sobrenome;
            
            if(alunos.contains(nomeCompleto)){
                i--;
            }else{
                alunos.add(nomeCompleto);
            }
            
        }

        return alunos;
    }

}
