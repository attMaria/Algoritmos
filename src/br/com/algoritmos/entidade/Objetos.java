/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.algoritmos.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class Objetos {
    private Object caixa;

    
    public Objetos(){
        
    }
    
    public Objetos(Object alunos) {
        this.caixa = alunos;
    }

    
    public Object getCaixa() {
        return caixa;
    }

    public void setCaixa(Object caixa) {
        this.caixa = caixa;
    }

    public int sizeCaixa(Object caixa){
        List<Object> alunosList = new ArrayList();
        alunosList = (List<Object>) caixa;
        return alunosList.size();
    }
    
    public int lengthCaixa(Object caixa){
        Object [] alunosString = (Object[]) caixa;
        return alunosString.length;
    }
    
}
