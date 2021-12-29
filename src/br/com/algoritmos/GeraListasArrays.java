/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class GeraListasArrays {

    private static String[] nomes = {"Rafael", "Vitória", "Fabíola", "Bruno", "Jhonata", "Andrey", "Edson", "Gabriel", "Arthur", "Marcelo", "Diego", "Maria",
        "Gabriel", "Guilherme", "Eduardo", "Letícia", "Jeferson", "Fábio", "Luccas", "Igor", "Silvio"}; // 21 nomes
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

    //Array utilizado em Recursão
    //geraArrays recebe a qtdeNomes por array e a qtdeArrays que quer gerar.A lista nomesA é onde a variavel global nomes carrega os seu valores, nessa lista os valores por indice vão sendo excluidos
    //a medida que eles são adicionados a lista nomesArray e por fim a lista arrays recebe os nomesArray gerados, portanto array é uma lista/arrayList composta por uma lista/arrayList, que são as nomesArray.
    public static List<ArrayList> geraArrays(int qtdeNomes, int qtdeArrays) {
        List<String> nomesA = new ArrayList();
        for (int i = 0; i < nomes.length; i++) {
            nomesA.add(nomes[i]);
        }

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
    
    public static List<Integer> confere(int qtdeNomes, int qtdeArrays){
        int tamanhoLista = nomes.length;
        int qtdeNomesTotal = qtdeNomes * qtdeArrays;
        
        List<Integer> valores = new ArrayList();
        valores.add(0, tamanhoLista);
        valores.add(1, qtdeNomesTotal);
        
        return valores;

    }
    
    public static void criaArrays(int qtdeNomes,int qtdeArrays){
        List<Integer> valores = GeraListasArrays.confere(qtdeNomes, qtdeArrays);

        if (valores.get(1) <= valores.get(0)) {

            List<ArrayList> arrays = GeraListasArrays.geraArrays(qtdeNomes, qtdeArrays);
            int i = 1;
            for (ArrayList array : arrays) {
                System.out.println("Grupo " + i);
                int j = 1;
                for (Object nome : array) {
                    System.out.println("Integrante " + j + ": "+ nome);
                    j++;
                }
                System.out.println("");
                i++;
            }

        } else {
            System.out.println("Nomes insuficientes para distribuição igual entre listas!");
            System.out.println("A lista original de nomes contem " + valores.get(0) + " items");
            System.out.println("Para uma ditribuição igual entre grupos, de acordo com os valores passados:");
            System.out.println("  Nomes por grupo: " + qtdeNomes);
            System.out.println("  Quantidade de grupos: " + qtdeArrays);
            int mais = valores.get(1) - valores.get(0);
            System.out.println("o que excede em " + mais + " nomes a lista disponivel.");

        }

    }
    
}
