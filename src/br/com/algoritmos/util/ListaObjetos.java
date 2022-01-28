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
public class ListaObjetos {
    
    static String [] objetos = {"Caixa", "abridor", "açucareiro", "adaga", "agulha", "alfinete", "algema", "alicate", 
        "almofada", "bigorna", "binóculo", "cata-vento", "CD", "celular", "chave", "dardo", "dedal", "dentadura", 
        "elástico", "envelope", "enxada", "escada", "escorredor", "escova", "escudo", "facão", "farol", "ferradura",
        "fichário", "gaita", "gancho", "gangorra", "garfo", "gargantilha", "garrafa", "helicóptero", "hidrante",
        "hidratante",  "impressora", "inalador", "incenso", "ingresso", "jangada", "jaqueta", "jardineira", "jarra",
         "lança", "lancheira", "lenço", "machado", "maiô", "mala", "notebook", "novelo", "Óculos","pandeiro", "panela",
         "pano", "papel", "quadro", "quebra-cabeça", "Rádio", "ralador", "ralo", "raquete", "Sabonete", "saca-rolhas", 
         "saco", "Tábua", "tabuleiro", "taça", "talher", "umidificador", "uniforme", "webcam", "xale", "xampu", "xarope",
         "xícara", "zíper"};
    
    

    public static List<String> geraListaObjetos(int qtdeObjetos) {
        Random random = new Random();
        List<String> caixa = new ArrayList();

        for (int i = 0; i < qtdeObjetos; i++) {
            
            int indexObj = random.nextInt(objetos.length);
            
            String objeto = objetos[indexObj];
            
            if(caixa.contains(objeto)){
                i--;
            }else{
                caixa.add(objeto);
                
            }
            
        }

        return caixa;
    }

}
