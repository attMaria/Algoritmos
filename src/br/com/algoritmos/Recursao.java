/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class Recursao {
    //objetivo é criar um metodo que ache o nome especifico dentro de um array especifico, tipo "Onde esta a maria?" e ele responde "no array dois!"

    //Abordagem while
    
    
    
    //Auxiliares que geram os array
    private static String[] nomes = {"Rafael", "Vitória", "Fabíola", "Bruno", "Jhonata", "Andrey", "Edson", "Gabriel", "Arthur", "Marcelo", "Diego", "Maria",
        "Gabriel", "Guilherme", "Eduardo", "Letícia", "Jeferson", "Fábio", "Luccas", "Igor", "Silvio"}; //lista vetor ou array, tipo de coleção com 21 nomes

    //geraArrays recebe a qtdeNomes por array e a qtdeArrays que quer gerar.A lista nomesA é onde a variavel global nomes carrega os seu valores, nessa lista os valores por indice vão sendo excluidos
    //a medida que eles são adicionados a lista nomesArray e por fim a lista arrays recebe os nomesArray gerados, portanto array é uma lista/arrayList composta por uma lista/arrayList, que são as nomesArray.
    public static List<String> geraArrays(int qtdeNomes, int qtdeArrays) {
        List<String> nomesA = new ArrayList();
        for (int i = 0; i < nomes.length; i++) {
            nomesA.add(nomes[i]);
        }
        List<String> nomesArray = new ArrayList();
        List<String> arrays = new ArrayList();

        for (int i = 0; i <= qtdeArrays; i++) {
            for (int j = 0; j <= qtdeNomes; j++) {
                int tamanhoLista = nomesA.size();
                int indice = (int) (Math.random() * tamanhoLista);
                String nome = nomesA.get(indice);
                nomesArray.add(nome);
                nomesA.remove(indice);//remove o nome da lista pra não aparecer mais de uma vez nos arrays
            }
            arrays.addAll(nomesArray);
        }
        return arrays;
    }

    public static void main(String[] args) {
        System.out.println("teste: " + geraArrays(11, 2));
    }

}
