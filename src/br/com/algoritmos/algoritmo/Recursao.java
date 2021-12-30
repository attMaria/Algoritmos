/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.algoritmo;

import br.com.algoritmos.util.ArraysNomes;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author maria
 */
public class Recursao {
    
    private static String[] nomes = {"Rafael", "Vitória", "Fabíola", "Bruno", "Jhonata", "Andrey", "Edson", "Gabriel", "Arthur", "Marcelo", "Diego", "Maria",
        "Gabriel", "Guilherme", "Eduardo", "Letícia", "Jeferson", "Fábio", "Luccas", "Igor", "Silvio"}; // 21 nomes
//    private static List<ArrayList> arraysN = new ArrayList();
    
    //objetivo é criar um metodo que ache o nome especifico dentro de um array especifico, tipo "Onde esta a maria?" e ele responde "no array dois!"

    //Abordagem while
    public static List<ArrayList> procWhile(List<ArrayList> escola, String nome){
        String[] pilha;
        for (ArrayList turma : escola) {
            for (Object grupo : turma) {
                for (int i = 0; i < 3; i++) {
                    
                }
                
            }
        }
        
        return null;
    }
    
    
    //Abordagem Recursão
    //TODO
    
    //Auxiliares 
    public static void main(String[] args) {
        List<ArrayList> escola = new ArrayList();//tipo a escola,uma escola, com alunos com nomes repetidos
//        int qtdeEscolas = 2;
        List<ArrayList> turma;//tipo as turmas por escola
        int qtdeTurmas = 4;
        int qtdeGrupos = 2;//tipo os grupos por turma
        int qtdeNomes = 5;//tipo alunos por grupo
        
        for (int i = 0; i < qtdeTurmas; i++) {
//            System.out.println("Turma " + (i+1));
            turma = ArraysNomes.recebeDados(qtdeNomes, qtdeGrupos, nomes);
            escola.add((ArrayList) turma);
        }
        
//TODO separar partes que fazem o sout 
//        System.out.println("Escola :");
//        for (ArrayList turmaE : escola) {
//            int j = 1;
//            System.out.println("turma " + j);
//            for (Object grupo : turmaE) {
//                int k = 1;
//                System.out.println("Grupo " + k);
//                k++;
//            }
//            j++;
//        }
        
        
        String nome = "maria";
        procWhile(escola, nome);
        

    }

}
