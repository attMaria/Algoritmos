/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.gera;

import br.com.algoritmos.entidade.Objetos;
import br.com.algoritmos.util.ListaObjetos;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maria
 */
public class ListasObjetos {
    
    public static int criaCaixa ( int qtdeMaxObjsCaixa, int qtdeMaxCaixas){
        Random random = new Random();
        int qtdeObjs = random.nextInt(qtdeMaxCaixas + 1);
        
        
//        ListaObjetos.geraListaObjetos(qtdeMaxObjs);
        
        return qtdeObjs;
        
    }
    
    
}
