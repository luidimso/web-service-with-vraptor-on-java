/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fila.entity;

import java.util.List;
/**
 *
 * @author Luidi Matheus
 */

public class Fila {
    public String nome;
    public List<Viagem> viagens;
    
    public Fila(String nome, List<Viagem> viagens){
        this.nome = nome;
        this.viagens = viagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
