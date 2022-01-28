/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.gera;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class ListasObjetos {
    
    static String [] objetos = {"Caixa", "abridor", "açucareiro", "adaga", "agulha", "alfinete", "algema", "alicate", 
        "almofada", "bigorna", "binóculo", "cata-vento", "CD", "celular", "chave", "dardo", "dedal", "dentadura", 
        "elástico", "envelope", "enxada", "escada", "escorredor", "escova", "escudo", "facão", "farol", "ferradura",
        "fichário", "gaita", "gancho", "gangorra", "garfo", "gargantilha", "garrafa", "helicóptero", "hidrante",
        "hidratante",  "impressora", "inalador", "incenso", "ingresso", "jangada", "jaqueta", "jardineira", "jarra",
         "lança", "lancheira", "lenço", "machado", "maiô", "mala", "notebook", "novelo", "Óculos","pandeiro", "panela",
         "pano", "papel", "quadro", "quebra-cabeça", "Rádio", "ralador", "ralo", "raquete", "Sabonete", "saca-rolhas", 
         "saco", "Tábua", "tabuleiro", "taça", "talher", "umidificador", "uniforme", "webcam", "xale", "xampu", "xarope",
         "xícara", "zíper"};
    

    public static List<String> geraCaixaObjetos(int qtdeMaxObjs) {
        Random random = new Random();
        List<String> caixa = new ArrayList();
        int qtdeObjs = random.nextInt(qtdeMaxObjs + 1);

        for (int i = 0; i < qtdeObjs; i++) {
            
            int indexObj = random.nextInt(objetos.length);
            
            String objeto = objetos[indexObj];
            
            if(caixa.contains(objeto) ){
                i--;
            }else{
                caixa.add(objeto);
            }
            
        }
        
        if(!caixa.contains("Caixa")){
            caixa.add(0, objetos[0]);
        }

        return caixa;
    }
    
    
    
    
    public static int criaCaixa ( int qtdeMaxObjsCaixa, int qtdeMaxCaixas){
        Random random = new Random();
        int qtdeObjs = random.nextInt(qtdeMaxCaixas + 1);
        
        List<String> caixa = new ArrayList();
        caixa = geraCaixaObjetos(qtdeObjs);
        
        
        for (String objeto : caixa) {
            if("Caixa".equals(objeto) ){
                qtdeObjs = random.nextInt(qtdeMaxCaixas + 1);
                caixa = geraCaixaObjetos(qtdeObjs);
            }
        }
        
        return qtdeObjs;
        
    }
    
    
}
