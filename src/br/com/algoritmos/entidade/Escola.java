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
public class Escola {
    private String[] alunos;
    private List<ArrayList> turma;
    private int qtdeTurmas;
    private int qtdeGrupos;
    private int qtdeNomes;

    
    public Escola() {
    }

    public Escola(String[] alunos) {
        this.alunos = alunos;
    }

    
    public String[] getAlunos() {
        return alunos;
    }

    public void setAlunos(String[] alunos) {
        this.alunos = alunos;
    }

    public List<ArrayList> getTurma() {
        return turma;
    }

    public void setTurma(List<ArrayList> turma) {
        this.turma = turma;
    }

    public int getQtdeTurmas() {
        return qtdeTurmas;
    }

    public void setQtdeTurmas(int qtdeTurmas) {
        this.qtdeTurmas = qtdeTurmas;
    }

    public int getQtdeGrupos() {
        return qtdeGrupos;
    }

    public void setQtdeGrupos(int qtdeGrupos) {
        this.qtdeGrupos = qtdeGrupos;
    }

    public int getQtdeNomes() {
        return qtdeNomes;
    }

    public void setQtdeNomes(int qtdeNomes) {
        this.qtdeNomes = qtdeNomes;
    }
    
    
    
}
