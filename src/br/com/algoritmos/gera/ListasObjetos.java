/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.gera;



import br.com.algoritmos.entidade.Caixa;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author maria
 */
public class ListasObjetos {
    
    static String [] objetos = {"abridor", "açucareiro", "adaga", "agulha", "alfinete", "algema", "alicate", 
        "almofada", "bigorna", "binóculo", "cata-vento", "CD", "celular", "dardo", "dedal", "dentadura", 
        "elástico", "envelope", "enxada", "escada", "escorredor", "escova", "escudo", "facão", "farol", "ferradura",
        "fichário", "gaita", "gancho", "gangorra", "garfo", "gargantilha", "garrafa", "helicóptero", "hidrante",
        "hidratante",  "impressora", "inalador", "incenso", "ingresso", "jangada", "jaqueta", "jardineira", "jarra",
         "lança", "lancheira", "lenço", "machado", "maiô", "mala", "notebook", "novelo", "Óculos","pandeiro", "panela",
         "pano", "papel", "quadro", "quebra-cabeça", "Rádio", "ralador", "ralo", "raquete", "Sabonete", "saca-rolhas", 
         "saco", "Tábua", "tabuleiro", "taça", "talher", "umidificador", "uniforme", "webcam", "xale", "xampu", "xarope",
         "xícara", "zíper"};
    

     public static List<String> insereObjetos(int qtdeMaxObjs) {
        Random random = new Random();
        List<String> objsCaixa = new ArrayList();
        int qtdeObjs = random.nextInt(qtdeMaxObjs + 1);
        
        if(qtdeObjs == 0){
            qtdeObjs++;
        }
        
        for (int i = 0; i < qtdeObjs; i++) {
            
            int indexObj = random.nextInt(objetos.length);
            
            String objeto = objetos[indexObj];
            
            if(objsCaixa.contains(objeto) ){
                i--;
            }else{
                objsCaixa.add(objeto);
            }
             
        }
        return objsCaixa;
               
    }   
    
    
    public static Caixa empacotaCaixa(int qtdeMaxObjs, int qtdeCaixas){
       Caixa caixaChave = new Caixa();
       
        
//        caixaChave.setObjetos(("chave");
        caixaChave.setCaixa((Caixa) insereObjetos(qtdeMaxObjs) );
        
        Caixa caixa = new Caixa();
        caixa.setCaixa(caixa);
        
       
        int i = 0;
        caixa = caixasEmCaixa(qtdeCaixas, caixa, qtdeMaxObjs, i);
        
        return caixa;
    }
    
    
   public static Caixa caixasEmCaixa(int qtdeCaixas, Caixa caixa, int qtdeMaxObjs, int i){

       caixa.setCaixa((Caixa) insereObjetos(qtdeMaxObjs));
       i++;

       if(i <= qtdeCaixas){
           Caixa maisUmaCaixa = new Caixa();
           maisUmaCaixa = caixa;
           caixasEmCaixa(qtdeCaixas, maisUmaCaixa, qtdeMaxObjs, i);
       }
       
       return caixa;
   }
    
    
   
    
    
    
    
    
//    
//    public static int criaCaixa ( int qtdeMaxObjsCaixa, int qtdeMaxCaixas){
//        Random random = new Random();
//        int qtdeObjs = random.nextInt(qtdeMaxCaixas + 1);
//        
//        List<String> caixa = new ArrayList();
//        caixa = insereObjetos(qtdeObjs);
//        
//        
//        for (String objeto : caixa) {
//            if("Caixa".equals(objeto) ){
//                qtdeObjs = random.nextInt(qtdeMaxCaixas + 1);
//                caixa = insereObjetos(qtdeObjs);
//            }
//        }
//        
//        return qtdeObjs;
//        
//    }
////        String[] teste = {"teste"};
////        String[] segteste= {teste.toString()};
//    
//    
//}

}