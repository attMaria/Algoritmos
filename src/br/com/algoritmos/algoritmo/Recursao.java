/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.algoritmo;

import br.com.algoritmos.entidade.Escola;
import br.com.algoritmos.util.ArraysNomes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class Recursao {

//    Escola escola = new Escola();

    private static String[] alunos; 
    private static List<ArrayList> turma;
    private static int qtdeTurmas;
    private static int qtdeGrupos;
    private static int qtdeNomes;

    //Abordagem while
    public static List<ArrayList> procWhile(List<ArrayList> escola, String nome) {
        List<String> pilha =new ArrayList();
        for (ArrayList turma : escola) {
            for (Object grupo : turma) {
                pilha.add(grupo.toString());
                
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
        
        String[] alunos = {"Rafael", "Vitória", "Fabíola", "Bruno", "Jhonata", "Andrey", "Edson", "Gabriel", "Arthur", "Marcelo", "Diego", "Maria",
        "Gabriel", "Guilherme", "Eduardo", "Letícia", "Jeferson", "Fábio", "Luccas", "Igor", "Silvio"}; // 21 nomes
        List<ArrayList> escola = new ArrayList();
        qtdeTurmas = 4;
        qtdeGrupos = 2;
        qtdeNomes = 5;

        for (int i = 0; i < qtdeTurmas; i++) {
            System.out.println("Turma " + (i+1));
            turma = ArraysNomes.recebeDados(qtdeNomes, qtdeGrupos, alunos);
            if (!turma.isEmpty()) {
                escola.add((ArrayList) turma);
                imprimeArrays(turma);
            } else {
                System.out.println("Nomes insuficientes para distribuição igual entre listas!");
                System.out.println("A lista original de nomes contem " + alunos.length + " items");
                System.out.println("Para uma ditribuição igual entre grupos, de acordo com os valores passados:");
                System.out.println("  Nomes por grupo: " + qtdeNomes);
                System.out.println("  Quantidade de grupos: " + qtdeGrupos);
                int mais = (qtdeNomes * qtdeGrupos) - alunos.length;
                System.out.println("o que excede em " + mais + " nomes a lista disponivel.");
            }
        }

        String nome = "maria";
        procWhile(escola, nome);

    }

}
