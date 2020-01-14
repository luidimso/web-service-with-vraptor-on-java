/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fila.repository;

import com.fila.entity.Fila;
import com.fila.entity.Viagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luidi Matheus
 */
public class FilaRepository{

    public List<Fila> todos() {
        List<Fila> filas = new ArrayList<>();
        List<Viagem> viagens1 = new ArrayList<>();
        List<Viagem> viagens2 = new ArrayList<>();
        
        Viagem viagem1 = new Viagem("Kai Souza Oliveira", "MNN-5115", "FINALIZADO", "Transportadora 1");
        Viagem viagem2 = new Viagem("Erick Cunha Goncalves", "MNE-8869", "EM ANDAMENTO", "Transportadora 2");
        Viagem viagem3 = new Viagem("Matheus Almeida Barbosa", "HVZ-9329", "EM ESPERA", "Transportadora 3");
        
        Viagem viagem4 = new Viagem("Julian Martins Castro", "LWQ-8634", "FINALIZADO", "Transportadora 1");
        Viagem viagem5 = new Viagem("Bruno Cavalcanti Barbosa", "IAB-8270", "EM ANDAMENTO", "Transportadora 2");
        Viagem viagem6 = new Viagem("Tiago Zazolo da Silva", "MPX-0026", "EM ESPERA", "Transportadora 3");
        
        viagens1.add(viagem1);
        viagens1.add(viagem2);
        viagens1.add(viagem3);
        
        viagens2.add(viagem4);
        viagens2.add(viagem5);
        viagens2.add(viagem6);
        
        Fila fila1 = new Fila("Fila 1", viagens1);
        Fila fila2 = new Fila("Fila 2", viagens2);
        
        filas.add(fila1);
        filas.add(fila2);
        
        return filas;
    }

}
